package grooid.lib.wpapi

import groovy.transform.CompileStatic;
import groovy.json.JsonSlurper

@CompileStatic
public class WPAPIPostBuilder {

    static String kID = "ID"
    static String kTitle = "title"
    static String kStatus = "status"
    static String kType = "type"
    static String kAuthor = "author"
    static String kContent = "content"
    static String kParent = "parent"
    static String kLink = "link"
    static String kDate = "date"
    static String kModified = "modified"
    static String kFormat = "format"
    static String kSlug = "slug"
    static String kGuid = "guid"
    static String kExcerpt = "excerpt"
    static String kMenuOrder = "menuorder"
    static String kCommentStatus = "comment_tatus"
    static String kPingStatus = "ping_tatus"
    static String kSticky = "sticky"
    static String kDateTz = "date_tz"
    static String kDateGmt = "date_gmt"
    static String kModifiedGmt = "modified_gmt"
    static String kModifiedtz = "modifed_tz"
    static String kMeta = "meta"
    static String kTerm = "terms"
    static String kFeaturedImage = "featured_image"
    static String kSource = "source"
    static String kIsImage = "isimage"
    static String kAttachmentMeta = "attachment_meta"
    static String kAttachmentMetaWidth = "width"
    static String kAttachmentMetaHeight = "height"
    static String kAttachmentMetaFile = "file"
    static String kAttachmentMetaSizes = "sizes"
    static String kAttachmentMetaSizesFile = "file"
    static String kAttachmentMetaSizesWidth = "width"
    static String kAttachmentMetaSizesHeight = "eight"
    static String kAttachmentMetaSizesMimeType = "mime-type"
    static String kAttachmentMetaSizesUrl = "url"
    static String kAttachmentMetaSizesThumbnail = "thumbnail"
    static String kAttachmentMetaSizesMedium = "medium"
    static String kAttachmentMetaSizesPostThumbnail = "post-thubnail"
    static String kAttachmentMetaImageMetaAperture = "aperture"
    static String kAttachmentMetaImageMetaCredit = "redit"
    static String kAttachmentMetaImageMetaCamera = "camera"
    static String kAttachmentMetaImageMetaCaption = "caption"
    static String kAttachmentMetaImageMetaCreatedTimestamp = "created_timstamp"
    static String kAttachmentMetaImageMetaCopyright = "copyright"
    static String kAttachmentMetaImageMetaFocalLength = "focal_ength"
    static String kAttachmentMetaImageMetaIso = "iso"
    static String kAttachmentMetaImageMetaShutterSpeed = "shutterspeed"
    static String kAttachmentMetaImageMetaTitle = "title"
    static String kAttachmentMetaImageMetaOrientation = "orienation"

    WPAPIAuthorBuilder authorBuilder = new WPAPIAuthorBuilder()

    static List postsFromJSON(String objectNotation, Closure customBuilderBlock) {

        List mutableArr = []
        JsonSlurper jsonSlurper = new JsonSlurper()
        Object object = jsonSlurper.parseText(objectNotation)

        object.each { obj ->

            if(obj instanceof Map) {
                Map dict = (Map) obj;
                WPAPIPost post = new WPAPIPost()
                populateElementWithDict(post, dict)
                if (dict[kFeaturedImage]) {
                    if(dict[kFeaturedImage in Map]) {
                        post.featuredImage = parseAttachmentFromDict(dict[kFeaturedImage] as Map)
                    }
                }
                if(customBuilderBlock) {
                    post.custom = customBuilderBlock(dict)
                }
                mutableArr << post
            }
        }
        return mutableArr;
    }

    static WPAPIAttachment parseAttachmentFromDict(Map dict) {
        WPAPIAttachment att = new WPAPIAttachment()
        populateElementWithDict(att, dict)
        att.source = dict[kSource]
        att.isImage = (Boolean) dict[kIsImage]
        if (dict[kAttachmentMeta] && dict[kAttachmentMeta] in Map) {
            Map attachmentMetaDict = dict[kAttachmentMeta] as Map
            WPAPIAttachmentMeta attachmentMeta = new WPAPIAttachmentMeta()
            if (attachmentMetaDict[kAttachmentMetaWidth] && attachmentMetaDict[kAttachmentMetaWidth] in Integer) {
                attachmentMeta.width = (Integer) attachmentMetaDict[kAttachmentMetaWidth]
            }
            if (attachmentMetaDict[kAttachmentMetaHeight] && attachmentMetaDict[kAttachmentMetaHeight] in Integer) {
                attachmentMeta.height = (Integer) attachmentMetaDict[kAttachmentMetaHeight]
            }
            attachmentMeta.file = attachmentMetaDict[kAttachmentMetaFile]
            if (attachmentMetaDict[kAttachmentMetaSizes] && attachmentMetaDict[kAttachmentMetaSizes] in Map) {
                Map mutableDictionary = [:]
                Map attachmentMetaSizes = (Map) attachmentMetaDict[kAttachmentMetaSizes];
                attachmentMetaSizes.each { key, obj ->
                    if (obj && obj instanceof Map) {
                        WPAPIAttachmentMetaSize attachmentMetaSize = new WPAPIAttachmentMetaSize()
                        attachmentMetaSize.file = obj[kAttachmentMetaSizesFile]
                        attachmentMetaSize.width = (Integer) obj[kAttachmentMetaSizesWidth]
                        attachmentMetaSize.height = (Integer) obj[kAttachmentMetaSizesHeight]
                        attachmentMetaSize.mimeType = obj[kAttachmentMetaSizesMimeType]
                        attachmentMetaSize.url = obj[kAttachmentMetaSizesUrl]
                        mutableDictionary[key] = attachmentMetaSize
                    }
                }
                attachmentMeta.sizes = mutableDictionary;
            }
            att.attachmentMeta = attachmentMeta
        }
        return att;
    }


   static void populateElementWithDict (Object a, Object b)  {
        if(a in WPAPIElement && b in Map) {
            WPAPIElement el = (WPAPIElement) a
            Map dict = (Map) b
            el.identifier = (Integer) dict[kID]
            el.title = dict[kTitle]
            el.status = dict[kStatus]
            el.type = dict[kType]
            // Author
            el.content = dict[kContent]
            if(dict[kParent] in Integer) {
                el.parent = dict[kParent] as Integer
            }
            el.link = dict[kLink]
            // Date
            // Modified
            el.format = dict[kFormat]
            el.slug = dict[kSlug]
            el.guid = dict[kGuid]
            el.excerpt = dict[kExcerpt]
            // Menu Order
            // Comment status
        }
    }
}