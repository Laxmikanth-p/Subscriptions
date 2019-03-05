/*
 * XML Type:  ErrorType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.ErrorType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML ErrorType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class ErrorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.ErrorType
{
    
    public ErrorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "code");
    private static final javax.xml.namespace.QName LEVEL$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "level");
    private static final javax.xml.namespace.QName REASON$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "reason");
    private static final javax.xml.namespace.QName DETAILS$6 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "details");
    private static final javax.xml.namespace.QName XPATH$8 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "xpath");
    private static final javax.xml.namespace.QName STACKTRACE$10 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "stackTrace");
    private static final javax.xml.namespace.QName LOCATION$12 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "Location");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "ID");
    private static final javax.xml.namespace.QName RELATEDID$16 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "relatedID");
    private static final javax.xml.namespace.QName OBJECT$18 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "object");
    private static final javax.xml.namespace.QName OPERATIONID$20 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "operationId");
    
    
    /**
     * Gets the "code" element
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" element
     */
    public org.apache.xmlbeans.XmlString xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" element
     */
    public void xsetCode(org.apache.xmlbeans.XmlString code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "level" element
     */
    public ch.iec.tc57._2011.schema.message.ErrorType.Level.Enum getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return (ch.iec.tc57._2011.schema.message.ErrorType.Level.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" element
     */
    public ch.iec.tc57._2011.schema.message.ErrorType.Level xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.Level target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.Level)get_store().find_element_user(LEVEL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "level" element
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEVEL$2) != 0;
        }
    }
    
    /**
     * Sets the "level" element
     */
    public void setLevel(ch.iec.tc57._2011.schema.message.ErrorType.Level.Enum level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEVEL$2);
            }
            target.setEnumValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" element
     */
    public void xsetLevel(ch.iec.tc57._2011.schema.message.ErrorType.Level level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.Level target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.Level)get_store().find_element_user(LEVEL$2, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ErrorType.Level)get_store().add_element_user(LEVEL$2);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" element
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEVEL$2, 0);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public java.lang.String getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reason" element
     */
    public org.apache.xmlbeans.XmlString xgetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "reason" element
     */
    public boolean isSetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASON$4) != 0;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(java.lang.String reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$4);
            }
            target.setStringValue(reason);
        }
    }
    
    /**
     * Sets (as xml) the "reason" element
     */
    public void xsetReason(org.apache.xmlbeans.XmlString reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$4);
            }
            target.set(reason);
        }
    }
    
    /**
     * Unsets the "reason" element
     */
    public void unsetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASON$4, 0);
        }
    }
    
    /**
     * Gets the "details" element
     */
    public java.lang.String getDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "details" element
     */
    public org.apache.xmlbeans.XmlString xgetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAILS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "details" element
     */
    public boolean isSetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETAILS$6) != 0;
        }
    }
    
    /**
     * Sets the "details" element
     */
    public void setDetails(java.lang.String details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAILS$6);
            }
            target.setStringValue(details);
        }
    }
    
    /**
     * Sets (as xml) the "details" element
     */
    public void xsetDetails(org.apache.xmlbeans.XmlString details)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAILS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETAILS$6);
            }
            target.set(details);
        }
    }
    
    /**
     * Unsets the "details" element
     */
    public void unsetDetails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETAILS$6, 0);
        }
    }
    
    /**
     * Gets the "xpath" element
     */
    public javax.xml.namespace.QName getXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XPATH$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "xpath" element
     */
    public org.apache.xmlbeans.XmlQName xgetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(XPATH$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "xpath" element
     */
    public boolean isSetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XPATH$8) != 0;
        }
    }
    
    /**
     * Sets the "xpath" element
     */
    public void setXpath(javax.xml.namespace.QName xpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(XPATH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(XPATH$8);
            }
            target.setQNameValue(xpath);
        }
    }
    
    /**
     * Sets (as xml) the "xpath" element
     */
    public void xsetXpath(org.apache.xmlbeans.XmlQName xpath)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(XPATH$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(XPATH$8);
            }
            target.set(xpath);
        }
    }
    
    /**
     * Unsets the "xpath" element
     */
    public void unsetXpath()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XPATH$8, 0);
        }
    }
    
    /**
     * Gets the "stackTrace" element
     */
    public java.lang.String getStackTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STACKTRACE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stackTrace" element
     */
    public org.apache.xmlbeans.XmlString xgetStackTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STACKTRACE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "stackTrace" element
     */
    public boolean isSetStackTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STACKTRACE$10) != 0;
        }
    }
    
    /**
     * Sets the "stackTrace" element
     */
    public void setStackTrace(java.lang.String stackTrace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STACKTRACE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STACKTRACE$10);
            }
            target.setStringValue(stackTrace);
        }
    }
    
    /**
     * Sets (as xml) the "stackTrace" element
     */
    public void xsetStackTrace(org.apache.xmlbeans.XmlString stackTrace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STACKTRACE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STACKTRACE$10);
            }
            target.set(stackTrace);
        }
    }
    
    /**
     * Unsets the "stackTrace" element
     */
    public void unsetStackTrace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STACKTRACE$10, 0);
        }
    }
    
    /**
     * Gets the "Location" element
     */
    public ch.iec.tc57._2011.schema.message.LocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.LocationType target = null;
            target = (ch.iec.tc57._2011.schema.message.LocationType)get_store().find_element_user(LOCATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Location" element
     */
    public boolean isSetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$12) != 0;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(ch.iec.tc57._2011.schema.message.LocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.LocationType target = null;
            target = (ch.iec.tc57._2011.schema.message.LocationType)get_store().find_element_user(LOCATION$12, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.LocationType)get_store().add_element_user(LOCATION$12);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "Location" element
     */
    public ch.iec.tc57._2011.schema.message.LocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.LocationType target = null;
            target = (ch.iec.tc57._2011.schema.message.LocationType)get_store().add_element_user(LOCATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "Location" element
     */
    public void unsetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$12, 0);
        }
    }
    
    /**
     * Gets the "ID" element
     */
    public ch.iec.tc57._2011.schema.message.ErrorType.ID getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.ID)get_store().find_element_user(ID$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ID" element
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$14) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    public void setID(ch.iec.tc57._2011.schema.message.ErrorType.ID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.ID)get_store().find_element_user(ID$14, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ErrorType.ID)get_store().add_element_user(ID$14);
            }
            target.set(id);
        }
    }
    
    /**
     * Appends and returns a new empty "ID" element
     */
    public ch.iec.tc57._2011.schema.message.ErrorType.ID addNewID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.ID target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.ID)get_store().add_element_user(ID$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$14, 0);
        }
    }
    
    /**
     * Gets the "relatedID" element
     */
    public ch.iec.tc57._2011.schema.message.ErrorType.RelatedID getRelatedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.RelatedID target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.RelatedID)get_store().find_element_user(RELATEDID$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relatedID" element
     */
    public boolean isSetRelatedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDID$16) != 0;
        }
    }
    
    /**
     * Sets the "relatedID" element
     */
    public void setRelatedID(ch.iec.tc57._2011.schema.message.ErrorType.RelatedID relatedID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.RelatedID target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.RelatedID)get_store().find_element_user(RELATEDID$16, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ErrorType.RelatedID)get_store().add_element_user(RELATEDID$16);
            }
            target.set(relatedID);
        }
    }
    
    /**
     * Appends and returns a new empty "relatedID" element
     */
    public ch.iec.tc57._2011.schema.message.ErrorType.RelatedID addNewRelatedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ErrorType.RelatedID target = null;
            target = (ch.iec.tc57._2011.schema.message.ErrorType.RelatedID)get_store().add_element_user(RELATEDID$16);
            return target;
        }
    }
    
    /**
     * Unsets the "relatedID" element
     */
    public void unsetRelatedID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDID$16, 0);
        }
    }
    
    /**
     * Gets the "object" element
     */
    public ch.iec.tc57._2011.schema.message.ObjectType getObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ObjectType target = null;
            target = (ch.iec.tc57._2011.schema.message.ObjectType)get_store().find_element_user(OBJECT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "object" element
     */
    public boolean isSetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$18) != 0;
        }
    }
    
    /**
     * Sets the "object" element
     */
    public void setObject(ch.iec.tc57._2011.schema.message.ObjectType object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ObjectType target = null;
            target = (ch.iec.tc57._2011.schema.message.ObjectType)get_store().find_element_user(OBJECT$18, 0);
            if (target == null)
            {
                target = (ch.iec.tc57._2011.schema.message.ObjectType)get_store().add_element_user(OBJECT$18);
            }
            target.set(object);
        }
    }
    
    /**
     * Appends and returns a new empty "object" element
     */
    public ch.iec.tc57._2011.schema.message.ObjectType addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            ch.iec.tc57._2011.schema.message.ObjectType target = null;
            target = (ch.iec.tc57._2011.schema.message.ObjectType)get_store().add_element_user(OBJECT$18);
            return target;
        }
    }
    
    /**
     * Unsets the "object" element
     */
    public void unsetObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$18, 0);
        }
    }
    
    /**
     * Gets the "operationId" element
     */
    public java.math.BigInteger getOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationId" element
     */
    public org.apache.xmlbeans.XmlInteger xgetOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPERATIONID$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "operationId" element
     */
    public boolean isSetOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONID$20) != 0;
        }
    }
    
    /**
     * Sets the "operationId" element
     */
    public void setOperationId(java.math.BigInteger operationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONID$20);
            }
            target.setBigIntegerValue(operationId);
        }
    }
    
    /**
     * Sets (as xml) the "operationId" element
     */
    public void xsetOperationId(org.apache.xmlbeans.XmlInteger operationId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(OPERATIONID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(OPERATIONID$20);
            }
            target.set(operationId);
        }
    }
    
    /**
     * Unsets the "operationId" element
     */
    public void unsetOperationId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONID$20, 0);
        }
    }
    /**
     * An XML level(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ErrorType$Level.
     */
    public static class LevelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements ch.iec.tc57._2011.schema.message.ErrorType.Level
    {
        
        public LevelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ErrorType$ID.
     */
    public static class IDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements ch.iec.tc57._2011.schema.message.ErrorType.ID
    {
        
        public IDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected IDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName IDTYPE$0 = 
            new javax.xml.namespace.QName("", "idType");
        private static final javax.xml.namespace.QName IDAUTHORITY$2 = 
            new javax.xml.namespace.QName("", "idAuthority");
        private static final javax.xml.namespace.QName KIND$4 = 
            new javax.xml.namespace.QName("", "kind");
        private static final javax.xml.namespace.QName OBJECTTYPE$6 = 
            new javax.xml.namespace.QName("", "objectType");
        
        
        /**
         * Gets the "idType" attribute
         */
        public java.lang.String getIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDTYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "idType" attribute
         */
        public boolean isSetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "idType" attribute
         */
        public void setIdType(java.lang.String idType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDTYPE$0);
                }
                target.setStringValue(idType);
            }
        }
        
        /**
         * Sets (as xml) the "idType" attribute
         */
        public void xsetIdType(org.apache.xmlbeans.XmlString idType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDTYPE$0);
                }
                target.set(idType);
            }
        }
        
        /**
         * Unsets the "idType" attribute
         */
        public void unsetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDTYPE$0);
            }
        }
        
        /**
         * Gets the "idAuthority" attribute
         */
        public java.lang.String getIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idAuthority" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDAUTHORITY$2);
                return target;
            }
        }
        
        /**
         * True if has "idAuthority" attribute
         */
        public boolean isSetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDAUTHORITY$2) != null;
            }
        }
        
        /**
         * Sets the "idAuthority" attribute
         */
        public void setIdAuthority(java.lang.String idAuthority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDAUTHORITY$2);
                }
                target.setStringValue(idAuthority);
            }
        }
        
        /**
         * Sets (as xml) the "idAuthority" attribute
         */
        public void xsetIdAuthority(org.apache.xmlbeans.XmlString idAuthority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDAUTHORITY$2);
                }
                target.set(idAuthority);
            }
        }
        
        /**
         * Unsets the "idAuthority" attribute
         */
        public void unsetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDAUTHORITY$2);
            }
        }
        
        /**
         * Gets the "kind" attribute
         */
        public ch.iec.tc57._2011.schema.message.IDKindType.Enum getKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    return null;
                }
                return (ch.iec.tc57._2011.schema.message.IDKindType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "kind" attribute
         */
        public ch.iec.tc57._2011.schema.message.IDKindType xgetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ch.iec.tc57._2011.schema.message.IDKindType target = null;
                target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().find_attribute_user(KIND$4);
                return target;
            }
        }
        
        /**
         * True if has "kind" attribute
         */
        public boolean isSetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KIND$4) != null;
            }
        }
        
        /**
         * Sets the "kind" attribute
         */
        public void setKind(ch.iec.tc57._2011.schema.message.IDKindType.Enum kind)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KIND$4);
                }
                target.setEnumValue(kind);
            }
        }
        
        /**
         * Sets (as xml) the "kind" attribute
         */
        public void xsetKind(ch.iec.tc57._2011.schema.message.IDKindType kind)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ch.iec.tc57._2011.schema.message.IDKindType target = null;
                target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().add_attribute_user(KIND$4);
                }
                target.set(kind);
            }
        }
        
        /**
         * Unsets the "kind" attribute
         */
        public void unsetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KIND$4);
            }
        }
        
        /**
         * Gets the "objectType" attribute
         */
        public java.lang.String getObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "objectType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "objectType" attribute
         */
        public boolean isSetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OBJECTTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "objectType" attribute
         */
        public void setObjectType(java.lang.String objectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$6);
                }
                target.setStringValue(objectType);
            }
        }
        
        /**
         * Sets (as xml) the "objectType" attribute
         */
        public void xsetObjectType(org.apache.xmlbeans.XmlString objectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OBJECTTYPE$6);
                }
                target.set(objectType);
            }
        }
        
        /**
         * Unsets the "objectType" attribute
         */
        public void unsetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OBJECTTYPE$6);
            }
        }
    }
    /**
     * An XML relatedID(@http://iec.ch/TC57/2011/schema/message).
     *
     * This is an atomic type that is a restriction of ch.iec.tc57._2011.schema.message.ErrorType$RelatedID.
     */
    public static class RelatedIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements ch.iec.tc57._2011.schema.message.ErrorType.RelatedID
    {
        
        public RelatedIDImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RelatedIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName IDTYPE$0 = 
            new javax.xml.namespace.QName("", "idType");
        private static final javax.xml.namespace.QName IDAUTHORITY$2 = 
            new javax.xml.namespace.QName("", "idAuthority");
        private static final javax.xml.namespace.QName KIND$4 = 
            new javax.xml.namespace.QName("", "kind");
        private static final javax.xml.namespace.QName OBJECTTYPE$6 = 
            new javax.xml.namespace.QName("", "objectType");
        
        
        /**
         * Gets the "idType" attribute
         */
        public java.lang.String getIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDTYPE$0);
                return target;
            }
        }
        
        /**
         * True if has "idType" attribute
         */
        public boolean isSetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDTYPE$0) != null;
            }
        }
        
        /**
         * Sets the "idType" attribute
         */
        public void setIdType(java.lang.String idType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDTYPE$0);
                }
                target.setStringValue(idType);
            }
        }
        
        /**
         * Sets (as xml) the "idType" attribute
         */
        public void xsetIdType(org.apache.xmlbeans.XmlString idType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDTYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDTYPE$0);
                }
                target.set(idType);
            }
        }
        
        /**
         * Unsets the "idType" attribute
         */
        public void unsetIdType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDTYPE$0);
            }
        }
        
        /**
         * Gets the "idAuthority" attribute
         */
        public java.lang.String getIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "idAuthority" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDAUTHORITY$2);
                return target;
            }
        }
        
        /**
         * True if has "idAuthority" attribute
         */
        public boolean isSetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDAUTHORITY$2) != null;
            }
        }
        
        /**
         * Sets the "idAuthority" attribute
         */
        public void setIdAuthority(java.lang.String idAuthority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDAUTHORITY$2);
                }
                target.setStringValue(idAuthority);
            }
        }
        
        /**
         * Sets (as xml) the "idAuthority" attribute
         */
        public void xsetIdAuthority(org.apache.xmlbeans.XmlString idAuthority)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDAUTHORITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDAUTHORITY$2);
                }
                target.set(idAuthority);
            }
        }
        
        /**
         * Unsets the "idAuthority" attribute
         */
        public void unsetIdAuthority()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDAUTHORITY$2);
            }
        }
        
        /**
         * Gets the "kind" attribute
         */
        public ch.iec.tc57._2011.schema.message.IDKindType.Enum getKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    return null;
                }
                return (ch.iec.tc57._2011.schema.message.IDKindType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "kind" attribute
         */
        public ch.iec.tc57._2011.schema.message.IDKindType xgetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                ch.iec.tc57._2011.schema.message.IDKindType target = null;
                target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().find_attribute_user(KIND$4);
                return target;
            }
        }
        
        /**
         * True if has "kind" attribute
         */
        public boolean isSetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KIND$4) != null;
            }
        }
        
        /**
         * Sets the "kind" attribute
         */
        public void setKind(ch.iec.tc57._2011.schema.message.IDKindType.Enum kind)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KIND$4);
                }
                target.setEnumValue(kind);
            }
        }
        
        /**
         * Sets (as xml) the "kind" attribute
         */
        public void xsetKind(ch.iec.tc57._2011.schema.message.IDKindType kind)
        {
            synchronized (monitor())
            {
                check_orphaned();
                ch.iec.tc57._2011.schema.message.IDKindType target = null;
                target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().find_attribute_user(KIND$4);
                if (target == null)
                {
                    target = (ch.iec.tc57._2011.schema.message.IDKindType)get_store().add_attribute_user(KIND$4);
                }
                target.set(kind);
            }
        }
        
        /**
         * Unsets the "kind" attribute
         */
        public void unsetKind()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KIND$4);
            }
        }
        
        /**
         * Gets the "objectType" attribute
         */
        public java.lang.String getObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "objectType" attribute
         */
        public org.apache.xmlbeans.XmlString xgetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "objectType" attribute
         */
        public boolean isSetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OBJECTTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "objectType" attribute
         */
        public void setObjectType(java.lang.String objectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJECTTYPE$6);
                }
                target.setStringValue(objectType);
            }
        }
        
        /**
         * Sets (as xml) the "objectType" attribute
         */
        public void xsetObjectType(org.apache.xmlbeans.XmlString objectType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJECTTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OBJECTTYPE$6);
                }
                target.set(objectType);
            }
        }
        
        /**
         * Unsets the "objectType" attribute
         */
        public void unsetObjectType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OBJECTTYPE$6);
            }
        }
    }
}
