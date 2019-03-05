/*
 * An XML document type.
 * Localname: MessageList
 * Namespace: urn:iec62325.504:messages:1:0
 * Java type: _0._1.messages._504.iec62325.MessageListDocument
 *
 * Automatically generated - do not modify.
 */
package _0._1.messages._504.iec62325;


/**
 * A document containing one MessageList(@urn:iec62325.504:messages:1:0) element.
 *
 * This is a complex type.
 */
public interface MessageListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC3813994560026AD5430C93CC4F259D").resolveHandle("messagelist4758doctype");
    
    /**
     * Gets the "MessageList" element
     */
    _0._1.messages._504.iec62325.MessageListDocument.MessageList getMessageList();
    
    /**
     * Sets the "MessageList" element
     */
    void setMessageList(_0._1.messages._504.iec62325.MessageListDocument.MessageList messageList);
    
    /**
     * Appends and returns a new empty "MessageList" element
     */
    _0._1.messages._504.iec62325.MessageListDocument.MessageList addNewMessageList();
    
    /**
     * An XML MessageList(@urn:iec62325.504:messages:1:0).
     *
     * This is a complex type.
     */
    public interface MessageList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC3813994560026AD5430C93CC4F259D").resolveHandle("messagelist8b69elemtype");
        
        /**
         * Gets array of all "Message" elements
         */
        _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message[] getMessageArray();
        
        /**
         * Gets ith "Message" element
         */
        _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message getMessageArray(int i);
        
        /**
         * Returns number of "Message" element
         */
        int sizeOfMessageArray();
        
        /**
         * Sets array of all "Message" element
         */
        void setMessageArray(_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message[] messageArray);
        
        /**
         * Sets ith "Message" element
         */
        void setMessageArray(int i, _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message message);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Message" element
         */
        _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message insertNewMessage(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Message" element
         */
        _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message addNewMessage();
        
        /**
         * Removes the ith "Message" element
         */
        void removeMessage(int i);
        
        /**
         * An XML Message(@urn:iec62325.504:messages:1:0).
         *
         * This is a complex type.
         */
        public interface Message extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Message.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC3813994560026AD5430C93CC4F259D").resolveHandle("message21fcelemtype");
            
            /**
             * Gets the "Code" element
             */
            java.math.BigInteger getCode();
            
            /**
             * Gets (as xml) the "Code" element
             */
            org.apache.xmlbeans.XmlPositiveInteger xgetCode();
            
            /**
             * Sets the "Code" element
             */
            void setCode(java.math.BigInteger code);
            
            /**
             * Sets (as xml) the "Code" element
             */
            void xsetCode(org.apache.xmlbeans.XmlPositiveInteger code);
            
            /**
             * Gets the "MessageIdentification" element
             */
            java.lang.String getMessageIdentification();
            
            /**
             * Gets (as xml) the "MessageIdentification" element
             */
            org.apache.xmlbeans.XmlString xgetMessageIdentification();
            
            /**
             * Sets the "MessageIdentification" element
             */
            void setMessageIdentification(java.lang.String messageIdentification);
            
            /**
             * Sets (as xml) the "MessageIdentification" element
             */
            void xsetMessageIdentification(org.apache.xmlbeans.XmlString messageIdentification);
            
            /**
             * Gets the "MessageVersion" element
             */
            java.math.BigInteger getMessageVersion();
            
            /**
             * Gets (as xml) the "MessageVersion" element
             */
            org.apache.xmlbeans.XmlPositiveInteger xgetMessageVersion();
            
            /**
             * True if has "MessageVersion" element
             */
            boolean isSetMessageVersion();
            
            /**
             * Sets the "MessageVersion" element
             */
            void setMessageVersion(java.math.BigInteger messageVersion);
            
            /**
             * Sets (as xml) the "MessageVersion" element
             */
            void xsetMessageVersion(org.apache.xmlbeans.XmlPositiveInteger messageVersion);
            
            /**
             * Unsets the "MessageVersion" element
             */
            void unsetMessageVersion();
            
            /**
             * Gets the "Status" element
             */
            _0._1.messages._504.iec62325.StatusType.Enum getStatus();
            
            /**
             * Gets (as xml) the "Status" element
             */
            _0._1.messages._504.iec62325.StatusType xgetStatus();
            
            /**
             * True if has "Status" element
             */
            boolean isSetStatus();
            
            /**
             * Sets the "Status" element
             */
            void setStatus(_0._1.messages._504.iec62325.StatusType.Enum status);
            
            /**
             * Sets (as xml) the "Status" element
             */
            void xsetStatus(_0._1.messages._504.iec62325.StatusType status);
            
            /**
             * Unsets the "Status" element
             */
            void unsetStatus();
            
            /**
             * Gets the "ApplicationTimeInterval" element
             */
            _0._1.messages._504.iec62325.TimeIntervalType getApplicationTimeInterval();
            
            /**
             * Sets the "ApplicationTimeInterval" element
             */
            void setApplicationTimeInterval(_0._1.messages._504.iec62325.TimeIntervalType applicationTimeInterval);
            
            /**
             * Appends and returns a new empty "ApplicationTimeInterval" element
             */
            _0._1.messages._504.iec62325.TimeIntervalType addNewApplicationTimeInterval();
            
            /**
             * Gets the "ServerTimestamp" element
             */
            java.util.Calendar getServerTimestamp();
            
            /**
             * Gets (as xml) the "ServerTimestamp" element
             */
            org.apache.xmlbeans.XmlDateTime xgetServerTimestamp();
            
            /**
             * Sets the "ServerTimestamp" element
             */
            void setServerTimestamp(java.util.Calendar serverTimestamp);
            
            /**
             * Sets (as xml) the "ServerTimestamp" element
             */
            void xsetServerTimestamp(org.apache.xmlbeans.XmlDateTime serverTimestamp);
            
            /**
             * Gets the "Type" element
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" element
             */
            org.apache.xmlbeans.XmlString xgetType();
            
            /**
             * Sets the "Type" element
             */
            void setType(java.lang.String type);
            
            /**
             * Sets (as xml) the "Type" element
             */
            void xsetType(org.apache.xmlbeans.XmlString type);
            
            /**
             * Gets the "Owner" element
             */
            java.lang.String getOwner();
            
            /**
             * Gets (as xml) the "Owner" element
             */
            org.apache.xmlbeans.XmlString xgetOwner();
            
            /**
             * Sets the "Owner" element
             */
            void setOwner(java.lang.String owner);
            
            /**
             * Sets (as xml) the "Owner" element
             */
            void xsetOwner(org.apache.xmlbeans.XmlString owner);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message newInstance() {
                  return (_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static _0._1.messages._504.iec62325.MessageListDocument.MessageList.Message newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (_0._1.messages._504.iec62325.MessageListDocument.MessageList.Message) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static _0._1.messages._504.iec62325.MessageListDocument.MessageList newInstance() {
              return (_0._1.messages._504.iec62325.MessageListDocument.MessageList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static _0._1.messages._504.iec62325.MessageListDocument.MessageList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (_0._1.messages._504.iec62325.MessageListDocument.MessageList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static _0._1.messages._504.iec62325.MessageListDocument newInstance() {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static _0._1.messages._504.iec62325.MessageListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.messages._504.iec62325.MessageListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static _0._1.messages._504.iec62325.MessageListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (_0._1.messages._504.iec62325.MessageListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
