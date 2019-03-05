/*
 * XML Type:  Acknowledgement_MarketDocument
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325;


/**
 * An XML Acknowledgement_MarketDocument(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public interface AcknowledgementMarketDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AcknowledgementMarketDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("acknowledgementmarketdocument9710type");
    
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
     * Gets the "createdDateTime" element
     */
    java.util.Calendar getCreatedDateTime();
    
    /**
     * Gets (as xml) the "createdDateTime" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime xgetCreatedDateTime();
    
    /**
     * Sets the "createdDateTime" element
     */
    void setCreatedDateTime(java.util.Calendar createdDateTime);
    
    /**
     * Sets (as xml) the "createdDateTime" element
     */
    void xsetCreatedDateTime(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime createdDateTime);
    
    /**
     * Gets the "sender_MarketParticipant.mRID" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString getSenderMarketParticipantMRID();
    
    /**
     * Sets the "sender_MarketParticipant.mRID" element
     */
    void setSenderMarketParticipantMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString senderMarketParticipantMRID);
    
    /**
     * Appends and returns a new empty "sender_MarketParticipant.mRID" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString addNewSenderMarketParticipantMRID();
    
    /**
     * Gets the "sender_MarketParticipant.marketRole.type" element
     */
    java.lang.String getSenderMarketParticipantMarketRoleType();
    
    /**
     * Gets (as xml) the "sender_MarketParticipant.marketRole.type" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString xgetSenderMarketParticipantMarketRoleType();
    
    /**
     * Sets the "sender_MarketParticipant.marketRole.type" element
     */
    void setSenderMarketParticipantMarketRoleType(java.lang.String senderMarketParticipantMarketRoleType);
    
    /**
     * Sets (as xml) the "sender_MarketParticipant.marketRole.type" element
     */
    void xsetSenderMarketParticipantMarketRoleType(x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString senderMarketParticipantMarketRoleType);
    
    /**
     * Gets the "receiver_MarketParticipant.mRID" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString getReceiverMarketParticipantMRID();
    
    /**
     * Sets the "receiver_MarketParticipant.mRID" element
     */
    void setReceiverMarketParticipantMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString receiverMarketParticipantMRID);
    
    /**
     * Appends and returns a new empty "receiver_MarketParticipant.mRID" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString addNewReceiverMarketParticipantMRID();
    
    /**
     * Gets the "receiver_MarketParticipant.marketRole.type" element
     */
    java.lang.String getReceiverMarketParticipantMarketRoleType();
    
    /**
     * Gets (as xml) the "receiver_MarketParticipant.marketRole.type" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString xgetReceiverMarketParticipantMarketRoleType();
    
    /**
     * True if has "receiver_MarketParticipant.marketRole.type" element
     */
    boolean isSetReceiverMarketParticipantMarketRoleType();
    
    /**
     * Sets the "receiver_MarketParticipant.marketRole.type" element
     */
    void setReceiverMarketParticipantMarketRoleType(java.lang.String receiverMarketParticipantMarketRoleType);
    
    /**
     * Sets (as xml) the "receiver_MarketParticipant.marketRole.type" element
     */
    void xsetReceiverMarketParticipantMarketRoleType(x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString receiverMarketParticipantMarketRoleType);
    
    /**
     * Unsets the "receiver_MarketParticipant.marketRole.type" element
     */
    void unsetReceiverMarketParticipantMarketRoleType();
    
    /**
     * Gets the "received_MarketDocument.mRID" element
     */
    java.lang.String getReceivedMarketDocumentMRID();
    
    /**
     * Gets (as xml) the "received_MarketDocument.mRID" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString xgetReceivedMarketDocumentMRID();
    
    /**
     * True if has "received_MarketDocument.mRID" element
     */
    boolean isSetReceivedMarketDocumentMRID();
    
    /**
     * Sets the "received_MarketDocument.mRID" element
     */
    void setReceivedMarketDocumentMRID(java.lang.String receivedMarketDocumentMRID);
    
    /**
     * Sets (as xml) the "received_MarketDocument.mRID" element
     */
    void xsetReceivedMarketDocumentMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString receivedMarketDocumentMRID);
    
    /**
     * Unsets the "received_MarketDocument.mRID" element
     */
    void unsetReceivedMarketDocumentMRID();
    
    /**
     * Gets the "received_MarketDocument.revisionNumber" element
     */
    java.lang.String getReceivedMarketDocumentRevisionNumber();
    
    /**
     * Gets (as xml) the "received_MarketDocument.revisionNumber" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString xgetReceivedMarketDocumentRevisionNumber();
    
    /**
     * True if has "received_MarketDocument.revisionNumber" element
     */
    boolean isSetReceivedMarketDocumentRevisionNumber();
    
    /**
     * Sets the "received_MarketDocument.revisionNumber" element
     */
    void setReceivedMarketDocumentRevisionNumber(java.lang.String receivedMarketDocumentRevisionNumber);
    
    /**
     * Sets (as xml) the "received_MarketDocument.revisionNumber" element
     */
    void xsetReceivedMarketDocumentRevisionNumber(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString receivedMarketDocumentRevisionNumber);
    
    /**
     * Unsets the "received_MarketDocument.revisionNumber" element
     */
    void unsetReceivedMarketDocumentRevisionNumber();
    
    /**
     * Gets the "received_MarketDocument.type" element
     */
    java.lang.String getReceivedMarketDocumentType();
    
    /**
     * Gets (as xml) the "received_MarketDocument.type" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString xgetReceivedMarketDocumentType();
    
    /**
     * True if has "received_MarketDocument.type" element
     */
    boolean isSetReceivedMarketDocumentType();
    
    /**
     * Sets the "received_MarketDocument.type" element
     */
    void setReceivedMarketDocumentType(java.lang.String receivedMarketDocumentType);
    
    /**
     * Sets (as xml) the "received_MarketDocument.type" element
     */
    void xsetReceivedMarketDocumentType(x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString receivedMarketDocumentType);
    
    /**
     * Unsets the "received_MarketDocument.type" element
     */
    void unsetReceivedMarketDocumentType();
    
    /**
     * Gets the "received_MarketDocument.title" element
     */
    java.lang.String getReceivedMarketDocumentTitle();
    
    /**
     * Gets (as xml) the "received_MarketDocument.title" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString xgetReceivedMarketDocumentTitle();
    
    /**
     * True if has "received_MarketDocument.title" element
     */
    boolean isSetReceivedMarketDocumentTitle();
    
    /**
     * Sets the "received_MarketDocument.title" element
     */
    void setReceivedMarketDocumentTitle(java.lang.String receivedMarketDocumentTitle);
    
    /**
     * Sets (as xml) the "received_MarketDocument.title" element
     */
    void xsetReceivedMarketDocumentTitle(x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString receivedMarketDocumentTitle);
    
    /**
     * Unsets the "received_MarketDocument.title" element
     */
    void unsetReceivedMarketDocumentTitle();
    
    /**
     * Gets the "received_MarketDocument.createdDateTime" element
     */
    java.util.Calendar getReceivedMarketDocumentCreatedDateTime();
    
    /**
     * Gets (as xml) the "received_MarketDocument.createdDateTime" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime xgetReceivedMarketDocumentCreatedDateTime();
    
    /**
     * True if has "received_MarketDocument.createdDateTime" element
     */
    boolean isSetReceivedMarketDocumentCreatedDateTime();
    
    /**
     * Sets the "received_MarketDocument.createdDateTime" element
     */
    void setReceivedMarketDocumentCreatedDateTime(java.util.Calendar receivedMarketDocumentCreatedDateTime);
    
    /**
     * Sets (as xml) the "received_MarketDocument.createdDateTime" element
     */
    void xsetReceivedMarketDocumentCreatedDateTime(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime receivedMarketDocumentCreatedDateTime);
    
    /**
     * Unsets the "received_MarketDocument.createdDateTime" element
     */
    void unsetReceivedMarketDocumentCreatedDateTime();
    
    /**
     * Gets array of all "Rejected_TimeSeries" elements
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries[] getRejectedTimeSeriesArray();
    
    /**
     * Gets ith "Rejected_TimeSeries" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries getRejectedTimeSeriesArray(int i);
    
    /**
     * Returns number of "Rejected_TimeSeries" element
     */
    int sizeOfRejectedTimeSeriesArray();
    
    /**
     * Sets array of all "Rejected_TimeSeries" element
     */
    void setRejectedTimeSeriesArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries[] rejectedTimeSeriesArray);
    
    /**
     * Sets ith "Rejected_TimeSeries" element
     */
    void setRejectedTimeSeriesArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries rejectedTimeSeries);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Rejected_TimeSeries" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries insertNewRejectedTimeSeries(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Rejected_TimeSeries" element
     */
    x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries addNewRejectedTimeSeries();
    
    /**
     * Removes the ith "Rejected_TimeSeries" element
     */
    void removeRejectedTimeSeries(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 newInstance() {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
