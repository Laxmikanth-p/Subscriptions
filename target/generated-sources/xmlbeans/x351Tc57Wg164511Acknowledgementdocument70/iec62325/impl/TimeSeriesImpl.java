/*
 * XML Type:  TimeSeries
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325.impl;
/**
 * An XML TimeSeries(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public class TimeSeriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimeSeries
{
    private static final long serialVersionUID = 1L;
    
    public TimeSeriesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MRID$0 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "mRID");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "version");
    private static final javax.xml.namespace.QName INERRORPERIOD$4 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "InError_Period");
    private static final javax.xml.namespace.QName REASON$6 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "Reason");
    
    
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
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString xgetMRID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().find_element_user(MRID$0, 0);
            return target;
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
    public void xsetMRID(x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString mrid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().find_element_user(MRID$0, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.IDString)get_store().add_element_user(MRID$0);
            }
            target.set(mrid);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString)get_store().find_element_user(VERSION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$2);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ESMPVersionString)get_store().add_element_user(VERSION$2);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$2, 0);
        }
    }
    
    /**
     * Gets array of all "InError_Period" elements
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] getInErrorPeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INERRORPERIOD$4, targetList);
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] result = new x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InError_Period" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod getInErrorPeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().find_element_user(INERRORPERIOD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InError_Period" element
     */
    public int sizeOfInErrorPeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INERRORPERIOD$4);
        }
    }
    
    /**
     * Sets array of all "InError_Period" element
     */
    public void setInErrorPeriodArray(x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod[] inErrorPeriodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inErrorPeriodArray, INERRORPERIOD$4);
        }
    }
    
    /**
     * Sets ith "InError_Period" element
     */
    public void setInErrorPeriodArray(int i, x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod inErrorPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().find_element_user(INERRORPERIOD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inErrorPeriod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InError_Period" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod insertNewInErrorPeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().insert_element_user(INERRORPERIOD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InError_Period" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod addNewInErrorPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.TimePeriod)get_store().add_element_user(INERRORPERIOD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "InError_Period" element
     */
    public void removeInErrorPeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INERRORPERIOD$4, i);
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
            get_store().find_all_element_users(REASON$6, targetList);
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
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().find_element_user(REASON$6, i);
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
            return get_store().count_elements(REASON$6);
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
            arraySetterHelper(reasonArray, REASON$6);
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
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().find_element_user(REASON$6, i);
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
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().insert_element_user(REASON$6, i);
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
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason)get_store().add_element_user(REASON$6);
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
            get_store().remove_element(REASON$6, i);
        }
    }
}
