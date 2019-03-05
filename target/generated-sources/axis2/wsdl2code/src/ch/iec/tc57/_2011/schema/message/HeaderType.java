/*
 * XML Type:  HeaderType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.HeaderType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message;


/**
 * An XML HeaderType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public interface HeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC3813994560026AD5430C93CC4F259D").resolveHandle("headertype8c2dtype");
    
    /**
     * Gets the "Verb" element
     */
    ch.iec.tc57._2011.schema.message.HeaderType.Verb.Enum getVerb();
    
    /**
     * Gets (as xml) the "Verb" element
     */
    ch.iec.tc57._2011.schema.message.HeaderType.Verb xgetVerb();
    
    /**
     * Sets the "Verb" element
     */
    void setVerb(ch.iec.tc57._2011.schema.message.HeaderType.Verb.Enum verb);
    
    /**
     * Sets (as xml) the "Verb" element
     */
    void xsetVerb(ch.iec.tc57._2011.schema.message.HeaderType.Verb verb);
    
    /**
     * Gets the "Noun" element
     */
    java.lang.String getNoun();
    
    /**
     * Gets (as xml) the "Noun" element
     */
    org.apache.xmlbeans.XmlString xgetNoun();
    
    /**
     * Sets the "Noun" element
     */
    void setNoun(java.lang.String noun);
    
    /**
     * Sets (as xml) the "Noun" element
     */
    void xsetNoun(org.apache.xmlbeans.XmlString noun);
    
    /**
     * Gets the "Revision" element
     */
    java.lang.String getRevision();
    
    /**
     * Gets (as xml) the "Revision" element
     */
    org.apache.xmlbeans.XmlString xgetRevision();
    
    /**
     * True if has "Revision" element
     */
    boolean isSetRevision();
    
    /**
     * Sets the "Revision" element
     */
    void setRevision(java.lang.String revision);
    
    /**
     * Sets (as xml) the "Revision" element
     */
    void xsetRevision(org.apache.xmlbeans.XmlString revision);
    
    /**
     * Unsets the "Revision" element
     */
    void unsetRevision();
    
    /**
     * Gets the "ReplayDetection" element
     */
    ch.iec.tc57._2011.schema.message.ReplayDetectionType getReplayDetection();
    
    /**
     * True if has "ReplayDetection" element
     */
    boolean isSetReplayDetection();
    
    /**
     * Sets the "ReplayDetection" element
     */
    void setReplayDetection(ch.iec.tc57._2011.schema.message.ReplayDetectionType replayDetection);
    
    /**
     * Appends and returns a new empty "ReplayDetection" element
     */
    ch.iec.tc57._2011.schema.message.ReplayDetectionType addNewReplayDetection();
    
    /**
     * Unsets the "ReplayDetection" element
     */
    void unsetReplayDetection();
    
    /**
     * Gets the "Context" element
     */
    java.lang.String getContext();
    
    /**
     * Gets (as xml) the "Context" element
     */
    org.apache.xmlbeans.XmlString xgetContext();
    
    /**
     * True if has "Context" element
     */
    boolean isSetContext();
    
    /**
     * Sets the "Context" element
     */
    void setContext(java.lang.String context);
    
    /**
     * Sets (as xml) the "Context" element
     */
    void xsetContext(org.apache.xmlbeans.XmlString context);
    
    /**
     * Unsets the "Context" element
     */
    void unsetContext();
    
    /**
     * Gets the "Timestamp" element
     */
    java.util.Calendar getTimestamp();
    
    /**
     * Gets (as xml) the "Timestamp" element
     */
    org.apache.xmlbeans.XmlDateTime xgetTimestamp();
    
    /**
     * True if has "Timestamp" element
     */
    boolean isSetTimestamp();
    
    /**
     * Sets the "Timestamp" element
     */
    void setTimestamp(java.util.Calendar timestamp);
    
    /**
     * Sets (as xml) the "Timestamp" element
     */
    void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp);
    
    /**
     * Unsets the "Timestamp" element
     */
    void unsetTimestamp();
    
    /**
     * Gets the "Source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "Source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * True if has "Source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "Source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "Source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Unsets the "Source" element
     */
    void unsetSource();
    
    /**
     * Gets the "AsyncReplyFlag" element
     */
    boolean getAsyncReplyFlag();
    
    /**
     * Gets (as xml) the "AsyncReplyFlag" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAsyncReplyFlag();
    
    /**
     * True if has "AsyncReplyFlag" element
     */
    boolean isSetAsyncReplyFlag();
    
    /**
     * Sets the "AsyncReplyFlag" element
     */
    void setAsyncReplyFlag(boolean asyncReplyFlag);
    
    /**
     * Sets (as xml) the "AsyncReplyFlag" element
     */
    void xsetAsyncReplyFlag(org.apache.xmlbeans.XmlBoolean asyncReplyFlag);
    
    /**
     * Unsets the "AsyncReplyFlag" element
     */
    void unsetAsyncReplyFlag();
    
    /**
     * Gets the "ReplyAddress" element
     */
    java.lang.String getReplyAddress();
    
    /**
     * Gets (as xml) the "ReplyAddress" element
     */
    org.apache.xmlbeans.XmlString xgetReplyAddress();
    
    /**
     * True if has "ReplyAddress" element
     */
    boolean isSetReplyAddress();
    
    /**
     * Sets the "ReplyAddress" element
     */
    void setReplyAddress(java.lang.String replyAddress);
    
    /**
     * Sets (as xml) the "ReplyAddress" element
     */
    void xsetReplyAddress(org.apache.xmlbeans.XmlString replyAddress);
    
    /**
     * Unsets the "ReplyAddress" element
     */
    void unsetReplyAddress();
    
    /**
     * Gets the "AckRequired" element
     */
    boolean getAckRequired();
    
    /**
     * Gets (as xml) the "AckRequired" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAckRequired();
    
    /**
     * True if has "AckRequired" element
     */
    boolean isSetAckRequired();
    
    /**
     * Sets the "AckRequired" element
     */
    void setAckRequired(boolean ackRequired);
    
    /**
     * Sets (as xml) the "AckRequired" element
     */
    void xsetAckRequired(org.apache.xmlbeans.XmlBoolean ackRequired);
    
    /**
     * Unsets the "AckRequired" element
     */
    void unsetAckRequired();
    
    /**
     * Gets the "User" element
     */
    ch.iec.tc57._2011.schema.message.UserType getUser();
    
    /**
     * True if has "User" element
     */
    boolean isSetUser();
    
    /**
     * Sets the "User" element
     */
    void setUser(ch.iec.tc57._2011.schema.message.UserType user);
    
    /**
     * Appends and returns a new empty "User" element
     */
    ch.iec.tc57._2011.schema.message.UserType addNewUser();
    
    /**
     * Unsets the "User" element
     */
    void unsetUser();
    
    /**
     * Gets the "MessageID" element
     */
    java.lang.String getMessageID();
    
    /**
     * Gets (as xml) the "MessageID" element
     */
    org.apache.xmlbeans.XmlString xgetMessageID();
    
    /**
     * True if has "MessageID" element
     */
    boolean isSetMessageID();
    
    /**
     * Sets the "MessageID" element
     */
    void setMessageID(java.lang.String messageID);
    
    /**
     * Sets (as xml) the "MessageID" element
     */
    void xsetMessageID(org.apache.xmlbeans.XmlString messageID);
    
    /**
     * Unsets the "MessageID" element
     */
    void unsetMessageID();
    
    /**
     * Gets the "CorrelationID" element
     */
    java.lang.String getCorrelationID();
    
    /**
     * Gets (as xml) the "CorrelationID" element
     */
    org.apache.xmlbeans.XmlString xgetCorrelationID();
    
    /**
     * True if has "CorrelationID" element
     */
    boolean isSetCorrelationID();
    
    /**
     * Sets the "CorrelationID" element
     */
    void setCorrelationID(java.lang.String correlationID);
    
    /**
     * Sets (as xml) the "CorrelationID" element
     */
    void xsetCorrelationID(org.apache.xmlbeans.XmlString correlationID);
    
    /**
     * Unsets the "CorrelationID" element
     */
    void unsetCorrelationID();
    
    /**
     * Gets the "Comment" element
     */
    java.lang.String getComment();
    
    /**
     * Gets (as xml) the "Comment" element
     */
    org.apache.xmlbeans.XmlString xgetComment();
    
    /**
     * True if has "Comment" element
     */
    boolean isSetComment();
    
    /**
     * Sets the "Comment" element
     */
    void setComment(java.lang.String comment);
    
    /**
     * Sets (as xml) the "Comment" element
     */
    void xsetComment(org.apache.xmlbeans.XmlString comment);
    
    /**
     * Unsets the "Comment" element
     */
    void unsetComment();
    
    /**
     * Gets array of all "Property" elements
     */
    ch.iec.tc57._2011.schema.message.MessageProperty[] getPropertyArray();
    
    /**
     * Gets ith "Property" element
     */
    ch.iec.tc57._2011.schema.message.MessageProperty getPropertyArray(int i);
    
    /**
     * Returns number of "Property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "Property" element
     */
    void setPropertyArray(ch.iec.tc57._2011.schema.message.MessageProperty[] propertyArray);
    
    /**
     * Sets ith "Property" element
     */
    void setPropertyArray(int i, ch.iec.tc57._2011.schema.message.MessageProperty property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Property" element
     */
    ch.iec.tc57._2011.schema.message.MessageProperty insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Property" element
     */
    ch.iec.tc57._2011.schema.message.MessageProperty addNewProperty();
    
    /**
     * Removes the ith "Property" element
     */
    void removeProperty(int i);
    
    /**
     * An XML Verb(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.HeaderType$Verb.
     */
    public interface Verb extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Verb.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC3813994560026AD5430C93CC4F259D").resolveHandle("verb8288elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CANCEL = Enum.forString("cancel");
        static final Enum CANCELED = Enum.forString("canceled");
        static final Enum CHANGE = Enum.forString("change");
        static final Enum CHANGED = Enum.forString("changed");
        static final Enum CREATE = Enum.forString("create");
        static final Enum CREATED = Enum.forString("created");
        static final Enum CLOSE = Enum.forString("close");
        static final Enum CLOSED = Enum.forString("closed");
        static final Enum DELETE = Enum.forString("delete");
        static final Enum DELETED = Enum.forString("deleted");
        static final Enum GET = Enum.forString("get");
        static final Enum REPLY = Enum.forString("reply");
        static final Enum EXECUTE = Enum.forString("execute");
        static final Enum EXECUTED = Enum.forString("executed");
        
        static final int INT_CANCEL = Enum.INT_CANCEL;
        static final int INT_CANCELED = Enum.INT_CANCELED;
        static final int INT_CHANGE = Enum.INT_CHANGE;
        static final int INT_CHANGED = Enum.INT_CHANGED;
        static final int INT_CREATE = Enum.INT_CREATE;
        static final int INT_CREATED = Enum.INT_CREATED;
        static final int INT_CLOSE = Enum.INT_CLOSE;
        static final int INT_CLOSED = Enum.INT_CLOSED;
        static final int INT_DELETE = Enum.INT_DELETE;
        static final int INT_DELETED = Enum.INT_DELETED;
        static final int INT_GET = Enum.INT_GET;
        static final int INT_REPLY = Enum.INT_REPLY;
        static final int INT_EXECUTE = Enum.INT_EXECUTE;
        static final int INT_EXECUTED = Enum.INT_EXECUTED;
        
        /**
         * Enumeration value class for ch.iec.tc57._2011.schema.message.HeaderType$Verb.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CANCEL
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
            
            static final int INT_CANCEL = 1;
            static final int INT_CANCELED = 2;
            static final int INT_CHANGE = 3;
            static final int INT_CHANGED = 4;
            static final int INT_CREATE = 5;
            static final int INT_CREATED = 6;
            static final int INT_CLOSE = 7;
            static final int INT_CLOSED = 8;
            static final int INT_DELETE = 9;
            static final int INT_DELETED = 10;
            static final int INT_GET = 11;
            static final int INT_REPLY = 12;
            static final int INT_EXECUTE = 13;
            static final int INT_EXECUTED = 14;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("cancel", INT_CANCEL),
                    new Enum("canceled", INT_CANCELED),
                    new Enum("change", INT_CHANGE),
                    new Enum("changed", INT_CHANGED),
                    new Enum("create", INT_CREATE),
                    new Enum("created", INT_CREATED),
                    new Enum("close", INT_CLOSE),
                    new Enum("closed", INT_CLOSED),
                    new Enum("delete", INT_DELETE),
                    new Enum("deleted", INT_DELETED),
                    new Enum("get", INT_GET),
                    new Enum("reply", INT_REPLY),
                    new Enum("execute", INT_EXECUTE),
                    new Enum("executed", INT_EXECUTED),
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
            public static ch.iec.tc57._2011.schema.message.HeaderType.Verb newValue(java.lang.Object obj) {
              return (ch.iec.tc57._2011.schema.message.HeaderType.Verb) type.newValue( obj ); }
            
            public static ch.iec.tc57._2011.schema.message.HeaderType.Verb newInstance() {
              return (ch.iec.tc57._2011.schema.message.HeaderType.Verb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static ch.iec.tc57._2011.schema.message.HeaderType.Verb newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (ch.iec.tc57._2011.schema.message.HeaderType.Verb) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static ch.iec.tc57._2011.schema.message.HeaderType newInstance() {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static ch.iec.tc57._2011.schema.message.HeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (ch.iec.tc57._2011.schema.message.HeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
