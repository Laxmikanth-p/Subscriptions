/*
 * XML Type:  HeaderType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.HeaderType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML HeaderType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class HeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.HeaderType
{
    
    public HeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERB$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Verb");
    private static final javax.xml.namespace.QName NOUN$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Noun");
    private static final javax.xml.namespace.QName REVISION$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Revision");
    private static final javax.xml.namespace.QName REPLAYDETECTION$6 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "ReplayDetection");
    private static final javax.xml.namespace.QName CONTEXT$8 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Context");
    private static final javax.xml.namespace.QName TIMESTAMP$10 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Timestamp");
    private static final javax.xml.namespace.QName SOURCE$12 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Source");
    private static final javax.xml.namespace.QName ASYNCREPLYFLAG$14 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "AsyncReplyFlag");
    private static final javax.xml.namespace.QName REPLYADDRESS$16 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "ReplyAddress");
    private static final javax.xml.namespace.QName ACKREQUIRED$18 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "AckRequired");
    private static final javax.xml.namespace.QName USER$20 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "User");
    private static final javax.xml.namespace.QName MESSAGEID$22 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "MessageID");
    private static final javax.xml.namespace.QName CORRELATIONID$24 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "CorrelationID");
    private static final javax.xml.namespace.QName COMMENT$26 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Comment");
    private static final javax.xml.namespace.QName PROPERTY$28 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Property");
    
    
    /**
     * Gets the "Verb" element
     */
    public ch.iec.tc57._2011.schema.message.HeaderType.Verb.Enum getVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERB$0, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.iec.tc57._2011.schema.message.HeaderType.Verb.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Verb" element
     */
    public ch.iec.tc57._2011.schema.message.HeaderType.Verb xgetVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.HeaderType.Verb target = null;
            target = (ch.iec.tc57._2011.schema.message.HeaderType.Verb)get_store().find_element_user(VERB$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Verb" element
     */
    public void setVerb(ch.iec.tc57._2011.schema.message.HeaderType.Verb.Enum verb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERB$0);
            }
            target.setEnumValue(verb);
        }
    }
    
    /**
     * Sets (as xml) the "Verb" element
     */
    public void xsetVerb(ch.iec.tc57._2011.schema.message.HeaderType.Verb verb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.HeaderType.Verb target = null;
            target = (ch.iec.tc57._2011.schema.message.HeaderType.Verb)get_store().find_element_user(VERB$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.HeaderType.Verb)get_store().add_element_user(VERB$0);
            }
            target.set(verb);
        }
    }
    
    /**
     * Gets the "Noun" element
     */
    public java.lang.String getNoun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOUN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Noun" element
     */
    public org.apache.xmlbeans.XmlString xgetNoun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOUN$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Noun" element
     */
    public void setNoun(java.lang.String noun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOUN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOUN$2);
            }
            target.setStringValue(noun);
        }
    }
    
    /**
     * Sets (as xml) the "Noun" element
     */
    public void xsetNoun(org.apache.xmlbeans.XmlString noun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOUN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOUN$2);
            }
            target.set(noun);
        }
    }
    
    /**
     * Gets the "Revision" element
     */
    public java.lang.String getRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVISION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Revision" element
     */
    public org.apache.xmlbeans.XmlString xgetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVISION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Revision" element
     */
    public boolean isSetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REVISION$4) != 0;
        }
    }
    
    /**
     * Sets the "Revision" element
     */
    public void setRevision(java.lang.String revision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVISION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVISION$4);
            }
            target.setStringValue(revision);
        }
    }
    
    /**
     * Sets (as xml) the "Revision" element
     */
    public void xsetRevision(org.apache.xmlbeans.XmlString revision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVISION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REVISION$4);
            }
            target.set(revision);
        }
    }
    
    /**
     * Unsets the "Revision" element
     */
    public void unsetRevision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REVISION$4, 0);
        }
    }
    
    /**
     * Gets the "ReplayDetection" element
     */
    public ch.iec.tc57._2011.schema.message.ReplayDetectionType getReplayDetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ReplayDetectionType target = null;
            target = (ch.iec.tc57._2011.schema.message.ReplayDetectionType)get_store().find_element_user(REPLAYDETECTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReplayDetection" element
     */
    public boolean isSetReplayDetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLAYDETECTION$6) != 0;
        }
    }
    
    /**
     * Sets the "ReplayDetection" element
     */
    public void setReplayDetection(ch.iec.tc57._2011.schema.message.ReplayDetectionType replayDetection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ReplayDetectionType target = null;
            target = (ch.iec.tc57._2011.schema.message.ReplayDetectionType)get_store().find_element_user(REPLAYDETECTION$6, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ReplayDetectionType)get_store().add_element_user(REPLAYDETECTION$6);
            }
            target.set(replayDetection);
        }
    }
    
    /**
     * Appends and returns a new empty "ReplayDetection" element
     */
    public ch.iec.tc57._2011.schema.message.ReplayDetectionType addNewReplayDetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ReplayDetectionType target = null;
            target = (ch.iec.tc57._2011.schema.message.ReplayDetectionType)get_store().add_element_user(REPLAYDETECTION$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ReplayDetection" element
     */
    public void unsetReplayDetection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLAYDETECTION$6, 0);
        }
    }
    
    /**
     * Gets the "Context" element
     */
    public java.lang.String getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Context" element
     */
    public org.apache.xmlbeans.XmlString xgetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Context" element
     */
    public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$8) != 0;
        }
    }
    
    /**
     * Sets the "Context" element
     */
    public void setContext(java.lang.String context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEXT$8);
            }
            target.setStringValue(context);
        }
    }
    
    /**
     * Sets (as xml) the "Context" element
     */
    public void xsetContext(org.apache.xmlbeans.XmlString context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTEXT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTEXT$8);
            }
            target.set(context);
        }
    }
    
    /**
     * Unsets the "Context" element
     */
    public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$8, 0);
        }
    }
    
    /**
     * Gets the "Timestamp" element
     */
    public java.util.Calendar getTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Timestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Timestamp" element
     */
    public boolean isSetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMESTAMP$10) != 0;
        }
    }
    
    /**
     * Sets the "Timestamp" element
     */
    public void setTimestamp(java.util.Calendar timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$10);
            }
            target.setCalendarValue(timestamp);
        }
    }
    
    /**
     * Sets (as xml) the "Timestamp" element
     */
    public void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$10);
            }
            target.set(timestamp);
        }
    }
    
    /**
     * Unsets the "Timestamp" element
     */
    public void unsetTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMESTAMP$10, 0);
        }
    }
    
    /**
     * Gets the "Source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$12) != 0;
        }
    }
    
    /**
     * Sets the "Source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$12);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "Source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$12);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "Source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$12, 0);
        }
    }
    
    /**
     * Gets the "AsyncReplyFlag" element
     */
    public boolean getAsyncReplyFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASYNCREPLYFLAG$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AsyncReplyFlag" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAsyncReplyFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ASYNCREPLYFLAG$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "AsyncReplyFlag" element
     */
    public boolean isSetAsyncReplyFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASYNCREPLYFLAG$14) != 0;
        }
    }
    
    /**
     * Sets the "AsyncReplyFlag" element
     */
    public void setAsyncReplyFlag(boolean asyncReplyFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASYNCREPLYFLAG$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASYNCREPLYFLAG$14);
            }
            target.setBooleanValue(asyncReplyFlag);
        }
    }
    
    /**
     * Sets (as xml) the "AsyncReplyFlag" element
     */
    public void xsetAsyncReplyFlag(org.apache.xmlbeans.XmlBoolean asyncReplyFlag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ASYNCREPLYFLAG$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ASYNCREPLYFLAG$14);
            }
            target.set(asyncReplyFlag);
        }
    }
    
    /**
     * Unsets the "AsyncReplyFlag" element
     */
    public void unsetAsyncReplyFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASYNCREPLYFLAG$14, 0);
        }
    }
    
    /**
     * Gets the "ReplyAddress" element
     */
    public java.lang.String getReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYADDRESS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReplyAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYADDRESS$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReplyAddress" element
     */
    public boolean isSetReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLYADDRESS$16) != 0;
        }
    }
    
    /**
     * Sets the "ReplyAddress" element
     */
    public void setReplyAddress(java.lang.String replyAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYADDRESS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLYADDRESS$16);
            }
            target.setStringValue(replyAddress);
        }
    }
    
    /**
     * Sets (as xml) the "ReplyAddress" element
     */
    public void xsetReplyAddress(org.apache.xmlbeans.XmlString replyAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYADDRESS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLYADDRESS$16);
            }
            target.set(replyAddress);
        }
    }
    
    /**
     * Unsets the "ReplyAddress" element
     */
    public void unsetReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLYADDRESS$16, 0);
        }
    }
    
    /**
     * Gets the "AckRequired" element
     */
    public boolean getAckRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACKREQUIRED$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AckRequired" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAckRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACKREQUIRED$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "AckRequired" element
     */
    public boolean isSetAckRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACKREQUIRED$18) != 0;
        }
    }
    
    /**
     * Sets the "AckRequired" element
     */
    public void setAckRequired(boolean ackRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACKREQUIRED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACKREQUIRED$18);
            }
            target.setBooleanValue(ackRequired);
        }
    }
    
    /**
     * Sets (as xml) the "AckRequired" element
     */
    public void xsetAckRequired(org.apache.xmlbeans.XmlBoolean ackRequired)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACKREQUIRED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACKREQUIRED$18);
            }
            target.set(ackRequired);
        }
    }
    
    /**
     * Unsets the "AckRequired" element
     */
    public void unsetAckRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACKREQUIRED$18, 0);
        }
    }
    
    /**
     * Gets the "User" element
     */
    public ch.iec.tc57._2011.schema.message.UserType getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.UserType target = null;
            target = (ch.iec.tc57._2011.schema.message.UserType)get_store().find_element_user(USER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "User" element
     */
    public boolean isSetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$20) != 0;
        }
    }
    
    /**
     * Sets the "User" element
     */
    public void setUser(ch.iec.tc57._2011.schema.message.UserType user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.UserType target = null;
            target = (ch.iec.tc57._2011.schema.message.UserType)get_store().find_element_user(USER$20, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.UserType)get_store().add_element_user(USER$20);
            }
            target.set(user);
        }
    }
    
    /**
     * Appends and returns a new empty "User" element
     */
    public ch.iec.tc57._2011.schema.message.UserType addNewUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.UserType target = null;
            target = (ch.iec.tc57._2011.schema.message.UserType)get_store().add_element_user(USER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "User" element
     */
    public void unsetUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$20, 0);
        }
    }
    
    /**
     * Gets the "MessageID" element
     */
    public java.lang.String getMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageID" element
     */
    public org.apache.xmlbeans.XmlString xgetMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEID$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "MessageID" element
     */
    public boolean isSetMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEID$22) != 0;
        }
    }
    
    /**
     * Sets the "MessageID" element
     */
    public void setMessageID(java.lang.String messageID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEID$22);
            }
            target.setStringValue(messageID);
        }
    }
    
    /**
     * Sets (as xml) the "MessageID" element
     */
    public void xsetMessageID(org.apache.xmlbeans.XmlString messageID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEID$22);
            }
            target.set(messageID);
        }
    }
    
    /**
     * Unsets the "MessageID" element
     */
    public void unsetMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEID$22, 0);
        }
    }
    
    /**
     * Gets the "CorrelationID" element
     */
    public java.lang.String getCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CorrelationID" element
     */
    public org.apache.xmlbeans.XmlString xgetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONID$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "CorrelationID" element
     */
    public boolean isSetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONID$24) != 0;
        }
    }
    
    /**
     * Sets the "CorrelationID" element
     */
    public void setCorrelationID(java.lang.String correlationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONID$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIONID$24);
            }
            target.setStringValue(correlationID);
        }
    }
    
    /**
     * Sets (as xml) the "CorrelationID" element
     */
    public void xsetCorrelationID(org.apache.xmlbeans.XmlString correlationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORRELATIONID$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORRELATIONID$24);
            }
            target.set(correlationID);
        }
    }
    
    /**
     * Unsets the "CorrelationID" element
     */
    public void unsetCorrelationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONID$24, 0);
        }
    }
    
    /**
     * Gets the "Comment" element
     */
    public java.lang.String getComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comment" element
     */
    public org.apache.xmlbeans.XmlString xgetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "Comment" element
     */
    public boolean isSetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$26) != 0;
        }
    }
    
    /**
     * Sets the "Comment" element
     */
    public void setComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$26);
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) the "Comment" element
     */
    public void xsetComment(org.apache.xmlbeans.XmlString comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$26);
            }
            target.set(comment);
        }
    }
    
    /**
     * Unsets the "Comment" element
     */
    public void unsetComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$26, 0);
        }
    }
    
    /**
     * Gets array of all "Property" elements
     */
    public ch.iec.tc57._2011.schema.message.MessageProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$28, targetList);
            ch.iec.tc57._2011.schema.message.MessageProperty[] result = new ch.iec.tc57._2011.schema.message.MessageProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Property" element
     */
    public ch.iec.tc57._2011.schema.message.MessageProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.MessageProperty target = null;
            target = (ch.iec.tc57._2011.schema.message.MessageProperty)get_store().find_element_user(PROPERTY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$28);
        }
    }
    
    /**
     * Sets array of all "Property" element
     */
    public void setPropertyArray(ch.iec.tc57._2011.schema.message.MessageProperty[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$28);
        }
    }
    
    /**
     * Sets ith "Property" element
     */
    public void setPropertyArray(int i, ch.iec.tc57._2011.schema.message.MessageProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.MessageProperty target = null;
            target = (ch.iec.tc57._2011.schema.message.MessageProperty)get_store().find_element_user(PROPERTY$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Property" element
     */
    public ch.iec.tc57._2011.schema.message.MessageProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.MessageProperty target = null;
            target = (ch.iec.tc57._2011.schema.message.MessageProperty)get_store().insert_element_user(PROPERTY$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Property" element
     */
    public ch.iec.tc57._2011.schema.message.MessageProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.MessageProperty target = null;
            target = (ch.iec.tc57._2011.schema.message.MessageProperty)get_store().add_element_user(PROPERTY$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "Property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$28, i);
        }
    }
    /**
     * An XML Verb(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.HeaderType$Verb.
     */
    public static class VerbImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements ch.iec.tc57._2011.schema.message.HeaderType.Verb
    {
        
        public VerbImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected VerbImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
