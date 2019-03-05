/*
 * XML Type:  ObjectType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ObjectType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML ObjectType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class ObjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.ObjectType
{
    
    public ObjectTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MRID$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "mRID");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Name");
    private static final javax.xml.namespace.QName OBJECTTYPE$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "objectType");
    
    
    /**
     * Gets the "mRID" element
     */
    public java.lang.String getMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mRID" element
     */
    public org.apache.xmlbeans.XmlString xgetMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "mRID" element
     */
    public boolean isSetMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MRID$0) != 0;
        }
    }
    
    /**
     * Sets the "mRID" element
     */
    public void setMRID(java.lang.String mrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MRID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MRID$0);
            }
            target.setStringValue(mrid);
        }
    }
    
    /**
     * Sets (as xml) the "mRID" element
     */
    public void xsetMRID(org.apache.xmlbeans.XmlString mrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MRID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MRID$0);
            }
            target.set(mrid);
        }
    }
    
    /**
     * Unsets the "mRID" element
     */
    public void unsetMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MRID$0, 0);
        }
    }
    
    /**
     * Gets array of all "Name" elements
     */
    public ch.iec.tc57._2011.schema.message.Name[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$2, targetList);
            ch.iec.tc57._2011.schema.message.Name[] result = new ch.iec.tc57._2011.schema.message.Name[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Name" element
     */
    public ch.iec.tc57._2011.schema.message.Name getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.Name target = null;
            target = (ch.iec.tc57._2011.schema.message.Name)get_store().find_element_user(NAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2);
        }
    }
    
    /**
     * Sets array of all "Name" element
     */
    public void setNameArray(ch.iec.tc57._2011.schema.message.Name[] nameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nameArray, NAME$2);
        }
    }
    
    /**
     * Sets ith "Name" element
     */
    public void setNameArray(int i, ch.iec.tc57._2011.schema.message.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.Name target = null;
            target = (ch.iec.tc57._2011.schema.message.Name)get_store().find_element_user(NAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(name);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Name" element
     */
    public ch.iec.tc57._2011.schema.message.Name insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.Name target = null;
            target = (ch.iec.tc57._2011.schema.message.Name)get_store().insert_element_user(NAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Name" element
     */
    public ch.iec.tc57._2011.schema.message.Name addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.Name target = null;
            target = (ch.iec.tc57._2011.schema.message.Name)get_store().add_element_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, i);
        }
    }
    
    /**
     * Gets the "objectType" element
     */
    public java.lang.String getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "objectType" element
     */
    public org.apache.xmlbeans.XmlString xgetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "objectType" element
     */
    public boolean isSetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECTTYPE$4) != 0;
        }
    }
    
    /**
     * Sets the "objectType" element
     */
    public void setObjectType(java.lang.String objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPE$4);
            }
            target.setStringValue(objectType);
        }
    }
    
    /**
     * Sets (as xml) the "objectType" element
     */
    public void xsetObjectType(org.apache.xmlbeans.XmlString objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTTYPE$4);
            }
            target.set(objectType);
        }
    }
    
    /**
     * Unsets the "objectType" element
     */
    public void unsetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECTTYPE$4, 0);
        }
    }
}
