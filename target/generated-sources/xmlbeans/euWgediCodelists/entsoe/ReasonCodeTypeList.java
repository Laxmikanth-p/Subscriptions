/*
 * XML Type:  ReasonCodeTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.ReasonCodeTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe;


/**
 * An XML ReasonCodeTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardReasonCodeTypeList
 *     euWgediCodelists.entsoe.LocalReasonCodeType
 */
public interface ReasonCodeTypeList extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReasonCodeTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("reasoncodetypelist53b7type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static euWgediCodelists.entsoe.ReasonCodeTypeList newValue(java.lang.Object obj) {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) type.newValue( obj ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList newInstance() {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.ReasonCodeTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.ReasonCodeTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
