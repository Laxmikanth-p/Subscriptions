/*
 * XML Type:  DirectionTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.DirectionTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML DirectionTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardDirectionTypeList
 *     euWgediCodelists.entsoe.LocalDirectionType
 */
public class DirectionTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.DirectionTypeList, euWgediCodelists.entsoe.StandardDirectionTypeList, euWgediCodelists.entsoe.LocalDirectionType
{
    private static final long serialVersionUID = 1L;
    
    public DirectionTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DirectionTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
