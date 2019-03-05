/*
 * XML Type:  Reason
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325.impl;
/**
 * An XML Reason(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is a complex type.
 */
public class ReasonImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason
{
    private static final long serialVersionUID = 1L;
    
    public ReasonImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "code");
    private static final javax.xml.namespace.QName TEXT$2 = 
        new javax.xml.namespace.QName("urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0", "text");
    
    
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
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString)get_store().find_element_user(CODE$0, 0);
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
    public void xsetCode(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonCodeString)get_store().add_element_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Gets the "text" element
     */
    public java.lang.String getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "text" element
     */
    public x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString xgetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString)get_store().find_element_user(TEXT$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "text" element
     */
    public boolean isSetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "text" element
     */
    public void setText(java.lang.String text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$2);
            }
            target.setStringValue(text);
        }
    }
    
    /**
     * Sets (as xml) the "text" element
     */
    public void xsetText(x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString text)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString target = null;
            target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString)get_store().find_element_user(TEXT$2, 0);
            if (target == null)
            {
                target = (x351Tc57Wg164511Acknowledgementdocument70.iec62325.ReasonTextString)get_store().add_element_user(TEXT$2);
            }
            target.set(text);
        }
    }
    
    /**
     * Unsets the "text" element
     */
    public void unsetText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEXT$2, 0);
        }
    }
}
