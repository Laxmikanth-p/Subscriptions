/*
 * XML Type:  ResponseMessageType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ResponseMessageType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML ResponseMessageType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class ResponseMessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.ResponseMessageType
{
    
    public ResponseMessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Header");
    private static final javax.xml.namespace.QName REPLY$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Reply");
    private static final javax.xml.namespace.QName PAYLOAD$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Payload");
    
    
    /**
     * Gets the "Header" element
     */
    public ch.iec.tc57._2011.schema.message.HeaderType getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.HeaderType target = null;
            target = (ch.iec.tc57._2011.schema.message.HeaderType)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Header" element
     */
    public void setHeader(ch.iec.tc57._2011.schema.message.HeaderType header)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.HeaderType target = null;
            target = (ch.iec.tc57._2011.schema.message.HeaderType)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.HeaderType)get_store().add_element_user(HEADER$0);
            }
            target.set(header);
        }
    }
    
    /**
     * Appends and returns a new empty "Header" element
     */
    public ch.iec.tc57._2011.schema.message.HeaderType addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.HeaderType target = null;
            target = (ch.iec.tc57._2011.schema.message.HeaderType)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    
    /**
     * Gets the "Reply" element
     */
    public ch.iec.tc57._2011.schema.message.ReplyType getReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ReplyType target = null;
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().find_element_user(REPLY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Reply" element
     */
    public void setReply(ch.iec.tc57._2011.schema.message.ReplyType reply)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ReplyType target = null;
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().find_element_user(REPLY$2, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().add_element_user(REPLY$2);
            }
            target.set(reply);
        }
    }
    
    /**
     * Appends and returns a new empty "Reply" element
     */
    public ch.iec.tc57._2011.schema.message.ReplyType addNewReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ReplyType target = null;
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().add_element_user(REPLY$2);
            return target;
        }
    }
    
    /**
     * Gets the "Payload" element
     */
    public ch.iec.tc57._2011.schema.message.PayloadType getPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.PayloadType target = null;
            target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().find_element_user(PAYLOAD$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Payload" element
     */
    public boolean isSetPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYLOAD$4) != 0;
        }
    }
    
    /**
     * Sets the "Payload" element
     */
    public void setPayload(ch.iec.tc57._2011.schema.message.PayloadType payload)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.PayloadType target = null;
            target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().find_element_user(PAYLOAD$4, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().add_element_user(PAYLOAD$4);
            }
            target.set(payload);
        }
    }
    
    /**
     * Appends and returns a new empty "Payload" element
     */
    public ch.iec.tc57._2011.schema.message.PayloadType addNewPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.PayloadType target = null;
            target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().add_element_user(PAYLOAD$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Payload" element
     */
    public void unsetPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYLOAD$4, 0);
        }
    }
}
