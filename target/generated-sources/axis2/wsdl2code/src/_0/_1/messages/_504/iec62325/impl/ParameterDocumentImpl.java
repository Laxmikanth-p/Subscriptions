/*
 * An XML document type.
 * Localname: Parameter
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.ParameterDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325.impl;
/**
 * A document containing one Parameter(@urn:iec62325.504:messages:1:0) element.
 *
 * This is a complex type.
 */
public class ParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.ParameterDocument
{
    
    public ParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "Parameter");
    
    
    /**
     * Gets the "Parameter" element
     */
    public _0._1.messages._504.iec62325.ParameterDocument.Parameter getParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.ParameterDocument.Parameter target = null;
            target = (_0._1.messages._504.iec62325.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Parameter" element
     */
    public void setParameter(_0._1.messages._504.iec62325.ParameterDocument.Parameter parameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.ParameterDocument.Parameter target = null;
            target = (_0._1.messages._504.iec62325.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, 0);
            if (target == null)
            {
                target = (_0._1.messages._504.iec62325.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$0);
            }
            target.set(parameter);
        }
    }
    
    /**
     * Appends and returns a new empty "Parameter" element
     */
    public _0._1.messages._504.iec62325.ParameterDocument.Parameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.ParameterDocument.Parameter target = null;
            target = (_0._1.messages._504.iec62325.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    /**
     * An XML Parameter(@urn:iec62325.504:messages:1:0).
     *
     * This is a complex type.
     */
    public static class ParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.ParameterDocument.Parameter
    {
        
        public ParameterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "name");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "value");
        
        
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
         * Gets the "value" element
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" element
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "value" element
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALUE$2) != 0;
            }
        }
        
        /**
         * Sets the "value" element
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" element
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" element
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALUE$2, 0);
            }
        }
    }
}
