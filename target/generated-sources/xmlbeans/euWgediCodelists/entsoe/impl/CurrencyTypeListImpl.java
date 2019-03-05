/*
 * XML Type:  CurrencyTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.CurrencyTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML CurrencyTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardCurrencyTypeList
 *     euWgediCodelists.entsoe.LocalCurrencyType
 */
public class CurrencyTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.CurrencyTypeList, euWgediCodelists.entsoe.StandardCurrencyTypeList, euWgediCodelists.entsoe.LocalCurrencyType
{
    private static final long serialVersionUID = 1L;
    
    public CurrencyTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CurrencyTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
