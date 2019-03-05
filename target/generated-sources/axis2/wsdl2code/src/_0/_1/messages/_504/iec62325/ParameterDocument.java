/*
 * An XML document type.
 * Localname: Parameter
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.ParameterDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325;


/**
 * A document containing one Parameter(@urn:iec62325.504:messages:1:0) element.
 *
 * This is a complex type.
 */
public interface ParameterDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("parameter207cdoctype");
    
    /**
     * Gets the "Parameter" element
     */
    _0._1.messages._504.iec62325.ParameterDocument.Parameter getParameter();
    
    /**
     * Sets the "Parameter" element
     */
    void setParameter(_0._1.messages._504.iec62325.ParameterDocument.Parameter parameter);
    
    /**
     * Appends and returns a new empty "Parameter" element
     */
    _0._1.messages._504.iec62325.ParameterDocument.Parameter addNewParameter();
    
    /**
     * An XML Parameter(@urn:iec62325.504:messages:1:0).
     *
     * This is a complex type.
     */
    public interface Parameter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("parameterd431elemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "value" element
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" element
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * True if has "value" element
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" element
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" element
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * Unsets the "value" element
         */
        void unsetValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static _0._1.messages._504.iec62325.ParameterDocument.Parameter newInstance() {
              return (_0._1.messages._504.iec62325.ParameterDocument.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static _0._1.messages._504.iec62325.ParameterDocument.Parameter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (_0._1.messages._504.iec62325.ParameterDocument.Parameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.messages._504.iec62325.ParameterDocument newInstance() {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.messages._504.iec62325.ParameterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.messages._504.iec62325.ParameterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.messages._504.iec62325.ParameterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
