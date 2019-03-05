/*
 * An XML document type.
 * Localname: EventMessage
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.EventMessageDocument
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * A document containing one EventMessage(@http://iec.ch/TC57/2011/schema/message) element.
 *
 * This is a complex type.
 */
public class EventMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.EventMessageDocument
{
    
    public EventMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "EventMessage");
    
    
    /**
     * Gets the "EventMessage" element
     */
    public ch.iec.tc57._2011.schema.message.EventMessageType getEventMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.EventMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.EventMessageType)get_store().find_element_user(EVENTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventMessage" element
     */
    public void setEventMessage(ch.iec.tc57._2011.schema.message.EventMessageType eventMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.EventMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.EventMessageType)get_store().find_element_user(EVENTMESSAGE$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.EventMessageType)get_store().add_element_user(EVENTMESSAGE$0);
            }
            target.set(eventMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "EventMessage" element
     */
    public ch.iec.tc57._2011.schema.message.EventMessageType addNewEventMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.EventMessageType target = null;
            target = (ch.iec.tc57._2011.schema.message.EventMessageType)get_store().add_element_user(EVENTMESSAGE$0);
            return target;
        }
    }
}
