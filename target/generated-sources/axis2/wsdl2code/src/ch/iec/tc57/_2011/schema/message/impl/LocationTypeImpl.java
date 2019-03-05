/*
 * XML Type:  LocationType
 * Namespace: http://iec.ch/TC57/2011/schema/message
 * Java type: ch.iec.tc57._2011.schema.message.LocationType
 *
 * Automatically generated - do not modify.
 */
package ch.iec.tc57._2011.schema.message.impl;
/**
 * An XML LocationType(@http://iec.ch/TC57/2011/schema/message).
 *
 * This is a complex type.
 */
public class LocationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements ch.iec.tc57._2011.schema.message.LocationType
{
    
    public LocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NODE$0 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "node");
    private static final javax.xml.namespace.QName PIPELINE$2 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "pipeline");
    private static final javax.xml.namespace.QName STAGE$4 = 
        new javax.xml.namespace.QName("http://iec.ch/TC57/2011/schema/message", "stage");
    
    
    /**
     * Gets the "node" element
     */
    public java.lang.String getNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "node" element
     */
    public org.apache.xmlbeans.XmlString xgetNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "node" element
     */
    public boolean isSetNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NODE$0) != 0;
        }
    }
    
    /**
     * Sets the "node" element
     */
    public void setNode(java.lang.String node)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NODE$0);
            }
            target.setStringValue(node);
        }
    }
    
    /**
     * Sets (as xml) the "node" element
     */
    public void xsetNode(org.apache.xmlbeans.XmlString node)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NODE$0);
            }
            target.set(node);
        }
    }
    
    /**
     * Unsets the "node" element
     */
    public void unsetNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NODE$0, 0);
        }
    }
    
    /**
     * Gets the "pipeline" element
     */
    public java.lang.String getPipeline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIPELINE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pipeline" element
     */
    public org.apache.xmlbeans.XmlString xgetPipeline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PIPELINE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "pipeline" element
     */
    public boolean isSetPipeline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PIPELINE$2) != 0;
        }
    }
    
    /**
     * Sets the "pipeline" element
     */
    public void setPipeline(java.lang.String pipeline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PIPELINE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PIPELINE$2);
            }
            target.setStringValue(pipeline);
        }
    }
    
    /**
     * Sets (as xml) the "pipeline" element
     */
    public void xsetPipeline(org.apache.xmlbeans.XmlString pipeline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PIPELINE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PIPELINE$2);
            }
            target.set(pipeline);
        }
    }
    
    /**
     * Unsets the "pipeline" element
     */
    public void unsetPipeline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PIPELINE$2, 0);
        }
    }
    
    /**
     * Gets the "stage" element
     */
    public java.lang.String getStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "stage" element
     */
    public org.apache.xmlbeans.XmlString xgetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STAGE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "stage" element
     */
    public boolean isSetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "stage" element
     */
    public void setStage(java.lang.String stage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STAGE$4);
            }
            target.setStringValue(stage);
        }
    }
    
    /**
     * Sets (as xml) the "stage" element
     */
    public void xsetStage(org.apache.xmlbeans.XmlString stage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STAGE$4);
            }
            target.set(stage);
        }
    }
    
    /**
     * Unsets the "stage" element
     */
    public void unsetStage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STAGE$4, 0);
        }
    }
}
