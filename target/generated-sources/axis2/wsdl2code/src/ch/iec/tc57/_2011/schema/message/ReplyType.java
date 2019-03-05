/*
 * XML Type:  ReplyType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ReplyType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * An XML ReplyType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public interface ReplyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReplyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("replytype83a2type");
    
    /**
     * Gets the "Result" element
     */
    ch.iec.tc57._2011.schema.message.ReplyType.Result.Enum getResult();
    
    /**
     * Gets (as xml) the "Result" element
     */
    ch.iec.tc57._2011.schema.message.ReplyType.Result xgetResult();
    
    /**
     * Sets the "Result" element
     */
    void setResult(ch.iec.tc57._2011.schema.message.ReplyType.Result.Enum result);
    
    /**
     * Sets (as xml) the "Result" element
     */
    void xsetResult(ch.iec.tc57._2011.schema.message.ReplyType.Result result);
    
    /**
     * Gets array of all "Error" elements
     */
    ch.iec.tc57._2011.schema.message.ErrorType[] getErrorArray();
    
    /**
     * Gets ith "Error" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType getErrorArray(int i);
    
    /**
     * Returns number of "Error" element
     */
    int sizeOfErrorArray();
    
    /**
     * Sets array of all "Error" element
     */
    void setErrorArray(ch.iec.tc57._2011.schema.message.ErrorType[] errorArray);
    
    /**
     * Sets ith "Error" element
     */
    void setErrorArray(int i, ch.iec.tc57._2011.schema.message.ErrorType error);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Error" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType insertNewError(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Error" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType addNewError();
    
    /**
     * Removes the ith "Error" element
     */
    void removeError(int i);
    
    /**
     * Gets array of all "ID" elements
     */
    ch.iec.tc57._2011.schema.message.ReplyType.ID[] getIDArray();
    
    /**
     * Gets ith "ID" element
     */
    ch.iec.tc57._2011.schema.message.ReplyType.ID getIDArray(int i);
    
    /**
     * Returns number of "ID" element
     */
    int sizeOfIDArray();
    
    /**
     * Sets array of all "ID" element
     */
    void setIDArray(ch.iec.tc57._2011.schema.message.ReplyType.ID[] idArray);
    
    /**
     * Sets ith "ID" element
     */
    void setIDArray(int i, ch.iec.tc57._2011.schema.message.ReplyType.ID id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ID" element
     */
    ch.iec.tc57._2011.schema.message.ReplyType.ID insertNewID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ID" element
     */
    ch.iec.tc57._2011.schema.message.ReplyType.ID addNewID();
    
    /**
     * Removes the ith "ID" element
     */
    void removeID(int i);
    
    /**
     * Gets the "operationId" element
     */
    java.math.BigInteger getOperationId();
    
    /**
     * Gets (as xml) the "operationId" element
     */
    org.apache.xmlbeans.XmlInteger xgetOperationId();
    
    /**
     * True if has "operationId" element
     */
    boolean isSetOperationId();
    
    /**
     * Sets the "operationId" element
     */
    void setOperationId(java.math.BigInteger operationId);
    
    /**
     * Sets (as xml) the "operationId" element
     */
    void xsetOperationId(org.apache.xmlbeans.XmlInteger operationId);
    
    /**
     * Unsets the "operationId" element
     */
    void unsetOperationId();
    
    /**
     * An XML Result(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ReplyType$Result.
     */
    public interface Result extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Result.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("result3429elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum OK = Enum.forString("OK");
        static final Enum PARTIAL = Enum.forString("PARTIAL");
        static final Enum FAILED = Enum.forString("FAILED");
        
        static final int INT_OK = Enum.INT_OK;
        static final int INT_PARTIAL = Enum.INT_PARTIAL;
        static final int INT_FAILED = Enum.INT_FAILED;
        
        /**
         * Enumeration value class for ch.iec.tc57._2011.schema.message.ReplyType$Result.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_OK
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_OK = 1;
            static final int INT_PARTIAL = 2;
            static final int INT_FAILED = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("OK", INT_OK),
                    new Enum("PARTIAL", INT_PARTIAL),
                    new Enum("FAILED", INT_FAILED),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static ch.iec.tc57._2011.schema.message.ReplyType.Result newValue(java.lang.Object obj) {
              return (ch.iec.tc57._2011.schema.message.ReplyType.Result) type.newValue( obj ); }
            
            public static ch.iec.tc57._2011.schema.message.ReplyType.Result newInstance() {
              return (ch.iec.tc57._2011.schema.message.ReplyType.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.ReplyType.Result newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.ReplyType.Result) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ReplyType$ID.
     */
    public interface ID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("idb28belemtype");
        
        /**
         * Gets the "idType" attribute
         */
        java.lang.String getIdType();
        
        /**
         * Gets (as xml) the "idType" attribute
         */
        org.apache.xmlbeans.XmlString xgetIdType();
        
        /**
         * True if has "idType" attribute
         */
        boolean isSetIdType();
        
        /**
         * Sets the "idType" attribute
         */
        void setIdType(java.lang.String idType);
        
        /**
         * Sets (as xml) the "idType" attribute
         */
        void xsetIdType(org.apache.xmlbeans.XmlString idType);
        
        /**
         * Unsets the "idType" attribute
         */
        void unsetIdType();
        
        /**
         * Gets the "idAuthority" attribute
         */
        java.lang.String getIdAuthority();
        
        /**
         * Gets (as xml) the "idAuthority" attribute
         */
        org.apache.xmlbeans.XmlString xgetIdAuthority();
        
        /**
         * True if has "idAuthority" attribute
         */
        boolean isSetIdAuthority();
        
        /**
         * Sets the "idAuthority" attribute
         */
        void setIdAuthority(java.lang.String idAuthority);
        
        /**
         * Sets (as xml) the "idAuthority" attribute
         */
        void xsetIdAuthority(org.apache.xmlbeans.XmlString idAuthority);
        
        /**
         * Unsets the "idAuthority" attribute
         */
        void unsetIdAuthority();
        
        /**
         * Gets the "kind" attribute
         */
        ch.iec.tc57._2011.schema.message.IDKindType.Enum getKind();
        
        /**
         * Gets (as xml) the "kind" attribute
         */
        ch.iec.tc57._2011.schema.message.IDKindType xgetKind();
        
        /**
         * True if has "kind" attribute
         */
        boolean isSetKind();
        
        /**
         * Sets the "kind" attribute
         */
        void setKind(ch.iec.tc57._2011.schema.message.IDKindType.Enum kind);
        
        /**
         * Sets (as xml) the "kind" attribute
         */
        void xsetKind(ch.iec.tc57._2011.schema.message.IDKindType kind);
        
        /**
         * Unsets the "kind" attribute
         */
        void unsetKind();
        
        /**
         * Gets the "objectType" attribute
         */
        java.lang.String getObjectType();
        
        /**
         * Gets (as xml) the "objectType" attribute
         */
        org.apache.xmlbeans.XmlString xgetObjectType();
        
        /**
         * True if has "objectType" attribute
         */
        boolean isSetObjectType();
        
        /**
         * Sets the "objectType" attribute
         */
        void setObjectType(java.lang.String objectType);
        
        /**
         * Sets (as xml) the "objectType" attribute
         */
        void xsetObjectType(org.apache.xmlbeans.XmlString objectType);
        
        /**
         * Unsets the "objectType" attribute
         */
        void unsetObjectType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static ch.iec.tc57._2011.schema.message.ReplyType.ID newInstance() {
              return (ch.iec.tc57._2011.schema.message.ReplyType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.ReplyType.ID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.ReplyType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.ReplyType newInstance() {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ReplyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ReplyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
