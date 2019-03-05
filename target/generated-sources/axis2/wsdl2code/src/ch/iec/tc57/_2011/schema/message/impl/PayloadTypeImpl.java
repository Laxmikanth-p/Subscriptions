/*
 * XML Type:  PayloadType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.PayloadType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML PayloadType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class PayloadTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.PayloadType
{
    
    public PayloadTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONSET$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "OperationSet");
    private static final javax.xml.namespace.QName COMPRESSED$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Compressed");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "ID");
    private static final javax.xml.namespace.QName FORMAT$6 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Format");
    
    
    /**
     * Gets the "OperationSet" element
     */
    public ch.iec.tc57._2011.schema.message.OperationSet getOperationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OperationSet target = null;
            target = (ch.iec.tc57._2011.schema.message.OperationSet)get_store().find_element_user(OPERATIONSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OperationSet" element
     */
    public boolean isSetOperationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONSET$0) != 0;
        }
    }
    
    /**
     * Sets the "OperationSet" element
     */
    public void setOperationSet(ch.iec.tc57._2011.schema.message.OperationSet operationSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OperationSet target = null;
            target = (ch.iec.tc57._2011.schema.message.OperationSet)get_store().find_element_user(OPERATIONSET$0, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.OperationSet)get_store().add_element_user(OPERATIONSET$0);
            }
            target.set(operationSet);
        }
    }
    
    /**
     * Appends and returns a new empty "OperationSet" element
     */
    public ch.iec.tc57._2011.schema.message.OperationSet addNewOperationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OperationSet target = null;
            target = (ch.iec.tc57._2011.schema.message.OperationSet)get_store().add_element_user(OPERATIONSET$0);
            return target;
        }
    }
    
    /**
     * Unsets the "OperationSet" element
     */
    public void unsetOperationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONSET$0, 0);
        }
    }
    
    /**
     * Gets the "Compressed" element
     */
    public java.lang.String getCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Compressed" element
     */
    public org.apache.xmlbeans.XmlString xgetCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPRESSED$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Compressed" element
     */
    public boolean isSetCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPRESSED$2) != 0;
        }
    }
    
    /**
     * Sets the "Compressed" element
     */
    public void setCompressed(java.lang.String compressed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPRESSED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPRESSED$2);
            }
            target.setStringValue(compressed);
        }
    }
    
    /**
     * Sets (as xml) the "Compressed" element
     */
    public void xsetCompressed(org.apache.xmlbeans.XmlString compressed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPRESSED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPRESSED$2);
            }
            target.set(compressed);
        }
    }
    
    /**
     * Unsets the "Compressed" element
     */
    public void unsetCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPRESSED$2, 0);
        }
    }
    
    /**
     * Gets array of all "ID" elements
     */
    public ch.iec.tc57._2011.schema.message.PayloadType.ID[] getIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$4, targetList);
            ch.iec.tc57._2011.schema.message.PayloadType.ID[] result = new ch.iec.tc57._2011.schema.message.PayloadType.ID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ID" element
     */
    public ch.iec.tc57._2011.schema.message.PayloadType.ID getIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.PayloadType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.PayloadType.ID)get_store().find_element_user(ID$4, i);
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
            return get_store().count_elements(ID$4);
        }
    }
    
    /**
     * Sets array of all "ID" element
     */
    public void setIDArray(ch.iec.tc57._2011.schema.message.PayloadType.ID[] idArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idArray, ID$4);
        }
    }
    
    /**
     * Sets ith "ID" element
     */
    public void setIDArray(int i, ch.iec.tc57._2011.schema.message.PayloadType.ID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.PayloadType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.PayloadType.ID)get_store().find_element_user(ID$4, i);
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
    public ch.iec.tc57._2011.schema.message.PayloadType.ID insertNewID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.PayloadType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.PayloadType.ID)get_store().insert_element_user(ID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ID" element
     */
    public ch.iec.tc57._2011.schema.message.PayloadType.ID addNewID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.PayloadType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.PayloadType.ID)get_store().add_element_user(ID$4);
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
            get_store().remove_element(ID$4, i);
        }
    }
    
    /**
     * Gets the "Format" element
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Format" element
     */
    public org.apache.xmlbeans.XmlString xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMAT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Format" element
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$6) != 0;
        }
    }
    
    /**
     * Sets the "Format" element
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$6);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "Format" element
     */
    public void xsetFormat(org.apache.xmlbeans.XmlString format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMAT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMAT$6);
            }
            target.set(format);
        }
    }
    
    /**
     * Unsets the "Format" element
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$6, 0);
        }
    }
    /**
     * An XML ID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.PayloadType$ID.
     */
    public static class IDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements ch.iec.tc57._2011.schema.message.PayloadType.ID
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
