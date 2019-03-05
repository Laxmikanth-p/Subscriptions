/*
 * XML Type:  QualityTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.QualityTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML QualityTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardQualityTypeList
 *     euWgediCodelists.entsoe.LocalQualityType
 */
public class QualityTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.QualityTypeList, euWgediCodelists.entsoe.StandardQualityTypeList, euWgediCodelists.entsoe.LocalQualityType
{
    private static final long serialVersionUID = 1L;
    
    public QualityTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected QualityTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
