package grooid.lib.wpapi


import android.content.Context
import groovy.transform.CompileStatic

@CompileStatic
class WPAPIUseCase {
    String baseUrlStr
    WPAPIFetcher fetcher = new WPAPIFetcher()
    WPAPIPostBuilder postBuilder = new WPAPIPostBuilder()
    Closure returnPostsBlock
    Closure postsProcessingBlock
    List allposts = []
    Context ctx

    WPAPIUseCase(Context context) {
        this.ctx = context
    }

    void fetchAllPosts(String baseUrlStr, String type,  Closure customBuilderBlock, Closure completion) {
        this.baseUrlStr = baseUrlStr;
        this.returnPostsBlock = completion;

        this.postsProcessingBlock = { WPAPIPostBuilder postBuilder, int numberOfElementsAlreadyProcessed, String objectNotation, int total,  int totalPages, String link ->
              if(!objectNotation || !total || !totalPages) {
                return null;
              }

            List posts = (List) WPAPIPostBuilder.postsFromJSON(objectNotation,customBuilderBlock)

             WPAPIFetchResponse fetchResponse = new WPAPIFetchResponse()
             fetchResponse.elements = posts;
             fetchResponse.nextPath = (total > (numberOfElementsAlreadyProcessed + posts.size())) ? link : null;
             return fetchResponse;
        };
        fetchPostsForLink(this.fetcher.linkFor(baseUrlStr,type))
    }

    void fetchPostsForLink(String link) {

        def completion = { objectNotation, total, totalPages, linkStr ->
            if(postsProcessingBlock) {

                WPAPIFetchResponse fetchResponse = postsProcessingBlock(postBuilder, allposts.size(), objectNotation, total, totalPages, linkStr)
                allposts += fetchResponse?.elements;

                if(fetchResponse?.nextPath) {
                    String nextLink = "${baseUrlStr}${fetchResponse.nextPath}"
                    fetchPostsForLink(nextLink)

                } else {
                    if(returnPostsBlock) {
                        returnPostsBlock(allposts);
                    }
                    allposts = []

                }
            }
        };
        fetcher.fetchPostLink(ctx, link,completion)
    }
}