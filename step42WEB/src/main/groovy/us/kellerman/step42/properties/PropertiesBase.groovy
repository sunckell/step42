package us.kellerman.step42.properties

/**
 * Created by ckell on 9/23/15.
 *
 *  base calls to read in log4j properties file and do a little property prefixing
 *  magic if need be.
 */
class PropertiesBase {

    def properties = null
    def environment = null

    protected PropertiesBase(propertiesFileName){

    }
}
