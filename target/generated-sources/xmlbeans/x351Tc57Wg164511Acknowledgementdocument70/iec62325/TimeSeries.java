/*
 * XML Type:  TimeSeries
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325;


/**
 * An XML TimeSeries(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public interface TimeSeries extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TimeSeries.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("timeseriesceb8type");
    
    /**
     * Gets the "mRID" element
     */
    java.lang.String getMRID();
    
    /**
     * Gets (as xml) the "mRID" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString xgetMRID();
    
    /**
     * Sets the "mRID" element
     */
    void setMRID(java.lang.String mrid);
    
    /**
     * Sets (as xml) the "mRID" element
     */
    void xsetMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString mrid);
    
    /**
     * Gets the "version" element
     */
    java.lang.String getVersion();
    
    /**
     * Gets (as xml) the "version" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString xgetVersion();
    
    /**
     * True if has "version" element
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" element
     */
    void setVersion(java.lang.String version);
    
    /**
     * Sets (as xml) the "version" element
     */
    void xsetVersion(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString version);
    
    /**
     * Unsets the "version" element
     */
    void unsetVersion();
    
    /**
     * Gets array of all "InError_Period" elements
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] getInErrorPeriodArray();
    
    /**
     * Gets ith "InError_Period" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod getInErrorPeriodArray(int i);
    
    /**
     * Returns number of "InError_Period" element
     */
    int sizeOfInErrorPeriodArray();
    
    /**
     * Sets array of all "InError_Period" element
     */
    void setInErrorPeriodArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] inErrorPeriodArray);
    
    /**
     * Sets ith "InError_Period" element
     */
    void setInErrorPeriodArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod inErrorPeriod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InError_Period" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod insertNewInErrorPeriod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InError_Period" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod addNewInErrorPeriod();
    
    /**
     * Removes the ith "InError_Period" element
     */
    void removeInErrorPeriod(int i);
    
    /**
     * Gets array of all "Reason" elements
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] getReasonArray();
    
    /**
     * Gets ith "Reason" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason getReasonArray(int i);
    
    /**
     * Returns number of "Reason" element
     */
    int sizeOfReasonArray();
    
    /**
     * Sets array of all "Reason" element
     */
    void setReasonArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] reasonArray);
    
    /**
     * Sets ith "Reason" element
     */
    void setReasonArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason reason);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Reason" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason insertNewReason(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Reason" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason addNewReason();
    
    /**
     * Removes the ith "Reason" element
     */
    void removeReason(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries newInstance() {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
