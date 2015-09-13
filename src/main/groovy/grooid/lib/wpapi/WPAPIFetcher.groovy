package grooid.lib.wpapi

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import grooid.lib.wpapi.volley.VolleySingleton
import grooid.lib.wpapi.volley.WPIAPIResponseRequest
import groovy.transform.CompileStatic



@CompileStatic
class WPAPIFetcher {

    static final String TAG = WPAPIFetcher.class.getSimpleName()

    void fetchPosts(Context ctx, String baseUrlStr, String type, Closure completion) {

        String urlStr = linkFor(baseUrlStr, type)

        def block = { error, objectNotation, total, totalPages, link ->
            if (completion) {
                completion(error, objectNotation, total, totalPages, link)
            }
        };
        fetchPostLink(ctx, urlStr, block)

    }

    String linkFor(String baseUrl, String type) {
        "${baseUrl}/wp-json/posts?type=${type}"
    }

    void fetchPostLink(Context ctx, String link, Closure completion) {

        WPIAPIResponseRequest wpapiRequest = new WPIAPIResponseRequest(Request.Method.GET, link,
                new Response.Listener<WPIAPIResponse>() {
                    @Override
                    public void onResponse(WPIAPIResponse response) {
                        completion(response.objectNotation, response.total, response.totalPages, response.path)
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "On error:" + error)
            }
        })
        // Add the request to the RequestQueue.
        VolleySingleton.getInstance(ctx).getRequestQueue().add(wpapiRequest)
    }
}