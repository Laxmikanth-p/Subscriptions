/*
 * XML Type:  Time_Period
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325.impl;
/**
 * An XML Time_Period(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public class TimePeriodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEINTERVAL$0 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "timeInterval");
    private static final javax.xml.namespace.QName REASON$2 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "Reason");
    
    
    /**
     * Gets the "timeInterval" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval getTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval)get_store().find_element_user(TIMEINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timeInterval" element
     */
    public void setTimeInterval(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval timeInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval)get_store().find_element_user(TIMEINTERVAL$0, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval)get_store().add_element_user(TIMEINTERVAL$0);
            }
            target.set(timeInterval);
        }
    }
    
    /**
     * Appends and returns a new empty "timeInterval" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval addNewTimeInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPDateTimeInterval)get_store().add_element_user(TIMEINTERVAL$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "Reason" elements
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] getReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REASON$2, targetList);
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] result = new x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Reason" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason getReasonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().find_element_user(REASON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Reason" element
     */
    public int sizeOfReasonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$2);
        }
    }
    
    /**
     * Sets array of all "Reason" element
     */
    public void setReasonArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason[] reasonArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(reasonArray, REASON$2);
        }
    }
    
    /**
     * Sets ith "Reason" element
     */
    public void setReasonArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().find_element_user(REASON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(reason);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Reason" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason insertNewReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().insert_element_user(REASON$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Reason" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason addNewReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().add_element_user(REASON$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Reason" element
     */
    public void removeReason(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$2, i);
        }
    }
}
