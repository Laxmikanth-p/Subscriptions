/*
 * XML Type:  RightsTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.RightsTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML RightsTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardRightsTypeList
 *     euWgediCodelists.entsoe.LocalRightsType
 */
public class RightsTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.RightsTypeList, euWgediCodelists.entsoe.StandardRightsTypeList, euWgediCodelists.entsoe.LocalRightsType
{
    private static final long serialVersionUID = 1L;
    
    public RightsTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RightsTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
