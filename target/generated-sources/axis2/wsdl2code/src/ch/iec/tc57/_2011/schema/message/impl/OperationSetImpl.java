/*
 * XML Type:  OperationSet
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.OperationSet
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML OperationSet(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class OperationSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.OperationSet
{
    
    public OperationSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENFORCEMSGSEQUENCE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "enforceMsgSequence");
    private static final javax.xml.namespace.QName ENFORCETRANSACTIONALINTEGRITY$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "enforceTransactionalIntegrity");
    private static final javax.xml.namespace.QName OPERATION$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Operation");
    
    
    /**
     * Gets the "enforceMsgSequence" element
     */
    public boolean getEnforceMsgSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCEMSGSEQUENCE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enforceMsgSequence" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnforceMsgSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCEMSGSEQUENCE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "enforceMsgSequence" element
     */
    public boolean isSetEnforceMsgSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENFORCEMSGSEQUENCE$0) != 0;
        }
    }
    
    /**
     * Sets the "enforceMsgSequence" element
     */
    public void setEnforceMsgSequence(boolean enforceMsgSequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCEMSGSEQUENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENFORCEMSGSEQUENCE$0);
            }
            target.setBooleanValue(enforceMsgSequence);
        }
    }
    
    /**
     * Sets (as xml) the "enforceMsgSequence" element
     */
    public void xsetEnforceMsgSequence(org.apache.xmlbeans.XmlBoolean enforceMsgSequence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCEMSGSEQUENCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENFORCEMSGSEQUENCE$0);
            }
            target.set(enforceMsgSequence);
        }
    }
    
    /**
     * Unsets the "enforceMsgSequence" element
     */
    public void unsetEnforceMsgSequence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENFORCEMSGSEQUENCE$0, 0);
        }
    }
    
    /**
     * Gets the "enforceTransactionalIntegrity" element
     */
    public boolean getEnforceTransactionalIntegrity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCETRANSACTIONALINTEGRITY$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "enforceTransactionalIntegrity" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEnforceTransactionalIntegrity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCETRANSACTIONALINTEGRITY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "enforceTransactionalIntegrity" element
     */
    public boolean isSetEnforceTransactionalIntegrity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENFORCETRANSACTIONALINTEGRITY$2) != 0;
        }
    }
    
    /**
     * Sets the "enforceTransactionalIntegrity" element
     */
    public void setEnforceTransactionalIntegrity(boolean enforceTransactionalIntegrity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENFORCETRANSACTIONALINTEGRITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENFORCETRANSACTIONALINTEGRITY$2);
            }
            target.setBooleanValue(enforceTransactionalIntegrity);
        }
    }
    
    /**
     * Sets (as xml) the "enforceTransactionalIntegrity" element
     */
    public void xsetEnforceTransactionalIntegrity(org.apache.xmlbeans.XmlBoolean enforceTransactionalIntegrity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENFORCETRANSACTIONALINTEGRITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENFORCETRANSACTIONALINTEGRITY$2);
            }
            target.set(enforceTransactionalIntegrity);
        }
    }
    
    /**
     * Unsets the "enforceTransactionalIntegrity" element
     */
    public void unsetEnforceTransactionalIntegrity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENFORCETRANSACTIONALINTEGRITY$2, 0);
        }
    }
    
    /**
     * Gets array of all "Operation" elements
     */
    public ch.iec.tc57._2011.schema.message.OperationType[] getOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPERATION$4, targetList);
            ch.iec.tc57._2011.schema.message.OperationType[] result = new ch.iec.tc57._2011.schema.message.OperationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Operation" element
     */
    public ch.iec.tc57._2011.schema.message.OperationType getOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OperationType target = null;
            target = (ch.iec.tc57._2011.schema.message.OperationType)get_store().find_element_user(OPERATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Operation" element
     */
    public int sizeOfOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATION$4);
        }
    }
    
    /**
     * Sets array of all "Operation" element
     */
    public void setOperationArray(ch.iec.tc57._2011.schema.message.OperationType[] operationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(operationArray, OPERATION$4);
        }
    }
    
    /**
     * Sets ith "Operation" element
     */
    public void setOperationArray(int i, ch.iec.tc57._2011.schema.message.OperationType operation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OperationType target = null;
            target = (ch.iec.tc57._2011.schema.message.OperationType)get_store().find_element_user(OPERATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(operation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Operation" element
     */
    public ch.iec.tc57._2011.schema.message.OperationType insertNewOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OperationType target = null;
            target = (ch.iec.tc57._2011.schema.message.OperationType)get_store().insert_element_user(OPERATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Operation" element
     */
    public ch.iec.tc57._2011.schema.message.OperationType addNewOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.OperationType target = null;
            target = (ch.iec.tc57._2011.schema.message.OperationType)get_store().add_element_user(OPERATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Operation" element
     */
    public void removeOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATION$4, i);
        }
    }
}
