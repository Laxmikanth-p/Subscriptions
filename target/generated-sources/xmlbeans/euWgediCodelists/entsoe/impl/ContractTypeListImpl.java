/*
 * XML Type:  ContractTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.ContractTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML ContractTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardContractTypeList
 *     euWgediCodelists.entsoe.LocalContractType
 */
public class ContractTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.ContractTypeList, euWgediCodelists.entsoe.StandardContractTypeList, euWgediCodelists.entsoe.LocalContractType
{
    private static final long serialVersionUID = 1L;
    
    public ContractTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ContractTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
