/*
 * An XML document type.
 * Localname: ParameterList
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.ParameterListDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325.impl;
/**
 * A document containing one ParameterList(@urn:iec62325.504:messages:1:0) element.
 *
 * This is a complex type.
 */
public class ParameterListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.ParameterListDocument
{
    
    public ParameterListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERLIST$0 = 
        new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "ParameterList");
    
    
    /**
     * Gets the "ParameterList" element
     */
    public _0._1.messages._504.iec62325.ParameterListDocument.ParameterList getParameterList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.ParameterListDocument.ParameterList target = null;
            target = (_0._1.messages._504.iec62325.ParameterListDocument.ParameterList)get_store().find_element_user(PARAMETERLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ParameterList" element
     */
    public void setParameterList(_0._1.messages._504.iec62325.ParameterListDocument.ParameterList parameterList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.ParameterListDocument.ParameterList target = null;
            target = (_0._1.messages._504.iec62325.ParameterListDocument.ParameterList)get_store().find_element_user(PARAMETERLIST$0, 0);
            if (target == null)
            {
                target = (_0._1.messages._504.iec62325.ParameterListDocument.ParameterList)get_store().add_element_user(PARAMETERLIST$0);
            }
            target.set(parameterList);
        }
    }
    
    /**
     * Appends and returns a new empty "ParameterList" element
     */
    public _0._1.messages._504.iec62325.ParameterListDocument.ParameterList addNewParameterList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.ParameterListDocument.ParameterList target = null;
            target = (_0._1.messages._504.iec62325.ParameterListDocument.ParameterList)get_store().add_element_user(PARAMETERLIST$0);
            return target;
        }
    }
    /**
     * An XML ParameterList(@urn:iec62325.504:messages:1:0).
     *
     * This is a complex type.
     */
    public static class ParameterListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.ParameterListDocument.ParameterList
    {
        
        public ParameterListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMETER$0 = 
            new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "Parameter");
        
        
        /**
         * Gets array of all "Parameter" elements
         */
        public _0._1.messages._504.iec62325.ParameterDocument.Parameter[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$0, targetList);
                _0._1.messages._504.iec62325.ParameterDocument.Parameter[] result = new _0._1.messages._504.iec62325.ParameterDocument.Parameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Parameter" element
         */
        public _0._1.messages._504.iec62325.ParameterDocument.Parameter getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.ParameterDocument.Parameter target = null;
                target = (_0._1.messages._504.iec62325.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Parameter" element
         */
        public int sizeOfParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMETER$0);
            }
        }
        
        /**
         * Sets array of all "Parameter" element
         */
        public void setParameterArray(_0._1.messages._504.iec62325.ParameterDocument.Parameter[] parameterArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(parameterArray, PARAMETER$0);
            }
        }
        
        /**
         * Sets ith "Parameter" element
         */
        public void setParameterArray(int i, _0._1.messages._504.iec62325.ParameterDocument.Parameter parameter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.ParameterDocument.Parameter target = null;
                target = (_0._1.messages._504.iec62325.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(parameter);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Parameter" element
         */
        public _0._1.messages._504.iec62325.ParameterDocument.Parameter insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.ParameterDocument.Parameter target = null;
                target = (_0._1.messages._504.iec62325.ParameterDocument.Parameter)get_store().insert_element_user(PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Parameter" element
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
         * Removes the ith "Parameter" element
         */
        public void removeParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMETER$0, i);
            }
        }
    }
}
