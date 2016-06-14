package grooid.lib.wpapi

import spock.lang.Specification

class WPAPIPostBuilderSpec extends Specification {

    def "test postsFormJSON"() {
    setup:

       def json = '[{"ID":1789,"title":"Parroquia de Santa Eulalia de M\\u00e9rida","status":"publish","type":"poi","author":{"ID":3,"username":"pgpernia","name":"Pablo Garcia Pernia","first_name":"Pablo","last_name":"Garcia Pernia","nickname":"pgpernia","slug":"pgpernia","URL":"","avatar":"http:\\/\\/1.gravatar.com\\/avatar\\/d6d42655d72d74ef96ebd4d178a889ca?s=96","description":"","registered":"2015-05-03T18:15:08+00:00","meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/3","archives":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/3\\/posts"}},"acf":false},"content":"<p>Director: D\\u00f1a. DoloresTorres Gonz\\u00e1lez<\\/p>\\n","parent":null,"link":"http:\\/\\/appfadeta.com\\/poi\\/parroquia-de-santa-eulalia-de-merida\\/","date":"2015-06-15T17:50:42","modified":"2015-06-16T05:29:16","format":"standard","slug":"parroquia-de-santa-eulalia-de-merida","guid":"http:\\/\\/appfadeta.com\\/?post_type=poi&#038;p=1789","excerpt":"<p>Director: D\\u00f1a. DoloresTorres Gonz\\u00e1lez<\\/p>\\n","menu_order":0,"comment_status":"closed","ping_status":"closed","sticky":false,"date_tz":"UTC","date_gmt":"2015-06-15T17:50:42","modified_tz":"UTC","modified_gmt":"2015-06-16T05:29:16","meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1789","author":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/3","collection":"http:\\/\\/appfadeta.com\\/wp-json\\/posts","replies":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1789\\/comments","version-history":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1789\\/revisions"}},"acf":{"url":"","email":"","phone":"949 27 1023","latitude":"40.5724362","longitude":"-3.1629401","street":"C\\/ La Luna, 5","town":"Chiloeches","region":"","postal_code":"19160","countryname":"Espa\\u00f1a","toprural":"","facebook":"","twitter":"","tuenti":"","minube":"","google_plus":"","galeria":[{"id":1791,"alt":"","title":"Parroquia-de-Santa-Eulalia-de-Merida","caption":"","description":"","mime_type":"image\\/jpeg","url":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/Parroquia-de-Santa-Eulalia-de-Merida.jpg","width":720,"height":1280,"sizes":{"thumbnail":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/Parroquia-de-Santa-Eulalia-de-Merida-150x150.jpg","thumbnail-width":150,"thumbnail-height":150,"medium":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/Parroquia-de-Santa-Eulalia-de-Merida-169x300.jpg","medium-width":169,"medium-height":300,"large":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/Parroquia-de-Santa-Eulalia-de-Merida.jpg","large-width":660,"large-height":1173,"post-thumbnail":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/Parroquia-de-Santa-Eulalia-de-Merida-720x510.jpg","post-thumbnail-width":720,"post-thumbnail-height":510}}],"imagen_360":false},"terms":[]},{"ID":1776,"title":"PLAZA DE LA ALCARRIA","status":"publish","type":"poi","author":{"ID":2,"username":"jlbermudez","name":"Juan Luis Bermudez","first_name":"Juan Luis","last_name":"Bermudez","nickname":"jlbermudez","slug":"jlbermudez","URL":"","avatar":"http:\\/\\/1.gravatar.com\\/avatar\\/143294b2ef86b523b7c0944a47a67dec?s=96","description":"","registered":"2015-05-03T18:14:28+00:00","meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/2","archives":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/2\\/posts"}},"acf":false},"content":"<p><a href=\\"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/QR_CM05_IMG.png\\"><img class=\\"alignnone  wp-image-1767\\" src=\\"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/QR_CM05_IMG-300x125.png\\" alt=\\"QR_CM05_IMG\\" width=\\"481\\" height=\\"199\\" \\/><\\/a><\\/p>\\n","parent":null,"link":"http:\\/\\/appfadeta.com\\/poi\\/plaza-de-la-alcarria\\/","date":"2015-06-10T11:48:07","modified":"2015-06-10T12:44:37","format":"standard","slug":"plaza-de-la-alcarria","guid":"http:\\/\\/appfadeta.com\\/?post_type=poi&#038;p=1776","excerpt":null,"menu_order":0,"comment_status":"closed","ping_status":"closed","sticky":false,"date_tz":"UTC","date_gmt":"2015-06-10T11:48:07","modified_tz":"UTC","modified_gmt":"2015-06-10T12:44:37","meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1776","author":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/2","collection":"http:\\/\\/appfadeta.com\\/wp-json\\/posts","replies":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1776\\/comments","version-history":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1776\\/revisions"}},"acf":{"url":"","email":"","phone":"+34630513892","latitude":"","longitude":"","street":"","town":"GUADALAJARA","region":"SPAIN","postal_code":"19005","countryname":"Espa\\u00f1a","toprural":"","facebook":"","twitter":"","tuenti":"","minube":"","google_plus":"","galeria":"","imagen_360":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/R00100081.jpg"},"terms":[]},{"ID":1744,"title":"PE\\u00d1A HUEVA","status":"publish","type":"poi","author":{"ID":2,"username":"jlbermudez","name":"Juan Luis Bermudez","first_name":"Juan Luis","last_name":"Bermudez","nickname":"jlbermudez","slug":"jlbermudez","URL":"","avatar":"http:\\/\\/1.gravatar.com\\/avatar\\/143294b2ef86b523b7c0944a47a67dec?s=96","description":"","registered":"2015-05-03T18:14:28+00:00","meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/2","archives":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/2\\/posts"}},"acf":false},"content":"<p>SUBIR A LA PE\\u00d1A ES BONITO<\\/p>\\n","parent":null,"link":"http:\\/\\/appfadeta.com\\/poi\\/pena-hueva\\/","date":"2015-05-05T16:58:04","modified":"2015-06-08T06:12:10","format":"standard","slug":"pena-hueva","guid":"http:\\/\\/appfadeta.com\\/?post_type=poi&#038;p=1744","excerpt":"<p>SUBIR A LA PE\\u00d1A ES BONITO<\\/p>\\n","menu_order":0,"comment_status":"closed","ping_status":"closed","sticky":false,"date_tz":"UTC","date_gmt":"2015-05-05T16:58:04","modified_tz":"UTC","modified_gmt":"2015-06-08T06:12:10","meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1744","author":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/2","collection":"http:\\/\\/appfadeta.com\\/wp-json\\/posts","replies":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1744\\/comments","version-history":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1744\\/revisions"}},"acf":{"url":"","email":"","phone":"","latitude":"3.12","longitude":"40.62","street":"","town":"","region":"","postal_code":"","countryname":"","toprural":"","facebook":"","twitter":"","tuenti":"","minube":"","google_plus":"","galeria":[{"id":1449,"alt":"","title":"place97-433","caption":"","description":"","mime_type":"image\\/jpeg","url":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/place97-433.jpg","width":279,"height":196,"sizes":{"thumbnail":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/place97-433-150x150.jpg","thumbnail-width":150,"thumbnail-height":150,"medium":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/place97-433.jpg","medium-width":279,"medium-height":196,"large":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/place97-433.jpg","large-width":279,"large-height":196,"post-thumbnail":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/place97-433.jpg","post-thumbnail-width":279,"post-thumbnail-height":196}}],"imagen_360":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/R0010002.jpg"},"terms":[]}]'

    when:
        Closure block = (Closure) CustomBlockExample.customBuilderBlock
        def posts = WPAPIPostBuilder.postsFromJSON(json, block).sort { a,b -> b.identifier <=> a.identifier }

    then:
        posts
        posts.size() == 3
        posts[0].identifier == 1789
        posts[0].title == "Parroquia de Santa Eulalia de M\u00e9rida"
        posts[0].status == "publish"
        posts[0].type == "poi"
//


//    "author":{"ID":3,
//        "username":"pgpernia",
//        "name":"Pablo Garcia Pernia",
//        "first_name":"Pablo",
//        "last_name":"Garcia Pernia",
//        "nickname":"pgpernia",
//        "slug":"pgpernia",
//        "URL":"",
//        "avatar":"http:\\/\\/1.gravatar.com\\/avatar\\/d6d42655d72d74ef96ebd4d178a889ca?s=96",
//        "description":"",
//        "registered":"2015-05-03T18:15:08+00:00",
//        "meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/3",
//            "archives":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/3\\/posts"}},
//        "acf":false},
      //posts[0].content == "<p>Director: D\\u00f1a. DoloresTorres Gonz\\u00e1lez<\\/p>\\n"
      posts[0].parent == null
//    "link":"http:\\/\\/appfadeta.com\\/poi\\/parroquia-de-santa-eulalia-de-merida\\/",
//    "date":"2015-06-15T17:50:42",
//    "modified":"2015-06-16T05:29:16",
//    "format":"standard",
//    "slug":"parroquia-de-santa-eulalia-de-merida",
//    "guid":"http:\\/\\/appfadeta.com\\/?post_type=poi&#038;p=1789",
//    "excerpt":"<p>Director: D\\u00f1a. DoloresTorres Gonz\\u00e1lez<\\/p>\\n",
//    "menu_order":0,
//    "comment_status":"closed",
//    "ping_status":"closed",
//    "sticky":false,
//    "date_tz":"UTC",
//    "date_gmt":"2015-06-15T17:50:42",
//    "modified_tz":"UTC",
//    "modified_gmt":"2015-06-16T05:29:16",
//    "meta":{"links":{"self":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1789",
//        "author":"http:\\/\\/appfadeta.com\\/wp-json\\/users\\/3",
//        "collection":"http:\\/\\/appfadeta.com\\/wp-json\\/posts",
//        "replies":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1789\\/comments",
//        "version-history":"http:\\/\\/appfadeta.com\\/wp-json\\/posts\\/1789\\/revisions"}},
//    "acf":{"url":"",
//        "email":"",

    posts[0].custom.phone == "949 27 1023"
    posts[0].custom.latitude=="40.5724362"
    posts[0].custom.longitude=="-3.1629401"
    posts[0].custom.street=="C/ La Luna, 5"
    posts[0].custom.town=="Chiloeches"
    posts[0].custom.region==null
    posts[0].custom.postal_code=="19160"
    posts[0].custom.countryname=="España"
    posts[0].custom.toprural==null
    posts[0].custom.facebook==null
    posts[0].custom.twitter==null
    posts[0].custom.tuenti==null
    posts[0].custom.galeria instanceof List
    ((List)posts[0].custom.galeria).size() == 1
    ((List)posts[0].custom.galeria)[0]  instanceof WPAPIACFAGalleryImage

//        "minube":"",
//        "google_plus":"",
//        "galeria":[{"id":1791,
//                       "alt":"",
//                       "title":"Parroquia-de-Santa-Eulalia-de-Merida",
//                       "caption":"",
//                       "description":"",
//                       "mime_type":"image\\/jpeg",
//                       "url":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/Parroquia-de-Santa-Eulalia-de-Merida.jpg",
//                       "width":720,
//                       "height":1280,
//                       "sizes":{

    ((WPAPIACFAGalleryImage)((List)posts[0].custom.galeria)[0]).sizes.thumbnail =="http://appfadeta.com/wp-content/uploads/Parroquia-de-Santa-Eulalia-de-Merida-150x150.jpg"
//                "thumbnail-width":150,
//                "thumbnail-height":150,
    ((WPAPIACFAGalleryImage)((List)posts[0].custom.galeria)[0]).sizes.medium =="http://appfadeta.com/wp-content/uploads/Parroquia-de-Santa-Eulalia-de-Merida-169x300.jpg"
//                "medium-width":169,
//                "medium-height":300,
    ((WPAPIACFAGalleryImage)((List)posts[0].custom.galeria)[0]).sizes.large =="http://appfadeta.com/wp-content/uploads/Parroquia-de-Santa-Eulalia-de-Merida.jpg"
//                "large-width":660,
//                "large-height":1173,
//                "post-thumbnail":"http:\\/\\/appfadeta.com\\/wp-content\\/uploads\\/Parroquia-de-Santa-Eulalia-de-Merida-720x510.jpg",
//                "post-thumbnail-width":720,
//                "post-thumbnail-height":510}}],
//        "imagen_360":false},
//    "terms":[]}

    }
}