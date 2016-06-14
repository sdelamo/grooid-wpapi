package grooid.lib.wpapi;

class CustomBlockExample {
    final static String kImagen360 = "imagen_360"
    final static String kUrl = "url"
    final static String kEmail = "email"
    final static String kPhone = "phone"
    final static String kLatitude = "latitude"
    final static String kLongitude = "longitude"
    final static String kStreet = "street"
    final static String kRegion = "region"
    final static String kPostalCode = "postal_code"
    final static String kFacebook = "facebook"
    final static String kMinube = "minube"
    final static String kTwitter = "twitter"
    final static String kTuenti = "tuenti"
    final static String kToprural = "toprural"
    final static String kGooglePlus = "google_plus"
    final static String kCountryName = "countryname"
    final static String kLocality = "town"
    final static String kFax = "fax"
    final static String kGallery = "galeria"

    static customBuilderBlock = {
        if(it instanceof Map ) {
            Map dict = (Map)it
            Map returnDict = [:]
            Object obj = dict["acf"]
            if(obj instanceof Map) {
                Map acfDict = (Map) obj
                if(acfDict[kUrl]) {
                    returnDict[kUrl] = acfDict[kUrl]
                }
                if(acfDict[kEmail]) {
                    returnDict[kEmail]        = acfDict[kEmail]
                }
                if(acfDict[kPhone]) {
                    returnDict[kPhone]        = acfDict[kPhone]
                }
                if(acfDict[kLatitude]) {
                    returnDict[kLatitude]     = acfDict[kLatitude]
                }
                if(acfDict[kLongitude]) {
                    returnDict[kLongitude]    = acfDict[kLongitude]
                }
                if(acfDict[kStreet]) {
                    returnDict[kStreet]       = acfDict[kStreet]
                }
                if(acfDict[kLocality]) {
                    returnDict[kLocality] = acfDict[kLocality]
                }
                if(acfDict[kRegion]) {
                    returnDict[kRegion]       = acfDict[kRegion]
                }

                if(acfDict[kPostalCode]) {
                    returnDict[kPostalCode]  = acfDict[kPostalCode]
                }
                if(acfDict[kCountryName]) {
                    returnDict[kCountryName]  = acfDict[kCountryName]
                }

                if(acfDict[kToprural]) {
                    returnDict[kToprural]     = acfDict[kToprural]
                }
                if(acfDict[kFacebook]) {
                    returnDict[kFacebook]     = acfDict[kFacebook]
                }
                if(acfDict[kMinube]) {
                    returnDict[kMinube]       = acfDict[kMinube]
                }
                if(acfDict[kTwitter]) {
                    returnDict[kTwitter]      = acfDict[kTwitter]
                }
                if(acfDict[kTuenti]) {
                    returnDict[kTuenti]       = acfDict[kTuenti]
                }
                if(acfDict[kGooglePlus]) {
                    returnDict[kGooglePlus]  = acfDict[kGooglePlus]
                }
                if(acfDict[kFax]) {
                    returnDict[kFax]  = acfDict[kFax]
                }
                if(acfDict[kImagen360] && acfDict[kImagen360] instanceof String) {
                    returnDict[kImagen360]    = acfDict[kImagen360]
                }
                returnDict[kGallery] = WPAPIACFGalleryParser.extractGallery(acfDict, 'galeria')
            }

            return returnDict
        }
    }

}