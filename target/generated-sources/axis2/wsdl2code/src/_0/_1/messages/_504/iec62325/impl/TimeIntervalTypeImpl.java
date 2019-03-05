/*
 * XML Type:  TimeIntervalType
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.TimeIntervalType
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325.impl;
/**
 * An XML TimeIntervalType(@urn:iec62325.504:messages:1:0).
 *
 * This is a complex type.
 */
public class TimeIntervalTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.TimeIntervalType
{
    
    public TimeIntervalTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "end");
    
    
    /**
     * Gets the "start" element
     */
    public java.util.Calendar getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(java.util.Calendar start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$0);
            }
            target.setCalendarValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" element
     */
    public void xsetStart(org.apache.xmlbeans.XmlDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public java.util.Calendar getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "end" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "end" element
     */
    public boolean isSetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(END$2) != 0;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(java.util.Calendar end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$2);
            }
            target.setCalendarValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "end" element
     */
    public void xsetEnd(org.apache.xmlbeans.XmlDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(END$2);
            }
            target.set(end);
        }
    }
    
    /**
     * Unsets the "end" element
     */
    public void unsetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(END$2, 0);
        }
    }
}
