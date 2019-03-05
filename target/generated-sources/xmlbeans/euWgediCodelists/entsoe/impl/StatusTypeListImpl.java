/*
 * XML Type:  StatusTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.StatusTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML StatusTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardStatusTypeList
 *     euWgediCodelists.entsoe.LocalStatusType
 */
public class StatusTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.StatusTypeList, euWgediCodelists.entsoe.StandardStatusTypeList, euWgediCodelists.entsoe.LocalStatusType
{
    private static final long serialVersionUID = 1L;
    
    public StatusTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected StatusTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
