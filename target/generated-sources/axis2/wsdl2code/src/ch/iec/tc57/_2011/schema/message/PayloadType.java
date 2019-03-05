/*
 * XML Type:  PayloadType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.PayloadType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * An XML PayloadType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public interface PayloadType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PayloadType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("payloadtype783etype");
    
    /**
     * Gets the "OperationSet" element
     */
    ch.iec.tc57._2011.schema.message.OperationSet getOperationSet();
    
    /**
     * True if has "OperationSet" element
     */
    boolean isSetOperationSet();
    
    /**
     * Sets the "OperationSet" element
     */
    void setOperationSet(ch.iec.tc57._2011.schema.message.OperationSet operationSet);
    
    /**
     * Appends and returns a new empty "OperationSet" element
     */
    ch.iec.tc57._2011.schema.message.OperationSet addNewOperationSet();
    
    /**
     * Unsets the "OperationSet" element
     */
    void unsetOperationSet();
    
    /**
     * Gets the "Compressed" element
     */
    java.lang.String getCompressed();
    
    /**
     * Gets (as xml) the "Compressed" element
     */
    org.apache.xmlbeans.XmlString xgetCompressed();
    
    /**
     * True if has "Compressed" element
     */
    boolean isSetCompressed();
    
    /**
     * Sets the "Compressed" element
     */
    void setCompressed(java.lang.String compressed);
    
    /**
     * Sets (as xml) the "Compressed" element
     */
    void xsetCompressed(org.apache.xmlbeans.XmlString compressed);
    
    /**
     * Unsets the "Compressed" element
     */
    void unsetCompressed();
    
    /**
     * Gets array of all "ID" elements
     */
    ch.iec.tc57._2011.schema.message.PayloadType.ID[] getIDArray();
    
    /**
     * Gets ith "ID" element
     */
    ch.iec.tc57._2011.schema.message.PayloadType.ID getIDArray(int i);
    
    /**
     * Returns number of "ID" element
     */
    int sizeOfIDArray();
    
    /**
     * Sets array of all "ID" element
     */
    void setIDArray(ch.iec.tc57._2011.schema.message.PayloadType.ID[] idArray);
    
    /**
     * Sets ith "ID" element
     */
    void setIDArray(int i, ch.iec.tc57._2011.schema.message.PayloadType.ID id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ID" element
     */
    ch.iec.tc57._2011.schema.message.PayloadType.ID insertNewID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ID" element
     */
    ch.iec.tc57._2011.schema.message.PayloadType.ID addNewID();
    
    /**
     * Removes the ith "ID" element
     */
    void removeID(int i);
    
    /**
     * Gets the "Format" element
     */
    java.lang.String getFormat();
    
    /**
     * Gets (as xml) the "Format" element
     */
    org.apache.xmlbeans.XmlString xgetFormat();
    
    /**
     * True if has "Format" element
     */
    boolean isSetFormat();
    
    /**
     * Sets the "Format" element
     */
    void setFormat(java.lang.String format);
    
    /**
     * Sets (as xml) the "Format" element
     */
    void xsetFormat(org.apache.xmlbeans.XmlString format);
    
    /**
     * Unsets the "Format" element
     */
    void unsetFormat();
    
    /**
     * An XML ID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.PayloadType$ID.
     */
    public interface ID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("id90e7elemtype");
        
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
            public static ch.iec.tc57._2011.schema.message.PayloadType.ID newInstance() {
              return (ch.iec.tc57._2011.schema.message.PayloadType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.PayloadType.ID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.PayloadType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.PayloadType newInstance() {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.PayloadType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.PayloadType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
