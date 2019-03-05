/*
 * XML Type:  ObjectType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ObjectType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * An XML ObjectType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public interface ObjectType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("objecttype103btype");
    
    /**
     * Gets the "mRID" element
     */
    java.lang.String getMRID();
    
    /**
     * Gets (as xml) the "mRID" element
     */
    org.apache.xmlbeans.XmlString xgetMRID();
    
    /**
     * True if has "mRID" element
     */
    boolean isSetMRID();
    
    /**
     * Sets the "mRID" element
     */
    void setMRID(java.lang.String mrid);
    
    /**
     * Sets (as xml) the "mRID" element
     */
    void xsetMRID(org.apache.xmlbeans.XmlString mrid);
    
    /**
     * Unsets the "mRID" element
     */
    void unsetMRID();
    
    /**
     * Gets array of all "Name" elements
     */
    ch.iec.tc57._2011.schema.message.Name[] getNameArray();
    
    /**
     * Gets ith "Name" element
     */
    ch.iec.tc57._2011.schema.message.Name getNameArray(int i);
    
    /**
     * Returns number of "Name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "Name" element
     */
    void setNameArray(ch.iec.tc57._2011.schema.message.Name[] nameArray);
    
    /**
     * Sets ith "Name" element
     */
    void setNameArray(int i, ch.iec.tc57._2011.schema.message.Name name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    ch.iec.tc57._2011.schema.message.Name insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    ch.iec.tc57._2011.schema.message.Name addNewName();
    
    /**
     * Removes the ith "Name" element
     */
    void removeName(int i);
    
    /**
     * Gets the "objectType" element
     */
    java.lang.String getObjectType();
    
    /**
     * Gets (as xml) the "objectType" element
     */
    org.apache.xmlbeans.XmlString xgetObjectType();
    
    /**
     * True if has "objectType" element
     */
    boolean isSetObjectType();
    
    /**
     * Sets the "objectType" element
     */
    void setObjectType(java.lang.String objectType);
    
    /**
     * Sets (as xml) the "objectType" element
     */
    void xsetObjectType(org.apache.xmlbeans.XmlString objectType);
    
    /**
     * Unsets the "objectType" element
     */
    void unsetObjectType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.ObjectType newInstance() {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ObjectType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ObjectType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
