/*
 * XML Type:  PartyID_String
 * Namespace: urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0
 * Java type: x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString
 *
 * Automatically generated - do not modify.
 */
package x351Tc57Wg164511Acknowledgementdocument70.iec62325.impl;
/**
 * An XML PartyID_String(@urn:iec62325.351:tc57wg16:451-1:acknowledgementdocument:7:0).
 *
 * This is an atomic type that is a restriction of x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString.
 */
public class PartyIDStringImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString
{
    private static final long serialVersionUID = 1L;
    
    public PartyIDStringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected PartyIDStringImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName CODINGSCHEME$0 = 
        new javax.xml.namespace.QName("", "codingScheme");
    
    
    /**
     * Gets the "codingScheme" attribute
     */
    public java.lang.String getCodingScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODINGSCHEME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codingScheme" attribute
     */
    public euWgediCodelists.entsoe.CodingSchemeTypeList xgetCodingScheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            euWgediCodelists.entsoe.CodingSchemeTypeList target = null;
            target = (euWgediCodelists.entsoe.CodingSchemeTypeList)get_store().find_attribute_user(CODINGSCHEME$0);
            return target;
        }
    }
    
    /**
     * Sets the "codingScheme" attribute
     */
    public void setCodingScheme(java.lang.String codingScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODINGSCHEME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODINGSCHEME$0);
            }
            target.setStringValue(codingScheme);
        }
    }
    
    /**
     * Sets (as xml) the "codingScheme" attribute
     */
    public void xsetCodingScheme(euWgediCodelists.entsoe.CodingSchemeTypeList codingScheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            euWgediCodelists.entsoe.CodingSchemeTypeList target = null;
            target = (euWgediCodelists.entsoe.CodingSchemeTypeList)get_store().find_attribute_user(CODINGSCHEME$0);
            if (target == null)
            {
                target = (euWgediCodelists.entsoe.CodingSchemeTypeList)get_store().add_attribute_user(CODINGSCHEME$0);
            }
            target.set(codingScheme);
        }
    }
}
