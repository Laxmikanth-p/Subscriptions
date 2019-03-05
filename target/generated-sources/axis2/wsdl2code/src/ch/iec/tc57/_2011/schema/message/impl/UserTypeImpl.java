/*
 * XML Type:  UserType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.UserType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML UserType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class UserTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.UserType
{
    
    public UserTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERID$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "UserID");
    private static final javax.xml.namespace.QName ORGANIZATION$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Organization");
    
    
    /**
     * Gets the "UserID" element
     */
    public java.lang.String getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserID" element
     */
    public org.apache.xmlbeans.XmlString xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserID" element
     */
    public void setUserID(java.lang.String userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" element
     */
    public void xsetUserID(org.apache.xmlbeans.XmlString userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$0);
            }
            target.set(userID);
        }
    }
    
    /**
     * Gets the "Organization" element
     */
    public java.lang.String getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Organization" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Organization" element
     */
    public boolean isSetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATION$2) != 0;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(java.lang.String organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATION$2);
            }
            target.setStringValue(organization);
        }
    }
    
    /**
     * Sets (as xml) the "Organization" element
     */
    public void xsetOrganization(org.apache.xmlbeans.XmlString organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATION$2);
            }
            target.set(organization);
        }
    }
    
    /**
     * Unsets the "Organization" element
     */
    public void unsetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATION$2, 0);
        }
    }
}
