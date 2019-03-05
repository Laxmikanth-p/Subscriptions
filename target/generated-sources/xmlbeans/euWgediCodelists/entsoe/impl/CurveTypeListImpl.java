/*
 * XML Type:  CurveTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.CurveTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML CurveTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardCurveTypeList
 *     euWgediCodelists.entsoe.LocalCurveType
 */
public class CurveTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.CurveTypeList, euWgediCodelists.entsoe.StandardCurveTypeList, euWgediCodelists.entsoe.LocalCurveType
{
    private static final long serialVersionUID = 1L;
    
    public CurveTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CurveTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
