/*
 * An XML document type.
 * Localname: Acknowledgement_MarketDocument
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325.impl;
/**
 * A document containing one Acknowledgement_MarketDocument(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0) element.
 *
 * This is a complex type.
 */
public class AcknowledgementMarketDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocumentDocument1
{
    private static final long serialVersionUID = 1L;
    
    public AcknowledgementMarketDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACKNOWLEDGEMENTMARKETDOCUMENT$0 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "Acknowledgement_MarketDocument");
    
    
    /**
     * Gets the "Acknowledgement_MarketDocument" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 getAcknowledgementMarketDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1)get_store().find_element_user(ACKNOWLEDGEMENTMARKETDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Acknowledgement_MarketDocument" element
     */
    public void setAcknowledgementMarketDocument(x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 acknowledgementMarketDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1)get_store().find_element_user(ACKNOWLEDGEMENTMARKETDOCUMENT$0, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1)get_store().add_element_user(ACKNOWLEDGEMENTMARKETDOCUMENT$0);
            }
            target.set(acknowledgementMarketDocument);
        }
    }
    
    /**
     * Appends and returns a new empty "Acknowledgement_MarketDocument" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 addNewAcknowledgementMarketDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1)get_store().add_element_user(ACKNOWLEDGEMENTMARKETDOCUMENT$0);
            return target;
        }
    }
}
