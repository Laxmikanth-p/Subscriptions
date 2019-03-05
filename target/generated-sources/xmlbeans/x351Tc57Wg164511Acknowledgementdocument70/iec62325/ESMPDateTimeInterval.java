/*
 * XML Type:  ESMP_DateTimeInterval
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325;


/**
 * An XML ESMP_DateTimeInterval(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public interface ESMPDateTimeInterval extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESMPDateTimeInterval.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("esmpdatetimeinterval8650type");
    
    /**
     * Gets the "start" element
     */
    java.lang.String getStart();
    
    /**
     * Gets (as xml) the "start" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime xgetStart();
    
    /**
     * Sets the "start" element
     */
    void setStart(java.lang.String start);
    
    /**
     * Sets (as xml) the "start" element
     */
    void xsetStart(x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime start);
    
    /**
     * Gets the "end" element
     */
    java.lang.String getEnd();
    
    /**
     * Gets (as xml) the "end" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime xgetEnd();
    
    /**
     * Sets the "end" element
     */
    void setEnd(java.lang.String end);
    
    /**
     * Sets (as xml) the "end" element
     */
    void xsetEnd(x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime end);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval newInstance() {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}