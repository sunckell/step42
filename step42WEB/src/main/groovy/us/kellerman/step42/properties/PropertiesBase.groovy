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
        try {
            ClassLoader cl       = PropertiesBase.class.getClassLoader();
            InputStream inStream = cl.getResourceAsStream(propertiesFileName);
            properties           = new Properties();
            properties.load(inStream);
            inStream.close();
        }catch(Exception ex) {
            throw new RuntimeException("GovPropertiesBase.GovPropertiesBase() Failed to load property file " + propertiesFileName + ".", ex);
        }

    }
}
