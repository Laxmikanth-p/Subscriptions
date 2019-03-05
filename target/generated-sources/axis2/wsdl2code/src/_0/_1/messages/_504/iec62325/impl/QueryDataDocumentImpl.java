/*
 * An XML document type.
 * Localname: QueryData
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.QueryDataDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325.impl;
/**
 * A document containing one QueryData(@urn:iec62325.504:messages:1:0) element.
 *
 * This is a complex type.
 */
public class QueryDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.QueryDataDocument
{
    
    public QueryDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYDATA$0 = 
        new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "QueryData");
    
    
    /**
     * Gets the "QueryData" element
     */
    public _0._1.messages._504.iec62325.QueryDataDocument.QueryData getQueryData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.QueryDataDocument.QueryData target = null;
            target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData)get_store().find_element_user(QUERYDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryData" element
     */
    public void setQueryData(_0._1.messages._504.iec62325.QueryDataDocument.QueryData queryData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.QueryDataDocument.QueryData target = null;
            target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData)get_store().find_element_user(QUERYDATA$0, 0);
            if (target == null)
            {
                target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData)get_store().add_element_user(QUERYDATA$0);
            }
            target.set(queryData);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryData" element
     */
    public _0._1.messages._504.iec62325.QueryDataDocument.QueryData addNewQueryData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            _0._1.messages._504.iec62325.QueryDataDocument.QueryData target = null;
            target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData)get_store().add_element_user(QUERYDATA$0);
            return target;
        }
    }
    /**
     * An XML QueryData(@urn:iec62325.504:messages:1:0).
     *
     * This is a complex type.
     */
    public static class QueryDataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.QueryDataDocument.QueryData
    {
        
        public QueryDataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTPARAMETERS$0 = 
            new javax.xml.namespace.QName("urn:iec62325.504:messages:1:0", "RequestParameters");
        
        
        /**
         * Gets the "RequestParameters" element
         */
        public _0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters getRequestParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters target = null;
                target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters)get_store().find_element_user(REQUESTPARAMETERS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RequestParameters" element
         */
        public void setRequestParameters(_0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters requestParameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters target = null;
                target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters)get_store().find_element_user(REQUESTPARAMETERS$0, 0);
                if (target == null)
                {
                    target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters)get_store().add_element_user(REQUESTPARAMETERS$0);
                }
                target.set(requestParameters);
            }
        }
        
        /**
         * Appends and returns a new empty "RequestParameters" element
         */
        public _0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters addNewRequestParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                _0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters target = null;
                target = (_0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters)get_store().add_element_user(REQUESTPARAMETERS$0);
                return target;
            }
        }
        /**
         * An XML RequestParameters(@urn:iec62325.504:messages:1:0).
         *
         * This is a complex type.
         */
        public static class RequestParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements _0._1.messages._504.iec62325.QueryDataDocument.QueryData.RequestParameters
        {
            
            public RequestParametersImpl(org.apache.xmlbeans.SchemaType sType)
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
}
