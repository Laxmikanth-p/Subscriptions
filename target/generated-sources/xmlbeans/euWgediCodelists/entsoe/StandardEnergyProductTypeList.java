/*
 * XML Type:  StandardEnergyProductTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.StandardEnergyProductTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe;


/**
 * An XML StandardEnergyProductTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is an atomic type that is a restriction of euWgediCodelists.entsoe.StandardEnergyProductTypeList.
 */
public interface StandardEnergyProductTypeList extends org.apache.xmlbeans.XmlNMTOKEN
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StandardEnergyProductTypeList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s7A5BC95739C5F5E26B9165697F96F1D2").resolveHandle("standardenergyproducttypelist337etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_8716867000016 = Enum.forString("8716867000016");
    static final Enum X_8716867000023 = Enum.forString("8716867000023");
    static final Enum X_8716867000030 = Enum.forString("8716867000030");
    static final Enum X_8716867000047 = Enum.forString("8716867000047");
    static final Enum X_8716867000139 = Enum.forString("8716867000139");
    static final Enum X_8716867000146 = Enum.forString("8716867000146");
    static final Enum X_8716867009911 = Enum.forString("8716867009911");
    
    static final int INT_X_8716867000016 = Enum.INT_X_8716867000016;
    static final int INT_X_8716867000023 = Enum.INT_X_8716867000023;
    static final int INT_X_8716867000030 = Enum.INT_X_8716867000030;
    static final int INT_X_8716867000047 = Enum.INT_X_8716867000047;
    static final int INT_X_8716867000139 = Enum.INT_X_8716867000139;
    static final int INT_X_8716867000146 = Enum.INT_X_8716867000146;
    static final int INT_X_8716867009911 = Enum.INT_X_8716867009911;
    
    /**
     * Enumeration value class for euWgediCodelists.entsoe.StandardEnergyProductTypeList.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_8716867000016
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
        
        static final int INT_X_8716867000016 = 1;
        static final int INT_X_8716867000023 = 2;
        static final int INT_X_8716867000030 = 3;
        static final int INT_X_8716867000047 = 4;
        static final int INT_X_8716867000139 = 5;
        static final int INT_X_8716867000146 = 6;
        static final int INT_X_8716867009911 = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("8716867000016", INT_X_8716867000016),
                new Enum("8716867000023", INT_X_8716867000023),
                new Enum("8716867000030", INT_X_8716867000030),
                new Enum("8716867000047", INT_X_8716867000047),
                new Enum("8716867000139", INT_X_8716867000139),
                new Enum("8716867000146", INT_X_8716867000146),
                new Enum("8716867009911", INT_X_8716867009911),
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
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList newValue(java.lang.Object obj) {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) type.newValue( obj ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList newInstance() {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static euWgediCodelists.entsoe.StandardEnergyProductTypeList parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (euWgediCodelists.entsoe.StandardEnergyProductTypeList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
