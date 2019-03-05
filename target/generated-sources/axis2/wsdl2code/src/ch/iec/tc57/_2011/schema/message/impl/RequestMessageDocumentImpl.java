/*
 * An XML document type.
 * Localname: RequestMessage
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.RequestMessageDocument
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * A document containing one RequestMessage(@http://iec.ch/TC57/2011/schema/message) element.
 *
 * This is a complex type.
 */
public class RequestMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.RequestMessageDocument
{
    
    public RequestMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "RequestMessage");
    
    
    /**
     * Gets the "RequestMessage" element
     */
    public ch.iec.tc57._2011.schema.message.RequestMessageType getRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestMessageType)get_store().find_element_user(REQUESTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RequestMessage" element
     */
    public void setRequestMessage(ch.iec.tc57._2011.schema.message.RequestMessageType requestMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestMessageType)get_store().find_element_user(REQUESTMESSAGE$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.RequestMessageType)get_store().add_element_user(REQUESTMESSAGE$0);
            }
            target.set(requestMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "RequestMessage" element
     */
    public ch.iec.tc57._2011.schema.message.RequestMessageType addNewRequestMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestMessageType)get_store().add_element_user(REQUESTMESSAGE$0);
            return target;
        }
    }
}
