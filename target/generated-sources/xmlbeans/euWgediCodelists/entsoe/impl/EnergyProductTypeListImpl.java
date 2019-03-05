/*
 * XML Type:  EnergyProductTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.EnergyProductTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML EnergyProductTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardEnergyProductTypeList
 *     euWgediCodelists.entsoe.LocalEnergyProductType
 */
public class EnergyProductTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.EnergyProductTypeList, euWgediCodelists.entsoe.StandardEnergyProductTypeList, euWgediCodelists.entsoe.LocalEnergyProductType
{
    private static final long serialVersionUID = 1L;
    
    public EnergyProductTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EnergyProductTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
