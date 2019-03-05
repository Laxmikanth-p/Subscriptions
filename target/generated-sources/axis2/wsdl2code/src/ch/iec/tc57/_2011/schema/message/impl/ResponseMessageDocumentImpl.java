/*
 * An XML document type.
 * Localname: ResponseMessage
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ResponseMessageDocument
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * A document containing one ResponseMessage(@http://iec.ch/TC57/2011/schema/message) element.
 *
 * This is a complex type.
 */
public class ResponseMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.ResponseMessageDocument
{
    
    public ResponseMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSEMESSAGE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "ResponseMessage");
    
    
    /**
     * Gets the "ResponseMessage" element
     */
    public ch.iec.tc57._2011.schema.message.ResponseMessageType getResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ResponseMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.ResponseMessageType)get_store().find_element_user(RESPONSEMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResponseMessage" element
     */
    public void setResponseMessage(ch.iec.tc57._2011.schema.message.ResponseMessageType responseMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ResponseMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.ResponseMessageType)get_store().find_element_user(RESPONSEMESSAGE$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ResponseMessageType)get_store().add_element_user(RESPONSEMESSAGE$0);
            }
            target.set(responseMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "ResponseMessage" element
     */
    public ch.iec.tc57._2011.schema.message.ResponseMessageType addNewResponseMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ResponseMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.ResponseMessageType)get_store().add_element_user(RESPONSEMESSAGE$0);
            return target;
        }
    }
}
