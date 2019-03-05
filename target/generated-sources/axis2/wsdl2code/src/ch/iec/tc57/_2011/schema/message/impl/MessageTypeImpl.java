/*
 * XML Type:  MessageType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.MessageType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML MessageType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class MessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.MessageType
{
    
    public MessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Header");
    private static final javax.xml.namespace.QName REQUEST$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Request");
    private static final javax.xml.namespace.QName REPLY$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Reply");
    private static final javax.xml.namespace.QName PAYLOAD$6 = 
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
     * Gets the "Request" element
     */
    public ch.iec.tc57._2011.schema.message.RequestType getRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestType target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestType)get_store().find_element_user(REQUEST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Request" element
     */
    public boolean isSetRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REQUEST$2) != 0;
        }
    }
    
    /**
     * Sets the "Request" element
     */
    public void setRequest(ch.iec.tc57._2011.schema.message.RequestType request)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestType target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestType)get_store().find_element_user(REQUEST$2, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.RequestType)get_store().add_element_user(REQUEST$2);
            }
            target.set(request);
        }
    }
    
    /**
     * Appends and returns a new empty "Request" element
     */
    public ch.iec.tc57._2011.schema.message.RequestType addNewRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestType target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestType)get_store().add_element_user(REQUEST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Request" element
     */
    public void unsetRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REQUEST$2, 0);
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
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().find_element_user(REPLY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Reply" element
     */
    public boolean isSetReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLY$4) != 0;
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
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().find_element_user(REPLY$4, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().add_element_user(REPLY$4);
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
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().add_element_user(REPLY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Reply" element
     */
    public void unsetReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLY$4, 0);
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
            target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().find_element_user(PAYLOAD$6, 0);
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
            return get_store().count_elements(PAYLOAD$6) != 0;
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
            target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().find_element_user(PAYLOAD$6, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().add_element_user(PAYLOAD$6);
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
            target = (ch.iec.tc57._2011.schema.message.PayloadType)get_store().add_element_user(PAYLOAD$6);
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
            get_store().remove_element(PAYLOAD$6, 0);
        }
    }
}
