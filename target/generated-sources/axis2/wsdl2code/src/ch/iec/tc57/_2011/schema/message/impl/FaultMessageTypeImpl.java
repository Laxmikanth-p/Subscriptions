/*
 * XML Type:  FaultMessageType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.FaultMessageType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML FaultMessageType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class FaultMessageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.FaultMessageType
{
    
    public FaultMessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLY$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Reply");
    
    
    /**
     * Gets the "Reply" element
     */
    public ch.iec.tc57._2011.schema.message.ReplyType getReply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ReplyType target = null;
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().find_element_user(REPLY$0, 0);
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
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().find_element_user(REPLY$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().add_element_user(REPLY$0);
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
            target = (ch.iec.tc57._2011.schema.message.ReplyType)get_store().add_element_user(REPLY$0);
            return target;
        }
    }
}
