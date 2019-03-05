/*
 * XML Type:  PaymentTermsTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.PaymentTermsTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML PaymentTermsTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardPaymentTermsTypeList
 *     euWgediCodelists.entsoe.LocalPaymentTermsType
 */
public class PaymentTermsTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.PaymentTermsTypeList, euWgediCodelists.entsoe.StandardPaymentTermsTypeList, euWgediCodelists.entsoe.LocalPaymentTermsType
{
    private static final long serialVersionUID = 1L;
    
    public PaymentTermsTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected PaymentTermsTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
