/*
 * XML Type:  Name
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.Name
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML Name(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class NameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.Name
{
    
    public NameImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "name");
    private static final javax.xml.namespace.QName NAMETYPE$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "NameType");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "NameType" element
     */
    public ch.iec.tc57._2011.schema.message.NameType getNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.NameType target = null;
            target = (ch.iec.tc57._2011.schema.message.NameType)get_store().find_element_user(NAMETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NameType" element
     */
    public boolean isSetNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMETYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "NameType" element
     */
    public void setNameType(ch.iec.tc57._2011.schema.message.NameType nameType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.NameType target = null;
            target = (ch.iec.tc57._2011.schema.message.NameType)get_store().find_element_user(NAMETYPE$2, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.NameType)get_store().add_element_user(NAMETYPE$2);
            }
            target.set(nameType);
        }
    }
    
    /**
     * Appends and returns a new empty "NameType" element
     */
    public ch.iec.tc57._2011.schema.message.NameType addNewNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.NameType target = null;
            target = (ch.iec.tc57._2011.schema.message.NameType)get_store().add_element_user(NAMETYPE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "NameType" element
     */
    public void unsetNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMETYPE$2, 0);
        }
    }
}
