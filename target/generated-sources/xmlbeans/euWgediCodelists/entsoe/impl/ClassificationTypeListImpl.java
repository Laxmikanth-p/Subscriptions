/*
 * XML Type:  ClassificationTypeList
 * Namespace: urn:entsoe.eu:wgedi:codelists
 * Java type: euWgediCodelists.entsoe.ClassificationTypeList
 *
 * Automatically generated - do not modify.
 */
package euWgediCodelists.entsoe.impl;
/**
 * An XML ClassificationTypeList(@urn:entsoe.eu:wgedi:codelists).
 *
 * This is a union type. Instances are of one of the following types:
 *     euWgediCodelists.entsoe.StandardClassificationTypeList
 *     euWgediCodelists.entsoe.LocalClassificationType
 */
public class ClassificationTypeListImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements euWgediCodelists.entsoe.ClassificationTypeList, euWgediCodelists.entsoe.StandardClassificationTypeList, euWgediCodelists.entsoe.LocalClassificationType
{
    private static final long serialVersionUID = 1L;
    
    public ClassificationTypeListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ClassificationTypeListImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
