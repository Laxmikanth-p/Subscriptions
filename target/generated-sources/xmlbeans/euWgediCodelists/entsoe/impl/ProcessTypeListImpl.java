/*
 * XML Type:  ProcessTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.ProcessTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML ProcessTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardProcessTypeList
 *     euWgediCodelists.entsoe.LocalProcessType
 */
public class ProcessTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.ProcessTypeList, euWgediCodelists.entsoe.StandardProcessTypeList, euWgediCodelists.entsoe.LocalProcessType
{
    private static final long serialVersionUID = 1L;
    
    public ProcessTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ProcessTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
