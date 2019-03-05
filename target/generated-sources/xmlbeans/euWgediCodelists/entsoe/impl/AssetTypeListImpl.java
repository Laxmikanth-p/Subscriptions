/*
 * XML Type:  AssetTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.AssetTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML AssetTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardAssetTypeList
 *     euWgediCodelists.entsoe.LocalAssetType
 */
public class AssetTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.AssetTypeList, euWgediCodelists.entsoe.StandardAssetTypeList, euWgediCodelists.entsoe.LocalAssetType
{
    private static final long serialVersionUID = 1L;
    
    public AssetTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected AssetTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
