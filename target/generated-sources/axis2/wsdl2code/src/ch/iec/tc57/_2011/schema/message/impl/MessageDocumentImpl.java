/*
 * An XML document type.
 * Localname: Message
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * A document containing one Message(@http://iec.ch/TC57/2011/schema/message) element.
 *
 * This is a complex type.
 */
public class MessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.MessageDocument
{
    
    public MessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Message");
    
    
    /**
     * Gets the "Message" element
     */
    public ch.iec.tc57._2011.schema.message.MessageType getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.MessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.MessageType)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(ch.iec.tc57._2011.schema.message.MessageType message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.MessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.MessageType)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.MessageType)get_store().add_element_user(MESSAGE$0);
            }
            target.set(message);
        }
    }
    
    /**
     * Appends and returns a new empty "Message" element
     */
    public ch.iec.tc57._2011.schema.message.MessageType addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.MessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.MessageType)get_store().add_element_user(MESSAGE$0);
            return target;
        }
    }
}
