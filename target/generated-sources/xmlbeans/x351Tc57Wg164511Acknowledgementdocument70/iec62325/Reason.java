/*
 * XML Type:  Reason
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325;


/**
 * An XML Reason(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public interface Reason extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reason.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("reasoncdd8type");
    
    /**
     * Gets the "code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString xgetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" element
     */
    void xsetCode(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString code);
    
    /**
     * Gets the "text" element
     */
    java.lang.String getText();
    
    /**
     * Gets (as xml) the "text" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString xgetText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(java.lang.String text);
    
    /**
     * Sets (as xml) the "text" element
     */
    void xsetText(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString text);
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason newInstance() {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
