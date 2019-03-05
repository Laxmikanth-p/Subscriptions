/*
 * XML Type:  OperationType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.OperationType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML OperationType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class OperationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.OperationType
{
    
    public OperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONID$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "operationId");
    private static final javax.xml.namespace.QName NOUN$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "noun");
    private static final javax.xml.namespace.QName VERB$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "verb");
    private static final javax.xml.namespace.QName ELEMENTOPERATION$6 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "elementOperation");
    
    
    /**
     * Gets the "operationId" element
     */
    public java.math.BigInteger getOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPERATIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "operationId" element
     */
    public void setOperationId(java.math.BigInteger operationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONID$0);
            }
            target.setBigIntegerValue(operationId);
        }
    }
    
    /**
     * Sets (as xml) the "operationId" element
     */
    public void xsetOperationId(org.apache.xmlbeans.XmlInteger operationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPERATIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(OPERATIONID$0);
            }
            target.set(operationId);
        }
    }
    
    /**
     * Gets the "noun" element
     */
    public java.lang.String getNoun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOUN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "noun" element
     */
    public org.apache.xmlbeans.XmlString xgetNoun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOUN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "noun" element
     */
    public boolean isSetNoun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOUN$2) != 0;
        }
    }
    
    /**
     * Sets the "noun" element
     */
    public void setNoun(java.lang.String noun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOUN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOUN$2);
            }
            target.setStringValue(noun);
        }
    }
    
    /**
     * Sets (as xml) the "noun" element
     */
    public void xsetNoun(org.apache.xmlbeans.XmlString noun)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOUN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOUN$2);
            }
            target.set(noun);
        }
    }
    
    /**
     * Unsets the "noun" element
     */
    public void unsetNoun()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOUN$2, 0);
        }
    }
    
    /**
     * Gets the "verb" element
     */
    public java.lang.String getVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERB$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "verb" element
     */
    public org.apache.xmlbeans.XmlString xgetVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERB$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "verb" element
     */
    public boolean isSetVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERB$4) != 0;
        }
    }
    
    /**
     * Sets the "verb" element
     */
    public void setVerb(java.lang.String verb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERB$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERB$4);
            }
            target.setStringValue(verb);
        }
    }
    
    /**
     * Sets (as xml) the "verb" element
     */
    public void xsetVerb(org.apache.xmlbeans.XmlString verb)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERB$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERB$4);
            }
            target.set(verb);
        }
    }
    
    /**
     * Unsets the "verb" element
     */
    public void unsetVerb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERB$4, 0);
        }
    }
    
    /**
     * Gets the "elementOperation" element
     */
    public boolean getElementOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTOPERATION$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "elementOperation" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetElementOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ELEMENTOPERATION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "elementOperation" element
     */
    public boolean isSetElementOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELEMENTOPERATION$6) != 0;
        }
    }
    
    /**
     * Sets the "elementOperation" element
     */
    public void setElementOperation(boolean elementOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ELEMENTOPERATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ELEMENTOPERATION$6);
            }
            target.setBooleanValue(elementOperation);
        }
    }
    
    /**
     * Sets (as xml) the "elementOperation" element
     */
    public void xsetElementOperation(org.apache.xmlbeans.XmlBoolean elementOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ELEMENTOPERATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ELEMENTOPERATION$6);
            }
            target.set(elementOperation);
        }
    }
    
    /**
     * Unsets the "elementOperation" element
     */
    public void unsetElementOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELEMENTOPERATION$6, 0);
        }
    }
}
