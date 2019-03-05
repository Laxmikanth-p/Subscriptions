/*
 * XML Type:  OperationSet
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.OperationSet
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * An XML OperationSet(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public interface OperationSet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("operationset09d9type");
    
    /**
     * Gets the "enforceMsgSequence" element
     */
    boolean getEnforceMsgSequence();
    
    /**
     * Gets (as xml) the "enforceMsgSequence" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEnforceMsgSequence();
    
    /**
     * True if has "enforceMsgSequence" element
     */
    boolean isSetEnforceMsgSequence();
    
    /**
     * Sets the "enforceMsgSequence" element
     */
    void setEnforceMsgSequence(boolean enforceMsgSequence);
    
    /**
     * Sets (as xml) the "enforceMsgSequence" element
     */
    void xsetEnforceMsgSequence(org.apache.xmlbeans.XmlBoolean enforceMsgSequence);
    
    /**
     * Unsets the "enforceMsgSequence" element
     */
    void unsetEnforceMsgSequence();
    
    /**
     * Gets the "enforceTransactionalIntegrity" element
     */
    boolean getEnforceTransactionalIntegrity();
    
    /**
     * Gets (as xml) the "enforceTransactionalIntegrity" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEnforceTransactionalIntegrity();
    
    /**
     * True if has "enforceTransactionalIntegrity" element
     */
    boolean isSetEnforceTransactionalIntegrity();
    
    /**
     * Sets the "enforceTransactionalIntegrity" element
     */
    void setEnforceTransactionalIntegrity(boolean enforceTransactionalIntegrity);
    
    /**
     * Sets (as xml) the "enforceTransactionalIntegrity" element
     */
    void xsetEnforceTransactionalIntegrity(org.apache.xmlbeans.XmlBoolean enforceTransactionalIntegrity);
    
    /**
     * Unsets the "enforceTransactionalIntegrity" element
     */
    void unsetEnforceTransactionalIntegrity();
    
    /**
     * Gets array of all "Operation" elements
     */
    ch.iec.tc57._2011.schema.message.OperationType[] getOperationArray();
    
    /**
     * Gets ith "Operation" element
     */
    ch.iec.tc57._2011.schema.message.OperationType getOperationArray(int i);
    
    /**
     * Returns number of "Operation" element
     */
    int sizeOfOperationArray();
    
    /**
     * Sets array of all "Operation" element
     */
    void setOperationArray(ch.iec.tc57._2011.schema.message.OperationType[] operationArray);
    
    /**
     * Sets ith "Operation" element
     */
    void setOperationArray(int i, ch.iec.tc57._2011.schema.message.OperationType operation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Operation" element
     */
    ch.iec.tc57._2011.schema.message.OperationType insertNewOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Operation" element
     */
    ch.iec.tc57._2011.schema.message.OperationType addNewOperation();
    
    /**
     * Removes the ith "Operation" element
     */
    void removeOperation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.OperationSet newInstance() {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.OperationSet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.OperationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
