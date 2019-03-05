/*
 * XML Type:  AuctionTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.AuctionTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML AuctionTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardAuctionTypeList
 *     euWgediCodelists.entsoe.LocalAuctionType
 */
public class AuctionTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.AuctionTypeList, euWgediCodelists.entsoe.StandardAuctionTypeList, euWgediCodelists.entsoe.LocalAuctionType
{
    private static final long serialVersionUID = 1L;
    
    public AuctionTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected AuctionTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
