/*
 * XML Type:  ESMP_DateTimeInterval
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325.impl;
/**
 * An XML ESMP_DateTimeInterval(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public class ESMPDateTimeIntervalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval
{
    private static final long serialVersionUID = 1L;
    
    public ESMPDateTimeIntervalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName START$0 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "start");
    private static final javax.xml.namespace.QName END$2 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "end");
    
    
    /**
     * Gets the "start" element
     */
    public java.lang.String getStart()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime)get_store().find_element_user(START$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(java.lang.String start)
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
            target.setStringValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" element
     */
    public void xsetStart(x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime)get_store().find_element_user(START$0, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime)get_store().add_element_user(START$0);
            }
            target.set(start);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public java.lang.String getEnd()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "end" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime)get_store().find_element_user(END$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(java.lang.String end)
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
            target.setStringValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "end" element
     */
    public void xsetEnd(x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime)get_store().find_element_user(END$2, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.YMDHMDateTime)get_store().add_element_user(END$2);
            }
            target.set(end);
        }
    }
}
