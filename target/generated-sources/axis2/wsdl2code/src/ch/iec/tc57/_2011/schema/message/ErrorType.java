/*
 * XML Type:  ErrorType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ErrorType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * An XML ErrorType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public interface ErrorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("errortypebdc4type");
    
    /**
     * Gets the "code" element
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" element
     */
    org.apache.xmlbeans.XmlString xgetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" element
     */
    void xsetCode(org.apache.xmlbeans.XmlString code);
    
    /**
     * Gets the "level" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType.Level.Enum getLevel();
    
    /**
     * Gets (as xml) the "level" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType.Level xgetLevel();
    
    /**
     * True if has "level" element
     */
    boolean isSetLevel();
    
    /**
     * Sets the "level" element
     */
    void setLevel(ch.iec.tc57._2011.schema.message.ErrorType.Level.Enum level);
    
    /**
     * Sets (as xml) the "level" element
     */
    void xsetLevel(ch.iec.tc57._2011.schema.message.ErrorType.Level level);
    
    /**
     * Unsets the "level" element
     */
    void unsetLevel();
    
    /**
     * Gets the "reason" element
     */
    java.lang.String getReason();
    
    /**
     * Gets (as xml) the "reason" element
     */
    org.apache.xmlbeans.XmlString xgetReason();
    
    /**
     * True if has "reason" element
     */
    boolean isSetReason();
    
    /**
     * Sets the "reason" element
     */
    void setReason(java.lang.String reason);
    
    /**
     * Sets (as xml) the "reason" element
     */
    void xsetReason(org.apache.xmlbeans.XmlString reason);
    
    /**
     * Unsets the "reason" element
     */
    void unsetReason();
    
    /**
     * Gets the "details" element
     */
    java.lang.String getDetails();
    
    /**
     * Gets (as xml) the "details" element
     */
    org.apache.xmlbeans.XmlString xgetDetails();
    
    /**
     * True if has "details" element
     */
    boolean isSetDetails();
    
    /**
     * Sets the "details" element
     */
    void setDetails(java.lang.String details);
    
    /**
     * Sets (as xml) the "details" element
     */
    void xsetDetails(org.apache.xmlbeans.XmlString details);
    
    /**
     * Unsets the "details" element
     */
    void unsetDetails();
    
    /**
     * Gets the "xpath" element
     */
    javax.xml.namespace.QName getXpath();
    
    /**
     * Gets (as xml) the "xpath" element
     */
    org.apache.xmlbeans.XmlQName xgetXpath();
    
    /**
     * True if has "xpath" element
     */
    boolean isSetXpath();
    
    /**
     * Sets the "xpath" element
     */
    void setXpath(javax.xml.namespace.QName xpath);
    
    /**
     * Sets (as xml) the "xpath" element
     */
    void xsetXpath(org.apache.xmlbeans.XmlQName xpath);
    
    /**
     * Unsets the "xpath" element
     */
    void unsetXpath();
    
    /**
     * Gets the "stackTrace" element
     */
    java.lang.String getStackTrace();
    
    /**
     * Gets (as xml) the "stackTrace" element
     */
    org.apache.xmlbeans.XmlString xgetStackTrace();
    
    /**
     * True if has "stackTrace" element
     */
    boolean isSetStackTrace();
    
    /**
     * Sets the "stackTrace" element
     */
    void setStackTrace(java.lang.String stackTrace);
    
    /**
     * Sets (as xml) the "stackTrace" element
     */
    void xsetStackTrace(org.apache.xmlbeans.XmlString stackTrace);
    
    /**
     * Unsets the "stackTrace" element
     */
    void unsetStackTrace();
    
    /**
     * Gets the "Location" element
     */
    ch.iec.tc57._2011.schema.message.LocationType getLocation();
    
    /**
     * True if has "Location" element
     */
    boolean isSetLocation();
    
    /**
     * Sets the "Location" element
     */
    void setLocation(ch.iec.tc57._2011.schema.message.LocationType location);
    
    /**
     * Appends and returns a new empty "Location" element
     */
    ch.iec.tc57._2011.schema.message.LocationType addNewLocation();
    
    /**
     * Unsets the "Location" element
     */
    void unsetLocation();
    
    /**
     * Gets the "ID" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType.ID getID();
    
    /**
     * True if has "ID" element
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" element
     */
    void setID(ch.iec.tc57._2011.schema.message.ErrorType.ID id);
    
    /**
     * Appends and returns a new empty "ID" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType.ID addNewID();
    
    /**
     * Unsets the "ID" element
     */
    void unsetID();
    
    /**
     * Gets the "relatedID" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType.RelatedID getRelatedID();
    
    /**
     * True if has "relatedID" element
     */
    boolean isSetRelatedID();
    
    /**
     * Sets the "relatedID" element
     */
    void setRelatedID(ch.iec.tc57._2011.schema.message.ErrorType.RelatedID relatedID);
    
    /**
     * Appends and returns a new empty "relatedID" element
     */
    ch.iec.tc57._2011.schema.message.ErrorType.RelatedID addNewRelatedID();
    
    /**
     * Unsets the "relatedID" element
     */
    void unsetRelatedID();
    
    /**
     * Gets the "object" element
     */
    ch.iec.tc57._2011.schema.message.ObjectType getObject();
    
    /**
     * True if has "object" element
     */
    boolean isSetObject();
    
    /**
     * Sets the "object" element
     */
    void setObject(ch.iec.tc57._2011.schema.message.ObjectType object);
    
    /**
     * Appends and returns a new empty "object" element
     */
    ch.iec.tc57._2011.schema.message.ObjectType addNewObject();
    
    /**
     * Unsets the "object" element
     */
    void unsetObject();
    
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
     * An XML level(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ErrorType$Level.
     */
    public interface Level extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Level.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("levela5d4elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum INFORM = Enum.forString("INFORM");
        static final Enum WARNING = Enum.forString("WARNING");
        static final Enum FATAL = Enum.forString("FATAL");
        static final Enum CATASTROPHIC = Enum.forString("CATASTROPHIC");
        
        static final int INT_INFORM = Enum.INT_INFORM;
        static final int INT_WARNING = Enum.INT_WARNING;
        static final int INT_FATAL = Enum.INT_FATAL;
        static final int INT_CATASTROPHIC = Enum.INT_CATASTROPHIC;
        
        /**
         * Enumeration value class for ch.iec.tc57._2011.schema.message.ErrorType$Level.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_INFORM
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
            
            static final int INT_INFORM = 1;
            static final int INT_WARNING = 2;
            static final int INT_FATAL = 3;
            static final int INT_CATASTROPHIC = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("INFORM", INT_INFORM),
                    new Enum("WARNING", INT_WARNING),
                    new Enum("FATAL", INT_FATAL),
                    new Enum("CATASTROPHIC", INT_CATASTROPHIC),
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
            public static ch.iec.tc57._2011.schema.message.ErrorType.Level newValue(java.lang.Object obj) {
              return (ch.iec.tc57._2011.schema.message.ErrorType.Level) type.newValue( obj ); }
            
            public static ch.iec.tc57._2011.schema.message.ErrorType.Level newInstance() {
              return (ch.iec.tc57._2011.schema.message.ErrorType.Level) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.ErrorType.Level newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.ErrorType.Level) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ErrorType$ID.
     */
    public interface ID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("idecadelemtype");
        
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
            public static ch.iec.tc57._2011.schema.message.ErrorType.ID newInstance() {
              return (ch.iec.tc57._2011.schema.message.ErrorType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.ErrorType.ID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.ErrorType.ID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML relatedID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ErrorType$RelatedID.
     */
    public interface RelatedID extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s266CFF65F562F869CFFAFB14C68F09DF").resolveHandle("relatedid4392elemtype");
        
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
            public static ch.iec.tc57._2011.schema.message.ErrorType.RelatedID newInstance() {
              return (ch.iec.tc57._2011.schema.message.ErrorType.RelatedID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.ErrorType.RelatedID newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.ErrorType.RelatedID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.ErrorType newInstance() {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.ErrorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.ErrorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
