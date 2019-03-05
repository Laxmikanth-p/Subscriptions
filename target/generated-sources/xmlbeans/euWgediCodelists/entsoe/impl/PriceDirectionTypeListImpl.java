/*
 * XML Type:  PriceDirectionTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.PriceDirectionTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML PriceDirectionTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardPriceDirectionTypeList
 *     euWgediCodelists.entsoe.LocalPriceDirectionType
 */
public class PriceDirectionTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.PriceDirectionTypeList, euWgediCodelists.entsoe.StandardPriceDirectionTypeList, euWgediCodelists.entsoe.LocalPriceDirectionType
{
    private static final long serialVersionUID = 1L;
    
    public PriceDirectionTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected PriceDirectionTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
