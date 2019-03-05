/*
 * XML Type:  EicTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.EicTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML EicTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardEicTypeList
 *     euWgediCodelists.entsoe.LocalEicType
 */
public class EicTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.EicTypeList, euWgediCodelists.entsoe.StandardEicTypeList, euWgediCodelists.entsoe.LocalEicType
{
    private static final long serialVersionUID = 1L;
    
    public EicTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EicTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
