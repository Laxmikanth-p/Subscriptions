/*
 * XML Type:  RequestType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.RequestType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * An XML RequestType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public interface RequestType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("requesttype309dtype");
    
    /**
     * Gets the "StartTime" element
     */
    java.util.Calendar getStartTime();
    
    /**
     * Gets (as xml) the "StartTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetStartTime();
    
    /**
     * True if has "StartTime" element
     */
    boolean isSetStartTime();
    
    /**
     * Sets the "StartTime" element
     */
    void setStartTime(java.util.Calendar startTime);
    
    /**
     * Sets (as xml) the "StartTime" element
     */
    void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime);
    
    /**
     * Unsets the "StartTime" element
     */
    void unsetStartTime();
    
    /**
     * Gets the "EndTime" element
     */
    java.util.Calendar getEndTime();
    
    /**
     * Gets (as xml) the "EndTime" element
     */
    org.apache.xmlbeans.XmlDateTime xgetEndTime();
    
    /**
     * True if has "EndTime" element
     */
    boolean isSetEndTime();
    
    /**
     * Sets the "EndTime" element
     */
    void setEndTime(java.util.Calendar endTime);
    
    /**
     * Sets (as xml) the "EndTime" element
     */
    void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime);
    
    /**
     * Unsets the "EndTime" element
     */
    void unsetEndTime();
    
    /**
     * Gets array of all "Option" elements
     */
    ch.iec.tc57._2011.schema.message.OptionType[] getOptionArray();
    
    /**
     * Gets ith "Option" element
     */
    ch.iec.tc57._2011.schema.message.OptionType getOptionArray(int i);
    
    /**
     * Returns number of "Option" element
     */
    int sizeOfOptionArray();
    
    /**
     * Sets array of all "Option" element
     */
    void setOptionArray(ch.iec.tc57._2011.schema.message.OptionType[] optionArray);
    
    /**
     * Sets ith "Option" element
     */
    void setOptionArray(int i, ch.iec.tc57._2011.schema.message.OptionType option);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Option" element
     */
    ch.iec.tc57._2011.schema.message.OptionType insertNewOption(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Option" element
     */
    ch.iec.tc57._2011.schema.message.OptionType addNewOption();
    
    /**
     * Removes the ith "Option" element
     */
    void removeOption(int i);
    
    /**
     * Gets array of all "ID" elements
     */
    ch.iec.tc57._2011.schema.message.RequestType.ID[] getIDArray();
    
    /**
     * Gets ith "ID" element
     */
    ch.iec.tc57._2011.schema.message.RequestType.ID getIDArray(int i);
    
    /**
     * Returns number of "ID" element
     */
    int sizeOfIDArray();
    
    /**
     * Sets array of all "ID" element
     */
    void setIDArray(ch.iec.tc57._2011.schema.message.RequestType.ID[] idArray);
    
    /**
     * Sets ith "ID" element
     */
    void setIDArray(int i, ch.iec.tc57._2011.schema.message.RequestType.ID id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ID" element
     */
    ch.iec.tc57._2011.schema.message.RequestType.ID insertNewID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ID" element
     */
    ch.iec.tc57._2011.schema.message.RequestType.ID addNewID();
    
    /**
     * Removes the ith "ID" element
     */
    void removeID(int i);
    
    /**
     * An XML ID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.RequestType$ID.
     */
    public interface ID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("id4946elemtype");
        
        /**
         * Gets the "idType" attribute
         */
        java.lang.String getIdType();
        
        /**
         * Gets (as xml) the "idType" attribute
         */
        org.apache.xmlbeans.XmlString xgetIdType();
        
        /**
         * True if has "idType" attribute
         */
        boolean isSetIdType();
        
        /**
         * Sets the "idType" attribute
         */
        void setIdType(java.lang.String idType);
        
        /**
         * Sets (as xml) the "idType" attribute
         */
        void xsetIdType(org.apache.xmlbeans.XmlString idType);
        
        /**
         * Unsets the "idType" attribute
         */
        void unsetIdType();
        
        /**
         * Gets the "idAuthority" attribute
         */
        java.lang.String getIdAuthority();
        
        /**
         * Gets (as xml) the "idAuthority" attribute
         */
        org.apache.xmlbeans.XmlString xgetIdAuthority();
        
        /**
         * True if has "idAuthority" attribute
         */
        boolean isSetIdAuthority();
        
        /**
         * Sets the "idAuthority" attribute
         */
        void setIdAuthority(java.lang.String idAuthority);
        
        /**
         * Sets (as xml) the "idAuthority" attribute
         */
        void xsetIdAuthority(org.apache.xmlbeans.XmlString idAuthority);
        
        /**
         * Unsets the "idAuthority" attribute
         */
        void unsetIdAuthority();
        
        /**
         * Gets the "kind" attribute
         */
        ch.iec.tc57._2011.schema.message.IDKindType.Enum getKind();
        
        /**
         * Gets (as xml) the "kind" attribute
         */
        ch.iec.tc57._2011.schema.message.IDKindType xgetKind();
        
        /**
         * True if has "kind" attribute
         */
        boolean isSetKind();
        
        /**
         * Sets the "kind" attribute
         */
        void setKind(ch.iec.tc57._2011.schema.message.IDKindType.Enum kind);
        
        /**
         * Sets (as xml) the "kind" attribute
         */
        void xsetKind(ch.iec.tc57._2011.schema.message.IDKindType kind);
        
        /**
         * Unsets the "kind" attribute
         */
        void unsetKind();
        
        /**
         * Gets the "objectType" attribute
         */
        java.lang.String getObjectType();
        
        /**
         * Gets (as xml) the "objectType" attribute
         */
        org.apache.xmlbeans.XmlString xgetObjectType();
        
        /**
         * True if has "objectType" attribute
         */
        boolean isSetObjectType();
        
        /**
         * Sets the "objectType" attribute
         */
        void setObjectType(java.lang.String objectType);
        
        /**
         * Sets (as xml) the "objectType" attribute
         */
        void xsetObjectType(org.apache.xmlbeans.XmlString objectType);
        
        /**
         * Unsets the "objectType" attribute
         */
        void unsetObjectType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static ch.iec.tc57._2011.schema.message.RequestType.ID newInstance() {
              return (ch.iec.tc57._2011.schema.message.RequestType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.RequestType.ID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.RequestType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.RequestType newInstance() {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.RequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
