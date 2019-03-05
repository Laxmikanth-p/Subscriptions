/*
 * XML Type:  RequestType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.RequestType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML RequestType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class RequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.RequestType
{
    
    public RequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTTIME$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "StartTime");
    private static final javax.xml.namespace.QName ENDTIME$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "EndTime");
    private static final javax.xml.namespace.QName OPTION$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Option");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "ID");
    
    
    /**
     * Gets the "StartTime" element
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "StartTime" element
     */
    public boolean isSetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "StartTime" element
     */
    public void setStartTime(java.util.Calendar startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$0);
            }
            target.setCalendarValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "StartTime" element
     */
    public void xsetStartTime(org.apache.xmlbeans.XmlDateTime startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTTIME$0);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Unsets the "StartTime" element
     */
    public void unsetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTTIME$0, 0);
        }
    }
    
    /**
     * Gets the "EndTime" element
     */
    public java.util.Calendar getEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "EndTime" element
     */
    public boolean isSetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "EndTime" element
     */
    public void setEndTime(java.util.Calendar endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$2);
            }
            target.setCalendarValue(endTime);
        }
    }
    
    /**
     * Sets (as xml) the "EndTime" element
     */
    public void xsetEndTime(org.apache.xmlbeans.XmlDateTime endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ENDTIME$2);
            }
            target.set(endTime);
        }
    }
    
    /**
     * Unsets the "EndTime" element
     */
    public void unsetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDTIME$2, 0);
        }
    }
    
    /**
     * Gets array of all "Option" elements
     */
    public ch.iec.tc57._2011.schema.message.OptionType[] getOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTION$4, targetList);
            ch.iec.tc57._2011.schema.message.OptionType[] result = new ch.iec.tc57._2011.schema.message.OptionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Option" element
     */
    public ch.iec.tc57._2011.schema.message.OptionType getOptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OptionType target = null;
            target = (ch.iec.tc57._2011.schema.message.OptionType)get_store().find_element_user(OPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Option" element
     */
    public int sizeOfOptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTION$4);
        }
    }
    
    /**
     * Sets array of all "Option" element
     */
    public void setOptionArray(ch.iec.tc57._2011.schema.message.OptionType[] optionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionArray, OPTION$4);
        }
    }
    
    /**
     * Sets ith "Option" element
     */
    public void setOptionArray(int i, ch.iec.tc57._2011.schema.message.OptionType option)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OptionType target = null;
            target = (ch.iec.tc57._2011.schema.message.OptionType)get_store().find_element_user(OPTION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(option);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Option" element
     */
    public ch.iec.tc57._2011.schema.message.OptionType insertNewOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OptionType target = null;
            target = (ch.iec.tc57._2011.schema.message.OptionType)get_store().insert_element_user(OPTION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Option" element
     */
    public ch.iec.tc57._2011.schema.message.OptionType addNewOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OptionType target = null;
            target = (ch.iec.tc57._2011.schema.message.OptionType)get_store().add_element_user(OPTION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Option" element
     */
    public void removeOption(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTION$4, i);
        }
    }
    
    /**
     * Gets array of all "ID" elements
     */
    public ch.iec.tc57._2011.schema.message.RequestType.ID[] getIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$6, targetList);
            ch.iec.tc57._2011.schema.message.RequestType.ID[] result = new ch.iec.tc57._2011.schema.message.RequestType.ID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ID" element
     */
    public ch.iec.tc57._2011.schema.message.RequestType.ID getIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestType.ID)get_store().find_element_user(ID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ID" element
     */
    public int sizeOfIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$6);
        }
    }
    
    /**
     * Sets array of all "ID" element
     */
    public void setIDArray(ch.iec.tc57._2011.schema.message.RequestType.ID[] idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$6);
        }
    }
    
    /**
     * Sets ith "ID" element
     */
    public void setIDArray(int i, ch.iec.tc57._2011.schema.message.RequestType.ID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestType.ID)get_store().find_element_user(ID$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(id);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ID" element
     */
    public ch.iec.tc57._2011.schema.message.RequestType.ID insertNewID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestType.ID)get_store().insert_element_user(ID$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ID" element
     */
    public ch.iec.tc57._2011.schema.message.RequestType.ID addNewID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.RequestType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.RequestType.ID)get_store().add_element_user(ID$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ID" element
     */
    public void removeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$6, i);
        }
    }
    /**
     * An XML ID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.RequestType$ID.
     */
    public static class IDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements ch.iec.tc57._2011.schema.message.RequestType.ID
    {
        
        public IDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected IDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName IDTYPE$0 = 
            new javax.xml.namespace.QName("", "idType");
        private static final javax.xml.namespace.QName IDAUTHORITY$2 = 
            new javax.xml.namespace.QName("", "idAuthority");
        private static final javax.xml.namespace.QName KIND$4 = 
            new javax.xml.namespace.QName("", "kind");
        private static final javax.xml.namespace.QName OBJECTTYPE$6 = 
            new javax.xml.namespace.QName("", "objectType");
        
        
        /**
         * Gets the "idType" attribute
         */
        public java.lang.String getIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDTYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "idType" attribute
         */
        public boolean isSetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "idType" attribute
         */
        public void setIdType(java.lang.String idType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDTYPE$0);
                }
                target.setStringValue(idType);
            }
        }
        
        /**
         * Sets (as xml) the "idType" attribute
         */
        public void xsetIdType(org.apache.xmlbeans.XmlString idType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDTYPE$0);
                }
                target.set(idType);
            }
        }
        
        /**
         * Unsets the "idType" attribute
         */
        public void unsetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDTYPE$0);
            }
        }
        
        /**
         * Gets the "idAuthority" attribute
         */
        public java.lang.String getIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idAuthority" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDAUTHORITY$2);
                return target;
            }
        }
        
        /**
         * True if has "idAuthority" attribute
         */
        public boolean isSetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDAUTHORITY$2) != null;
            }
        }
        
        /**
         * Sets the "idAuthority" attribute
         */
        public void setIdAuthority(java.lang.String idAuthority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDAUTHORITY$2);
                }
                target.setStringValue(idAuthority);
            }
        }
        
        /**
         * Sets (as xml) the "idAuthority" attribute
         */
        public void xsetIdAuthority(org.apache.xmlbeans.XmlString idAuthority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDAUTHORITY$2);
                }
                target.set(idAuthority);
            }
        }
        
        /**
         * Unsets the "idAuthority" attribute
         */
        public void unsetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDAUTHORITY$2);
            }
        }
        
        /**
         * Gets the "kind" attribute
         */
        public ch.iec.tc57._2011.schema.message.IDKindType.Enum getKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    return null;
                }
                return (ch.iec.tc57._2011.schema.message.IDKindType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "kind" attribute
         */
        public ch.iec.tc57._2011.schema.message.IDKindType xgetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ch.iec.tc57._2011.schema.message.IDKindType target = null;
                target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().find_attribute_user(KIND$4);
                return target;
            }
        }
        
        /**
         * True if has "kind" attribute
         */
        public boolean isSetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KIND$4) != null;
            }
        }
        
        /**
         * Sets the "kind" attribute
         */
        public void setKind(ch.iec.tc57._2011.schema.message.IDKindType.Enum kind)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KIND$4);
                }
                target.setEnumValue(kind);
            }
        }
        
        /**
         * Sets (as xml) the "kind" attribute
         */
        public void xsetKind(ch.iec.tc57._2011.schema.message.IDKindType kind)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ch.iec.tc57._2011.schema.message.IDKindType target = null;
                target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().add_attribute_user(KIND$4);
                }
                target.set(kind);
            }
        }
        
        /**
         * Unsets the "kind" attribute
         */
        public void unsetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KIND$4);
            }
        }
        
        /**
         * Gets the "objectType" attribute
         */
        public java.lang.String getObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "objectType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "objectType" attribute
         */
        public boolean isSetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OBJECTTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "objectType" attribute
         */
        public void setObjectType(java.lang.String objectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$6);
                }
                target.setStringValue(objectType);
            }
        }
        
        /**
         * Sets (as xml) the "objectType" attribute
         */
        public void xsetObjectType(org.apache.xmlbeans.XmlString objectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OBJECTTYPE$6);
                }
                target.set(objectType);
            }
        }
        
        /**
         * Unsets the "objectType" attribute
         */
        public void unsetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OBJECTTYPE$6);
            }
        }
    }
}
