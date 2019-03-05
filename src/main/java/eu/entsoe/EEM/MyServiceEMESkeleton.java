package eu.entsoe.EEM;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ch.iec.tc57._2011.schema.message.RequestMessageDocument;
import ch.iec.tc57._2011.schema.message.ResponseMessageDocument;

public class MyServiceEMESkeleton implements ServiceEMESkeletonInterface {
    public ch.iec.tc57._2011.schema.message.ResponseMessageDocument request
    (
    ch.iec.tc57._2011.schema.message.RequestMessageDocument requestMessage0
    
    )
throws MsgFaultMsg{
  //TODO : fill this with the necessary business logic
    System.out.println(requestMessage0.xmlText());
    String fileContent=requestMessage0.xmlText();
    String fileName = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SSS").format(new Date());
    System.out.println(fileName);
    BufferedWriter writer;
	try {
		writer = new BufferedWriter(new FileWriter("c:/log/"+fileName+".xml"));
	    writer.write(fileContent);
	    writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	ch.iec.tc57._2011.schema.message.ResponseMessageDocument ResponseDoc = ch.iec.tc57._2011.schema.message.ResponseMessageDocument.Factory.newInstance();

    return ResponseDoc;
 // throw new  java.lang.UnsupportedOperationException("Tamas here: Please implement " + this.getClass().getName() + "#request");
}

}
