/*
 * An XML document type.
 * Localname: ParameterList
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.ParameterListDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325;


/**
 * A document containing one ParameterList(@urn:iec62325.504:messages:1:0) element.
 *
 * This is a complex type.
 */
public interface ParameterListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC3813994560026AD5430C93CC4F259D").resolveHandle("parameterlistccbadoctype");
    
    /**
     * Gets the "ParameterList" element
     */
    _0._1.messages._504.iec62325.ParameterListDocument.ParameterList getParameterList();
    
    /**
     * Sets the "ParameterList" element
     */
    void setParameterList(_0._1.messages._504.iec62325.ParameterListDocument.ParameterList parameterList);
    
    /**
     * Appends and returns a new empty "ParameterList" element
     */
    _0._1.messages._504.iec62325.ParameterListDocument.ParameterList addNewParameterList();
    
    /**
     * An XML ParameterList(@urn:iec62325.504:messages:1:0).
     *
     * This is a complex type.
     */
    public interface ParameterList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC3813994560026AD5430C93CC4F259D").resolveHandle("parameterlista5adelemtype");
        
        /**
         * Gets array of all "Parameter" elements
         */
        _0._1.messages._504.iec62325.ParameterDocument.Parameter[] getParameterArray();
        
        /**
         * Gets ith "Parameter" element
         */
        _0._1.messages._504.iec62325.ParameterDocument.Parameter getParameterArray(int i);
        
        /**
         * Returns number of "Parameter" element
         */
        int sizeOfParameterArray();
        
        /**
         * Sets array of all "Parameter" element
         */
        void setParameterArray(_0._1.messages._504.iec62325.ParameterDocument.Parameter[] parameterArray);
        
        /**
         * Sets ith "Parameter" element
         */
        void setParameterArray(int i, _0._1.messages._504.iec62325.ParameterDocument.Parameter parameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
         */
        _0._1.messages._504.iec62325.ParameterDocument.Parameter insertNewParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
         */
        _0._1.messages._504.iec62325.ParameterDocument.Parameter addNewParameter();
        
        /**
         * Removes the ith "Parameter" element
         */
        void removeParameter(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static _0._1.messages._504.iec62325.ParameterListDocument.ParameterList newInstance() {
              return (_0._1.messages._504.iec62325.ParameterListDocument.ParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static _0._1.messages._504.iec62325.ParameterListDocument.ParameterList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (_0._1.messages._504.iec62325.ParameterListDocument.ParameterList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.messages._504.iec62325.ParameterListDocument newInstance() {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.messages._504.iec62325.ParameterListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.messages._504.iec62325.ParameterListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
