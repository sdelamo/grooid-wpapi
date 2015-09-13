package grooid.lib.wpapi

import spock.lang.Specification

class WPAPIResponseLinkSpec extends Specification {


    def "test extractResponseLinksFromString"() {

        setup:
            def fixture = '</wp-json/posts?type=alojamiento&page=2>; rel="next", <http://appfadeta.com/wp-json/posts/1738>; rel="item"; title="PARADOR 360", <http://appfadeta.com/wp-json/posts/1470>; rel="item"; title="Posada Los Cuatro Caños", <http://appfadeta.com/wp-json/posts/1461>; rel="item"; title="Pajaro Bobo", <http://appfadeta.com/wp-json/posts/1458>; rel="item"; title="Molingordo", <http://appfadeta.com/wp-json/posts/1453>; rel="item"; title="LAS RANAS CASA RURAL", <http://appfadeta.com/wp-json/posts/1450>; rel="item"; title="Las Hondonadas", <http://appfadeta.com/wp-json/posts/1445>; rel="item"; title="Las Herraduras", <http://appfadeta.com/wp-json/posts/1440>; rel="item"; title="La Ventana de Tejera Negra", <http://appfadeta.com/wp-json/posts/1430>; rel="item"; title="La Trucha Feliz", <http://appfadeta.com/wp-json/posts/1424>; rel="item"; title="La TravesaÃ±a Casa Rural"'

        when:
            def responseLinks = WPAPIResponseLink.extractResponseLinksFromString(fixture)

        then:
            responseLinks
            11 == responseLinks.size()

        when:
            String result = WPAPIResponseLink.nextPathForResponseLinks(responseLinks)

        then:
            "/wp-json/posts?type=alojamiento&page=2" == result
    }
}