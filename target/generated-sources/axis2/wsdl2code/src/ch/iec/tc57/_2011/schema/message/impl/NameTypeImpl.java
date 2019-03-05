/*
 * XML Type:  NameType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.NameType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML NameType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class NameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.NameType
{
    
    public NameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "description");
    private static final javax.xml.namespace.QName NAMETYPEAUTHORITY$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "NameTypeAuthority");
    
    
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
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "NameTypeAuthority" element
     */
    public ch.iec.tc57._2011.schema.message.NameTypeAuthority getNameTypeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.NameTypeAuthority target = null;
            target = (ch.iec.tc57._2011.schema.message.NameTypeAuthority)get_store().find_element_user(NAMETYPEAUTHORITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NameTypeAuthority" element
     */
    public boolean isSetNameTypeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAMETYPEAUTHORITY$4) != 0;
        }
    }
    
    /**
     * Sets the "NameTypeAuthority" element
     */
    public void setNameTypeAuthority(ch.iec.tc57._2011.schema.message.NameTypeAuthority nameTypeAuthority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.NameTypeAuthority target = null;
            target = (ch.iec.tc57._2011.schema.message.NameTypeAuthority)get_store().find_element_user(NAMETYPEAUTHORITY$4, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.NameTypeAuthority)get_store().add_element_user(NAMETYPEAUTHORITY$4);
            }
            target.set(nameTypeAuthority);
        }
    }
    
    /**
     * Appends and returns a new empty "NameTypeAuthority" element
     */
    public ch.iec.tc57._2011.schema.message.NameTypeAuthority addNewNameTypeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.NameTypeAuthority target = null;
            target = (ch.iec.tc57._2011.schema.message.NameTypeAuthority)get_store().add_element_user(NAMETYPEAUTHORITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "NameTypeAuthority" element
     */
    public void unsetNameTypeAuthority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAMETYPEAUTHORITY$4, 0);
        }
    }
}
