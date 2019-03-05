/*
 * XML Type:  ReasonCodeTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.ReasonCodeTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML ReasonCodeTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardReasonCodeTypeList
 *     euWgediCodelists.entsoe.LocalReasonCodeType
 */
public class ReasonCodeTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.ReasonCodeTypeList, euWgediCodelists.entsoe.StandardReasonCodeTypeList, euWgediCodelists.entsoe.LocalReasonCodeType
{
    private static final long serialVersionUID = 1L;
    
    public ReasonCodeTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ReasonCodeTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
