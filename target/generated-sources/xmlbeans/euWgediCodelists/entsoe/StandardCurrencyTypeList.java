/*
 * XML Type:  StandardCurrencyTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.StandardCurrencyTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe;


/**
 * An XML StandardCurrencyTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is an atomic type that is a restriction of euWgediCodelists.entsoe.StandardCurrencyTypeList.
 */
public interface StandardCurrencyTypeList extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardCurrencyTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("standardcurrencytypelistded4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum EUR = Enum.forString("EUR");
    static final Enum USD = Enum.forString("USD");
    static final Enum DKK = Enum.forString("DKK");
    static final Enum NOK = Enum.forString("NOK");
    static final Enum CHF = Enum.forString("CHF");
    static final Enum GBP = Enum.forString("GBP");
    static final Enum SEK = Enum.forString("SEK");
    static final Enum PLN = Enum.forString("PLN");
    static final Enum CZK = Enum.forString("CZK");
    static final Enum SKK = Enum.forString("SKK");
    static final Enum HRK = Enum.forString("HRK");
    static final Enum HUF = Enum.forString("HUF");
    static final Enum TRY = Enum.forString("TRY");
    static final Enum BGN = Enum.forString("BGN");
    static final Enum LTL = Enum.forString("LTL");
    static final Enum RON = Enum.forString("RON");
    static final Enum ISK = Enum.forString("ISK");
    static final Enum LEK = Enum.forString("LEK");
    static final Enum MKD = Enum.forString("MKD");
    static final Enum RSD = Enum.forString("RSD");
    static final Enum BAM = Enum.forString("BAM");
    
    static final int INT_EUR = Enum.INT_EUR;
    static final int INT_USD = Enum.INT_USD;
    static final int INT_DKK = Enum.INT_DKK;
    static final int INT_NOK = Enum.INT_NOK;
    static final int INT_CHF = Enum.INT_CHF;
    static final int INT_GBP = Enum.INT_GBP;
    static final int INT_SEK = Enum.INT_SEK;
    static final int INT_PLN = Enum.INT_PLN;
    static final int INT_CZK = Enum.INT_CZK;
    static final int INT_SKK = Enum.INT_SKK;
    static final int INT_HRK = Enum.INT_HRK;
    static final int INT_HUF = Enum.INT_HUF;
    static final int INT_TRY = Enum.INT_TRY;
    static final int INT_BGN = Enum.INT_BGN;
    static final int INT_LTL = Enum.INT_LTL;
    static final int INT_RON = Enum.INT_RON;
    static final int INT_ISK = Enum.INT_ISK;
    static final int INT_LEK = Enum.INT_LEK;
    static final int INT_MKD = Enum.INT_MKD;
    static final int INT_RSD = Enum.INT_RSD;
    static final int INT_BAM = Enum.INT_BAM;
    
    /**
     * Enumeration value class for euWgediCodelists.entsoe.StandardCurrencyTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_EUR
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
        
        static final int INT_EUR = 1;
        static final int INT_USD = 2;
        static final int INT_DKK = 3;
        static final int INT_NOK = 4;
        static final int INT_CHF = 5;
        static final int INT_GBP = 6;
        static final int INT_SEK = 7;
        static final int INT_PLN = 8;
        static final int INT_CZK = 9;
        static final int INT_SKK = 10;
        static final int INT_HRK = 11;
        static final int INT_HUF = 12;
        static final int INT_TRY = 13;
        static final int INT_BGN = 14;
        static final int INT_LTL = 15;
        static final int INT_RON = 16;
        static final int INT_ISK = 17;
        static final int INT_LEK = 18;
        static final int INT_MKD = 19;
        static final int INT_RSD = 20;
        static final int INT_BAM = 21;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("EUR", INT_EUR),
                new Enum("USD", INT_USD),
                new Enum("DKK", INT_DKK),
                new Enum("NOK", INT_NOK),
                new Enum("CHF", INT_CHF),
                new Enum("GBP", INT_GBP),
                new Enum("SEK", INT_SEK),
                new Enum("PLN", INT_PLN),
                new Enum("CZK", INT_CZK),
                new Enum("SKK", INT_SKK),
                new Enum("HRK", INT_HRK),
                new Enum("HUF", INT_HUF),
                new Enum("TRY", INT_TRY),
                new Enum("BGN", INT_BGN),
                new Enum("LTL", INT_LTL),
                new Enum("RON", INT_RON),
                new Enum("ISK", INT_ISK),
                new Enum("LEK", INT_LEK),
                new Enum("MKD", INT_MKD),
                new Enum("RSD", INT_RSD),
                new Enum("BAM", INT_BAM),
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
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList newValue(java.lang.Object obj) {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) type.newValue( obj ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList newInstance() {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.StandardCurrencyTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.StandardCurrencyTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
