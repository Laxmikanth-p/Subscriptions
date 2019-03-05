/*
 * XML Type:  Acknowledgement_MarketDocument
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325.impl;
/**
 * An XML Acknowledgement_MarketDocument(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public class AcknowledgementMarketDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1
{
    private static final long serialVersionUID = 1L;
    
    public AcknowledgementMarketDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MRID$0 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "mRID");
    private static final javax.xml.namespace.QName CREATEDDATETIME$2 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "createdDateTime");
    private static final javax.xml.namespace.QName SENDERMARKETPARTICIPANTMRID$4 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "sender_MarketParticipant.mRID");
    private static final javax.xml.namespace.QName SENDERMARKETPARTICIPANTMARKETROLETYPE$6 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "sender_MarketParticipant.marketRole.type");
    private static final javax.xml.namespace.QName RECEIVERMARKETPARTICIPANTMRID$8 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "receiver_MarketParticipant.mRID");
    private static final javax.xml.namespace.QName RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "receiver_MarketParticipant.marketRole.type");
    private static final javax.xml.namespace.QName RECEIVEDMARKETDOCUMENTMRID$12 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "received_MarketDocument.mRID");
    private static final javax.xml.namespace.QName RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "received_MarketDocument.revisionNumber");
    private static final javax.xml.namespace.QName RECEIVEDMARKETDOCUMENTTYPE$16 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "received_MarketDocument.type");
    private static final javax.xml.namespace.QName RECEIVEDMARKETDOCUMENTTITLE$18 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "received_MarketDocument.title");
    private static final javax.xml.namespace.QName RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "received_MarketDocument.createdDateTime");
    private static final javax.xml.namespace.QName REJECTEDTIMESERIES$22 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "Rejected_TimeSeries");
    private static final javax.xml.namespace.QName REASON$24 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "Reason");
    private static final javax.xml.namespace.QName INERRORPERIOD$26 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "InError_Period");
    
    
    /**
     * Gets the "mRID" element
     */
    public java.lang.String getMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mRID" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString xgetMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().find_element_user(MRID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mRID" element
     */
    public void setMRID(java.lang.String mrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MRID$0);
            }
            target.setStringValue(mrid);
        }
    }
    
    /**
     * Sets (as xml) the "mRID" element
     */
    public void xsetMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString mrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().find_element_user(MRID$0, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().add_element_user(MRID$0);
            }
            target.set(mrid);
        }
    }
    
    /**
     * Gets the "createdDateTime" element
     */
    public java.util.Calendar getCreatedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDDATETIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "createdDateTime" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime xgetCreatedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime)get_store().find_element_user(CREATEDDATETIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "createdDateTime" element
     */
    public void setCreatedDateTime(java.util.Calendar createdDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDDATETIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDDATETIME$2);
            }
            target.setCalendarValue(createdDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "createdDateTime" element
     */
    public void xsetCreatedDateTime(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime createdDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime)get_store().find_element_user(CREATEDDATETIME$2, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime)get_store().add_element_user(CREATEDDATETIME$2);
            }
            target.set(createdDateTime);
        }
    }
    
    /**
     * Gets the "sender_MarketParticipant.mRID" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString getSenderMarketParticipantMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().find_element_user(SENDERMARKETPARTICIPANTMRID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sender_MarketParticipant.mRID" element
     */
    public void setSenderMarketParticipantMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString senderMarketParticipantMRID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().find_element_user(SENDERMARKETPARTICIPANTMRID$4, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().add_element_user(SENDERMARKETPARTICIPANTMRID$4);
            }
            target.set(senderMarketParticipantMRID);
        }
    }
    
    /**
     * Appends and returns a new empty "sender_MarketParticipant.mRID" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString addNewSenderMarketParticipantMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().add_element_user(SENDERMARKETPARTICIPANTMRID$4);
            return target;
        }
    }
    
    /**
     * Gets the "sender_MarketParticipant.marketRole.type" element
     */
    public java.lang.String getSenderMarketParticipantMarketRoleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERMARKETPARTICIPANTMARKETROLETYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sender_MarketParticipant.marketRole.type" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString xgetSenderMarketParticipantMarketRoleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString)get_store().find_element_user(SENDERMARKETPARTICIPANTMARKETROLETYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sender_MarketParticipant.marketRole.type" element
     */
    public void setSenderMarketParticipantMarketRoleType(java.lang.String senderMarketParticipantMarketRoleType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERMARKETPARTICIPANTMARKETROLETYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERMARKETPARTICIPANTMARKETROLETYPE$6);
            }
            target.setStringValue(senderMarketParticipantMarketRoleType);
        }
    }
    
    /**
     * Sets (as xml) the "sender_MarketParticipant.marketRole.type" element
     */
    public void xsetSenderMarketParticipantMarketRoleType(x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString senderMarketParticipantMarketRoleType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString)get_store().find_element_user(SENDERMARKETPARTICIPANTMARKETROLETYPE$6, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString)get_store().add_element_user(SENDERMARKETPARTICIPANTMARKETROLETYPE$6);
            }
            target.set(senderMarketParticipantMarketRoleType);
        }
    }
    
    /**
     * Gets the "receiver_MarketParticipant.mRID" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString getReceiverMarketParticipantMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().find_element_user(RECEIVERMARKETPARTICIPANTMRID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "receiver_MarketParticipant.mRID" element
     */
    public void setReceiverMarketParticipantMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString receiverMarketParticipantMRID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().find_element_user(RECEIVERMARKETPARTICIPANTMRID$8, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().add_element_user(RECEIVERMARKETPARTICIPANTMRID$8);
            }
            target.set(receiverMarketParticipantMRID);
        }
    }
    
    /**
     * Appends and returns a new empty "receiver_MarketParticipant.mRID" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString addNewReceiverMarketParticipantMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString)get_store().add_element_user(RECEIVERMARKETPARTICIPANTMRID$8);
            return target;
        }
    }
    
    /**
     * Gets the "receiver_MarketParticipant.marketRole.type" element
     */
    public java.lang.String getReceiverMarketParticipantMarketRoleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "receiver_MarketParticipant.marketRole.type" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString xgetReceiverMarketParticipantMarketRoleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString)get_store().find_element_user(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "receiver_MarketParticipant.marketRole.type" element
     */
    public boolean isSetReceiverMarketParticipantMarketRoleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "receiver_MarketParticipant.marketRole.type" element
     */
    public void setReceiverMarketParticipantMarketRoleType(java.lang.String receiverMarketParticipantMarketRoleType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10);
            }
            target.setStringValue(receiverMarketParticipantMarketRoleType);
        }
    }
    
    /**
     * Sets (as xml) the "receiver_MarketParticipant.marketRole.type" element
     */
    public void xsetReceiverMarketParticipantMarketRoleType(x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString receiverMarketParticipantMarketRoleType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString)get_store().find_element_user(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MarketRoleKindString)get_store().add_element_user(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10);
            }
            target.set(receiverMarketParticipantMarketRoleType);
        }
    }
    
    /**
     * Unsets the "receiver_MarketParticipant.marketRole.type" element
     */
    public void unsetReceiverMarketParticipantMarketRoleType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVERMARKETPARTICIPANTMARKETROLETYPE$10, 0);
        }
    }
    
    /**
     * Gets the "received_MarketDocument.mRID" element
     */
    public java.lang.String getReceivedMarketDocumentMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTMRID$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "received_MarketDocument.mRID" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString xgetReceivedMarketDocumentMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTMRID$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "received_MarketDocument.mRID" element
     */
    public boolean isSetReceivedMarketDocumentMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDMARKETDOCUMENTMRID$12) != 0;
        }
    }
    
    /**
     * Sets the "received_MarketDocument.mRID" element
     */
    public void setReceivedMarketDocumentMRID(java.lang.String receivedMarketDocumentMRID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTMRID$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVEDMARKETDOCUMENTMRID$12);
            }
            target.setStringValue(receivedMarketDocumentMRID);
        }
    }
    
    /**
     * Sets (as xml) the "received_MarketDocument.mRID" element
     */
    public void xsetReceivedMarketDocumentMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString receivedMarketDocumentMRID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTMRID$12, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().add_element_user(RECEIVEDMARKETDOCUMENTMRID$12);
            }
            target.set(receivedMarketDocumentMRID);
        }
    }
    
    /**
     * Unsets the "received_MarketDocument.mRID" element
     */
    public void unsetReceivedMarketDocumentMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDMARKETDOCUMENTMRID$12, 0);
        }
    }
    
    /**
     * Gets the "received_MarketDocument.revisionNumber" element
     */
    public java.lang.String getReceivedMarketDocumentRevisionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "received_MarketDocument.revisionNumber" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString xgetReceivedMarketDocumentRevisionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "received_MarketDocument.revisionNumber" element
     */
    public boolean isSetReceivedMarketDocumentRevisionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14) != 0;
        }
    }
    
    /**
     * Sets the "received_MarketDocument.revisionNumber" element
     */
    public void setReceivedMarketDocumentRevisionNumber(java.lang.String receivedMarketDocumentRevisionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14);
            }
            target.setStringValue(receivedMarketDocumentRevisionNumber);
        }
    }
    
    /**
     * Sets (as xml) the "received_MarketDocument.revisionNumber" element
     */
    public void xsetReceivedMarketDocumentRevisionNumber(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString receivedMarketDocumentRevisionNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString)get_store().add_element_user(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14);
            }
            target.set(receivedMarketDocumentRevisionNumber);
        }
    }
    
    /**
     * Unsets the "received_MarketDocument.revisionNumber" element
     */
    public void unsetReceivedMarketDocumentRevisionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDMARKETDOCUMENTREVISIONNUMBER$14, 0);
        }
    }
    
    /**
     * Gets the "received_MarketDocument.type" element
     */
    public java.lang.String getReceivedMarketDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "received_MarketDocument.type" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString xgetReceivedMarketDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTYPE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "received_MarketDocument.type" element
     */
    public boolean isSetReceivedMarketDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDMARKETDOCUMENTTYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "received_MarketDocument.type" element
     */
    public void setReceivedMarketDocumentType(java.lang.String receivedMarketDocumentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVEDMARKETDOCUMENTTYPE$16);
            }
            target.setStringValue(receivedMarketDocumentType);
        }
    }
    
    /**
     * Sets (as xml) the "received_MarketDocument.type" element
     */
    public void xsetReceivedMarketDocumentType(x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString receivedMarketDocumentType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTYPE$16, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.MessageKindString)get_store().add_element_user(RECEIVEDMARKETDOCUMENTTYPE$16);
            }
            target.set(receivedMarketDocumentType);
        }
    }
    
    /**
     * Unsets the "received_MarketDocument.type" element
     */
    public void unsetReceivedMarketDocumentType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDMARKETDOCUMENTTYPE$16, 0);
        }
    }
    
    /**
     * Gets the "received_MarketDocument.title" element
     */
    public java.lang.String getReceivedMarketDocumentTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTITLE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "received_MarketDocument.title" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString xgetReceivedMarketDocumentTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTITLE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "received_MarketDocument.title" element
     */
    public boolean isSetReceivedMarketDocumentTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDMARKETDOCUMENTTITLE$18) != 0;
        }
    }
    
    /**
     * Sets the "received_MarketDocument.title" element
     */
    public void setReceivedMarketDocumentTitle(java.lang.String receivedMarketDocumentTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTITLE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVEDMARKETDOCUMENTTITLE$18);
            }
            target.setStringValue(receivedMarketDocumentTitle);
        }
    }
    
    /**
     * Sets (as xml) the "received_MarketDocument.title" element
     */
    public void xsetReceivedMarketDocumentTitle(x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString receivedMarketDocumentTitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString)get_store().find_element_user(RECEIVEDMARKETDOCUMENTTITLE$18, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.PayloadIdString)get_store().add_element_user(RECEIVEDMARKETDOCUMENTTITLE$18);
            }
            target.set(receivedMarketDocumentTitle);
        }
    }
    
    /**
     * Unsets the "received_MarketDocument.title" element
     */
    public void unsetReceivedMarketDocumentTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDMARKETDOCUMENTTITLE$18, 0);
        }
    }
    
    /**
     * Gets the "received_MarketDocument.createdDateTime" element
     */
    public java.util.Calendar getReceivedMarketDocumentCreatedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "received_MarketDocument.createdDateTime" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime xgetReceivedMarketDocumentCreatedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime)get_store().find_element_user(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "received_MarketDocument.createdDateTime" element
     */
    public boolean isSetReceivedMarketDocumentCreatedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20) != 0;
        }
    }
    
    /**
     * Sets the "received_MarketDocument.createdDateTime" element
     */
    public void setReceivedMarketDocumentCreatedDateTime(java.util.Calendar receivedMarketDocumentCreatedDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20);
            }
            target.setCalendarValue(receivedMarketDocumentCreatedDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "received_MarketDocument.createdDateTime" element
     */
    public void xsetReceivedMarketDocumentCreatedDateTime(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime receivedMarketDocumentCreatedDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime)get_store().find_element_user(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTime)get_store().add_element_user(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20);
            }
            target.set(receivedMarketDocumentCreatedDateTime);
        }
    }
    
    /**
     * Unsets the "received_MarketDocument.createdDateTime" element
     */
    public void unsetReceivedMarketDocumentCreatedDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECEIVEDMARKETDOCUMENTCREATEDDATETIME$20, 0);
        }
    }
    
    /**
     * Gets array of all "Rejected_TimeSeries" elements
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries[] getRejectedTimeSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REJECTEDTIMESERIES$22, targetList);
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries[] result = new x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Rejected_TimeSeries" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries getRejectedTimeSeriesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries)get_store().find_element_user(REJECTEDTIMESERIES$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Rejected_TimeSeries" element
     */
    public int sizeOfRejectedTimeSeriesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REJECTEDTIMESERIES$22);
        }
    }
    
    /**
     * Sets array of all "Rejected_TimeSeries" element
     */
    public void setRejectedTimeSeriesArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries[] rejectedTimeSeriesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rejectedTimeSeriesArray, REJECTEDTIMESERIES$22);
        }
    }
    
    /**
     * Sets ith "Rejected_TimeSeries" element
     */
    public void setRejectedTimeSeriesArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries rejectedTimeSeries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries)get_store().find_element_user(REJECTEDTIMESERIES$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rejectedTimeSeries);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Rejected_TimeSeries" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries insertNewRejectedTimeSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries)get_store().insert_element_user(REJECTEDTIMESERIES$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Rejected_TimeSeries" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries addNewRejectedTimeSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries)get_store().add_element_user(REJECTEDTIMESERIES$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "Rejected_TimeSeries" element
     */
    public void removeRejectedTimeSeries(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REJECTEDTIMESERIES$22, i);
        }
    }
    
    /**
     * Gets array of all "Reason" elements
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] getReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REASON$24, targetList);
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] result = new x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Reason" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason getReasonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().find_element_user(REASON$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Reason" element
     */
    public int sizeOfReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$24);
        }
    }
    
    /**
     * Sets array of all "Reason" element
     */
    public void setReasonArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] reasonArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reasonArray, REASON$24);
        }
    }
    
    /**
     * Sets ith "Reason" element
     */
    public void setReasonArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().find_element_user(REASON$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reason);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Reason" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason insertNewReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().insert_element_user(REASON$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Reason" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().add_element_user(REASON$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "Reason" element
     */
    public void removeReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$24, i);
        }
    }
    
    /**
     * Gets array of all "InError_Period" elements
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] getInErrorPeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INERRORPERIOD$26, targetList);
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] result = new x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InError_Period" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod getInErrorPeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().find_element_user(INERRORPERIOD$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InError_Period" element
     */
    public int sizeOfInErrorPeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INERRORPERIOD$26);
        }
    }
    
    /**
     * Sets array of all "InError_Period" element
     */
    public void setInErrorPeriodArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] inErrorPeriodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inErrorPeriodArray, INERRORPERIOD$26);
        }
    }
    
    /**
     * Sets ith "InError_Period" element
     */
    public void setInErrorPeriodArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod inErrorPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().find_element_user(INERRORPERIOD$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inErrorPeriod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InError_Period" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod insertNewInErrorPeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().insert_element_user(INERRORPERIOD$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InError_Period" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod addNewInErrorPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().add_element_user(INERRORPERIOD$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "InError_Period" element
     */
    public void removeInErrorPeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INERRORPERIOD$26, i);
        }
    }
}
