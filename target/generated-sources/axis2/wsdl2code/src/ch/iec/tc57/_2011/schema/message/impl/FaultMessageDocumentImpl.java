/*
 * An XML document type.
 * Localname: FaultMessage
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.FaultMessageDocument
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * A document containing one FaultMessage(@http://iec.ch/TC57/2011/schema/message) element.
 *
 * This is a complex type.
 */
public class FaultMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.FaultMessageDocument
{
    
    public FaultMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAULTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "FaultMessage");
    
    
    /**
     * Gets the "FaultMessage" element
     */
    public ch.iec.tc57._2011.schema.message.FaultMessageType getFaultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.FaultMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.FaultMessageType)get_store().find_element_user(FAULTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FaultMessage" element
     */
    public void setFaultMessage(ch.iec.tc57._2011.schema.message.FaultMessageType faultMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.FaultMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.FaultMessageType)get_store().find_element_user(FAULTMESSAGE$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.FaultMessageType)get_store().add_element_user(FAULTMESSAGE$0);
            }
            target.set(faultMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "FaultMessage" element
     */
    public ch.iec.tc57._2011.schema.message.FaultMessageType addNewFaultMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.FaultMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.FaultMessageType)get_store().add_element_user(FAULTMESSAGE$0);
            return target;
        }
    }
}
