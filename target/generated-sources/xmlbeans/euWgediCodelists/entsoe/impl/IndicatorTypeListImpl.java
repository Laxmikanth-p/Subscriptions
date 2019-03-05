/*
 * XML Type:  IndicatorTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.IndicatorTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML IndicatorTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardIndicatorTypeList
 *     euWgediCodelists.entsoe.LocalIndicatorType
 */
public class IndicatorTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.IndicatorTypeList, euWgediCodelists.entsoe.StandardIndicatorTypeList, euWgediCodelists.entsoe.LocalIndicatorType
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected IndicatorTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
