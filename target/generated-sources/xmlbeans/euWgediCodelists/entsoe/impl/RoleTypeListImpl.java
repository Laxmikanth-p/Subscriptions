/*
 * XML Type:  RoleTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.RoleTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML RoleTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardRoleTypeList
 *     euWgediCodelists.entsoe.LocalRoleType
 */
public class RoleTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.RoleTypeList, euWgediCodelists.entsoe.StandardRoleTypeList, euWgediCodelists.entsoe.LocalRoleType
{
    private static final long serialVersionUID = 1L;
    
    public RoleTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
