/*
 * XML Type:  PriceCategoryTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.PriceCategoryTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML PriceCategoryTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardPriceCategoryTypeList
 *     euWgediCodelists.entsoe.LocalPriceCategoryType
 */
public class PriceCategoryTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.PriceCategoryTypeList, euWgediCodelists.entsoe.StandardPriceCategoryTypeList, euWgediCodelists.entsoe.LocalPriceCategoryType
{
    private static final long serialVersionUID = 1L;
    
    public PriceCategoryTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected PriceCategoryTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
