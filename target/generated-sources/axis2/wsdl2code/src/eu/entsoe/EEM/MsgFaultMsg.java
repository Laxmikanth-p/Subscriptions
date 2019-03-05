
/**
 * MsgFaultMsg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package eu.entsoe.EEM;

public class MsgFaultMsg extends java.lang.Exception{

    private static final long serialVersionUID = 1551358479353L;
    
    private ch.iec.tc57._2011.schema.message.FaultMessageDocument faultMessage;

    
        public MsgFaultMsg() {
            super("MsgFaultMsg");
        }

        public MsgFaultMsg(java.lang.String s) {
           super(s);
        }

        public MsgFaultMsg(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public MsgFaultMsg(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ch.iec.tc57._2011.schema.message.FaultMessageDocument msg){
       faultMessage = msg;
    }
    
    public ch.iec.tc57._2011.schema.message.FaultMessageDocument getFaultMessage(){
       return faultMessage;
    }
}
    