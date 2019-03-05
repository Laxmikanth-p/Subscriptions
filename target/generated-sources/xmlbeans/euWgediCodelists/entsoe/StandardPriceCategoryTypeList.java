/*
 * XML Type:  StandardPriceCategoryTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.StandardPriceCategoryTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe;


/**
 * An XML StandardPriceCategoryTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is an atomic type that is a restriction of euWgediCodelists.entsoe.StandardPriceCategoryTypeList.
 */
public interface StandardPriceCategoryTypeList extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardPriceCategoryTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("standardpricecategorytypelistcb9etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum A_01 = Enum.forString("A01");
    static final Enum A_02 = Enum.forString("A02");
    static final Enum A_03 = Enum.forString("A03");
    static final Enum A_04 = Enum.forString("A04");
    static final Enum A_05 = Enum.forString("A05");
    static final Enum A_06 = Enum.forString("A06");
    static final Enum A_07 = Enum.forString("A07");
    
    static final int INT_A_01 = Enum.INT_A_01;
    static final int INT_A_02 = Enum.INT_A_02;
    static final int INT_A_03 = Enum.INT_A_03;
    static final int INT_A_04 = Enum.INT_A_04;
    static final int INT_A_05 = Enum.INT_A_05;
    static final int INT_A_06 = Enum.INT_A_06;
    static final int INT_A_07 = Enum.INT_A_07;
    
    /**
     * Enumeration value class for euWgediCodelists.entsoe.StandardPriceCategoryTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_A_01
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
        
        static final int INT_A_01 = 1;
        static final int INT_A_02 = 2;
        static final int INT_A_03 = 3;
        static final int INT_A_04 = 4;
        static final int INT_A_05 = 5;
        static final int INT_A_06 = 6;
        static final int INT_A_07 = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("A01", INT_A_01),
                new Enum("A02", INT_A_02),
                new Enum("A03", INT_A_03),
                new Enum("A04", INT_A_04),
                new Enum("A05", INT_A_05),
                new Enum("A06", INT_A_06),
                new Enum("A07", INT_A_07),
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
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList newValue(java.lang.Object obj) {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) type.newValue( obj ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList newInstance() {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.StandardPriceCategoryTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.StandardPriceCategoryTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
