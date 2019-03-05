/*
 * An XML document type.
 * Localname: ResponseMessage
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ResponseMessageDocument
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * A document containing one ResponseMessage(@http://iec.ch/TC57/2011/schema/message) element.
 *
 * This is a complex type.
 */
public interface ResponseMessageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseMessageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("responsemessage6d70doctype");
    
    /**
     * Gets the "ResponseMessage" element
     */
    ch.iec.tc57._2011.schema.message.ResponseMessageType getResponseMessage();
    
    /**
     * Sets the "ResponseMessage" element
     */
    void setResponseMessage(ch.iec.tc57._2011.schema.message.ResponseMessageType responseMessage);
    
    /**
     * Appends and returns a new empty "ResponseMessage" element
     */
    ch.iec.tc57._2011.schema.message.ResponseMessageType addNewResponseMessage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument newInstance() {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ResponseMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ResponseMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
