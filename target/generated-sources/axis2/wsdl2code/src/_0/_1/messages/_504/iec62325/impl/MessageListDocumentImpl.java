/*
 * An XML document type.
 * Localname: MessageList
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.MessageListDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325.impl;
/**
 * A document containing one MessageList(@urn:iec62325.504:messages:1:0) element.
 *
 * This is a complex type.
 */
public class MessageListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.MessageListDocument
{
    
    public MessageListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGELIST$0 = 
        new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "MessageList");
    
    
    /**
     * Gets the "MessageList" element
     */
    public _0._1.messages._504.iec62325.MessageListDocument.MessageList getMessageList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.MessageListDocument.MessageList target = null;
            target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList)get_store().find_element_user(MESSAGELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MessageList" element
     */
    public void setMessageList(_0._1.messages._504.iec62325.MessageListDocument.MessageList messageList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.MessageListDocument.MessageList target = null;
            target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList)get_store().find_element_user(MESSAGELIST$0, 0);
            if (target == null)
            {
                target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList)get_store().add_element_user(MESSAGELIST$0);
            }
            target.set(messageList);
        }
    }
    
    /**
     * Appends and returns a new empty "MessageList" element
     */
    public _0._1.messages._504.iec62325.MessageListDocument.MessageList addNewMessageList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.MessageListDocument.MessageList target = null;
            target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList)get_store().add_element_user(MESSAGELIST$0);
            return target;
        }
    }
    /**
     * An XML MessageList(@urn:iec62325.504:messages:1:0).
     *
     * This is a complex type.
     */
    public static class MessageListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.MessageListDocument.MessageList
    {
        
        public MessageListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGE$0 = 
            new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "Message");
        
        
        /**
         * Gets array of all "Message" elements
         */
        public _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message[] getMessageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MESSAGE$0, targetList);
                _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message[] result = new _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Message" element
         */
        public _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message getMessageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message target = null;
                target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message)get_store().find_element_user(MESSAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Message" element
         */
        public int sizeOfMessageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGE$0);
            }
        }
        
        /**
         * Sets array of all "Message" element
         */
        public void setMessageArray(_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message[] messageArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(messageArray, MESSAGE$0);
            }
        }
        
        /**
         * Sets ith "Message" element
         */
        public void setMessageArray(int i, _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message target = null;
                target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message)get_store().find_element_user(MESSAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(message);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Message" element
         */
        public _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message insertNewMessage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message target = null;
                target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message)get_store().insert_element_user(MESSAGE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Message" element
         */
        public _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message addNewMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message target = null;
                target = (_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message)get_store().add_element_user(MESSAGE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Message" element
         */
        public void removeMessage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGE$0, i);
            }
        }
        /**
         * An XML Message(@urn:iec62325.504:messages:1:0).
         *
         * This is a complex type.
         */
        public static class MessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message
        {
            
            public MessageImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CODE$0 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "Code");
            private static final javax.xml.namespace.QName MESSAGEIDENTIFICATION$2 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "MessageIdentification");
            private static final javax.xml.namespace.QName MESSAGEVERSION$4 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "MessageVersion");
            private static final javax.xml.namespace.QName STATUS$6 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "Status");
            private static final javax.xml.namespace.QName APPLICATIONTIMEINTERVAL$8 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "ApplicationTimeInterval");
            private static final javax.xml.namespace.QName SERVERTIMESTAMP$10 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "ServerTimestamp");
            private static final javax.xml.namespace.QName TYPE$12 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "Type");
            private static final javax.xml.namespace.QName OWNER$14 = 
                new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "Owner");
            
            
            /**
             * Gets the "Code" element
             */
            public java.math.BigInteger getCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "Code" element
             */
            public org.apache.xmlbeans.XmlPositiveInteger xgetCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(CODE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Code" element
             */
            public void setCode(java.math.BigInteger code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
                    }
                    target.setBigIntegerValue(code);
                }
            }
            
            /**
             * Sets (as xml) the "Code" element
             */
            public void xsetCode(org.apache.xmlbeans.XmlPositiveInteger code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(CODE$0);
                    }
                    target.set(code);
                }
            }
            
            /**
             * Gets the "MessageIdentification" element
             */
            public java.lang.String getMessageIdentification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEIDENTIFICATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "MessageIdentification" element
             */
            public org.apache.xmlbeans.XmlString xgetMessageIdentification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEIDENTIFICATION$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "MessageIdentification" element
             */
            public void setMessageIdentification(java.lang.String messageIdentification)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEIDENTIFICATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEIDENTIFICATION$2);
                    }
                    target.setStringValue(messageIdentification);
                }
            }
            
            /**
             * Sets (as xml) the "MessageIdentification" element
             */
            public void xsetMessageIdentification(org.apache.xmlbeans.XmlString messageIdentification)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGEIDENTIFICATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGEIDENTIFICATION$2);
                    }
                    target.set(messageIdentification);
                }
            }
            
            /**
             * Gets the "MessageVersion" element
             */
            public java.math.BigInteger getMessageVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "MessageVersion" element
             */
            public org.apache.xmlbeans.XmlPositiveInteger xgetMessageVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MESSAGEVERSION$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "MessageVersion" element
             */
            public boolean isSetMessageVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MESSAGEVERSION$4) != 0;
                }
            }
            
            /**
             * Sets the "MessageVersion" element
             */
            public void setMessageVersion(java.math.BigInteger messageVersion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEVERSION$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEVERSION$4);
                    }
                    target.setBigIntegerValue(messageVersion);
                }
            }
            
            /**
             * Sets (as xml) the "MessageVersion" element
             */
            public void xsetMessageVersion(org.apache.xmlbeans.XmlPositiveInteger messageVersion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MESSAGEVERSION$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MESSAGEVERSION$4);
                    }
                    target.set(messageVersion);
                }
            }
            
            /**
             * Unsets the "MessageVersion" element
             */
            public void unsetMessageVersion()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MESSAGEVERSION$4, 0);
                }
            }
            
            /**
             * Gets the "Status" element
             */
            public _0._1.messages._504.iec62325.StatusType.Enum getStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (_0._1.messages._504.iec62325.StatusType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Status" element
             */
            public _0._1.messages._504.iec62325.StatusType xgetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    _0._1.messages._504.iec62325.StatusType target = null;
                    target = (_0._1.messages._504.iec62325.StatusType)get_store().find_element_user(STATUS$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Status" element
             */
            public boolean isSetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(STATUS$6) != 0;
                }
            }
            
            /**
             * Sets the "Status" element
             */
            public void setStatus(_0._1.messages._504.iec62325.StatusType.Enum status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
                    }
                    target.setEnumValue(status);
                }
            }
            
            /**
             * Sets (as xml) the "Status" element
             */
            public void xsetStatus(_0._1.messages._504.iec62325.StatusType status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    _0._1.messages._504.iec62325.StatusType target = null;
                    target = (_0._1.messages._504.iec62325.StatusType)get_store().find_element_user(STATUS$6, 0);
                    if (target == null)
                    {
                      target = (_0._1.messages._504.iec62325.StatusType)get_store().add_element_user(STATUS$6);
                    }
                    target.set(status);
                }
            }
            
            /**
             * Unsets the "Status" element
             */
            public void unsetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(STATUS$6, 0);
                }
            }
            
            /**
             * Gets the "ApplicationTimeInterval" element
             */
            public _0._1.messages._504.iec62325.TimeIntervalType getApplicationTimeInterval()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    _0._1.messages._504.iec62325.TimeIntervalType target = null;
                    target = (_0._1.messages._504.iec62325.TimeIntervalType)get_store().find_element_user(APPLICATIONTIMEINTERVAL$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ApplicationTimeInterval" element
             */
            public void setApplicationTimeInterval(_0._1.messages._504.iec62325.TimeIntervalType applicationTimeInterval)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    _0._1.messages._504.iec62325.TimeIntervalType target = null;
                    target = (_0._1.messages._504.iec62325.TimeIntervalType)get_store().find_element_user(APPLICATIONTIMEINTERVAL$8, 0);
                    if (target == null)
                    {
                      target = (_0._1.messages._504.iec62325.TimeIntervalType)get_store().add_element_user(APPLICATIONTIMEINTERVAL$8);
                    }
                    target.set(applicationTimeInterval);
                }
            }
            
            /**
             * Appends and returns a new empty "ApplicationTimeInterval" element
             */
            public _0._1.messages._504.iec62325.TimeIntervalType addNewApplicationTimeInterval()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    _0._1.messages._504.iec62325.TimeIntervalType target = null;
                    target = (_0._1.messages._504.iec62325.TimeIntervalType)get_store().add_element_user(APPLICATIONTIMEINTERVAL$8);
                    return target;
                }
            }
            
            /**
             * Gets the "ServerTimestamp" element
             */
            public java.util.Calendar getServerTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERTIMESTAMP$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ServerTimestamp" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetServerTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SERVERTIMESTAMP$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ServerTimestamp" element
             */
            public void setServerTimestamp(java.util.Calendar serverTimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVERTIMESTAMP$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVERTIMESTAMP$10);
                    }
                    target.setCalendarValue(serverTimestamp);
                }
            }
            
            /**
             * Sets (as xml) the "ServerTimestamp" element
             */
            public void xsetServerTimestamp(org.apache.xmlbeans.XmlDateTime serverTimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SERVERTIMESTAMP$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SERVERTIMESTAMP$10);
                    }
                    target.set(serverTimestamp);
                }
            }
            
            /**
             * Gets the "Type" element
             */
            public java.lang.String getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" element
             */
            public org.apache.xmlbeans.XmlString xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Type" element
             */
            public void setType(java.lang.String type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$12);
                    }
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" element
             */
            public void xsetType(org.apache.xmlbeans.XmlString type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$12);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Gets the "Owner" element
             */
            public java.lang.String getOwner()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Owner" element
             */
            public org.apache.xmlbeans.XmlString xgetOwner()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$14, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "Owner" element
             */
            public void setOwner(java.lang.String owner)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNER$14);
                    }
                    target.setStringValue(owner);
                }
            }
            
            /**
             * Sets (as xml) the "Owner" element
             */
            public void xsetOwner(org.apache.xmlbeans.XmlString owner)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNER$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNER$14);
                    }
                    target.set(owner);
                }
            }
        }
    }
}
