/*
 * XML Type:  ReplayDetectionType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ReplayDetectionType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML ReplayDetectionType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class ReplayDetectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.ReplayDetectionType
{
    
    public ReplayDetectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NONCE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Nonce");
    private static final javax.xml.namespace.QName CREATED$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Created");
    
    
    /**
     * Gets the "Nonce" element
     */
    public java.lang.String getNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Nonce" element
     */
    public org.apache.xmlbeans.XmlString xgetNonce()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NONCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Nonce" element
     */
    public void setNonce(java.lang.String nonce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NONCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NONCE$0);
            }
            target.setStringValue(nonce);
        }
    }
    
    /**
     * Sets (as xml) the "Nonce" element
     */
    public void xsetNonce(org.apache.xmlbeans.XmlString nonce)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NONCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NONCE$0);
            }
            target.set(nonce);
        }
    }
    
    /**
     * Gets the "Created" element
     */
    public java.util.Calendar getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Created" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Created" element
     */
    public void setCreated(java.util.Calendar created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$2);
            }
            target.setCalendarValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "Created" element
     */
    public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$2);
            }
            target.set(created);
        }
    }
}
