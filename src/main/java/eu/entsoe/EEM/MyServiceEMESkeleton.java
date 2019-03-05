package eu.entsoe.EEM;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xmlbeans.XmlCursor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import ch.iec.tc57._2011.schema.message.HeaderType.Verb;
import ch.iec.tc57._2011.schema.message.PayloadType;
import ch.iec.tc57._2011.schema.message.ReplyType.Result;
import ch.iec.tc57._2011.schema.message.RequestMessageDocument;
import ch.iec.tc57._2011.schema.message.ResponseMessageDocument;
import x351Tc57Wg164511Acknowledgementdocument70.iec62325.Reason;

public class MyServiceEMESkeleton implements ServiceEMESkeletonInterface {

	
	public ch.iec.tc57._2011.schema.message.ResponseMessageDocument request
    (
    ch.iec.tc57._2011.schema.message.RequestMessageDocument requestMessage0
    
    )
throws MsgFaultMsg{
	/*Compose the response  */
	ch.iec.tc57._2011.schema.message.ResponseMessageDocument ResponseDoc = ch.iec.tc57._2011.schema.message.ResponseMessageDocument.Factory.newInstance();
	ch.iec.tc57._2011.schema.message.ResponseMessageType Response = ch.iec.tc57._2011.schema.message.ResponseMessageType.Factory.newInstance();
	ch.iec.tc57._2011.schema.message.HeaderType Header = ch.iec.tc57._2011.schema.message.HeaderType.Factory.newInstance();
			Header.setVerb(Verb.REPLY);
			Header.setNoun("Acknowledgement_MarketDocument");
			Header.setContext("PRODUCTION");
			Calendar cal = Calendar.getInstance();
			Header.setTimestamp(cal);
	Response.setHeader(Header);
	
	ch.iec.tc57._2011.schema.message.ReplyType Reply = ch.iec.tc57._2011.schema.message.ReplyType.Factory.newInstance();
	Reply.setResult(Result.OK);
	Response.setReply(Reply);
	ch.iec.tc57._2011.schema.message.PayloadType Payload = ch.iec.tc57._2011.schema.message.PayloadType.Factory.newInstance();
	XmlCursor PayloadCursor = Payload.newCursor();
	PayloadCursor.toEndToken();
	
	x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocumentDocument1 ACKDoc;
	try {
		ACKDoc = createACK(requestMessage0.getRequestMessage().getPayload());
		XmlCursor ACKDocCursor = ACKDoc.newCursor();
		ACKDocCursor.toStartDoc();
		ACKDocCursor.toNextToken();
		ACKDocCursor.moveXml(PayloadCursor);

		Payload.setFormat("XML");
		Response.setPayload(Payload);
		ResponseDoc.setResponseMessage(Response);

		//We have the response ready, Let's save the files 
		//String logfolder = "c:/log/"; //This is the root folder to log files in
		String logfolder = "/var/log/subscription";
	    //Create a folder for the day
		String Day =  new SimpleDateFormat("yyyy_MM_dd").format(new Date());
	    logfolder = logfolder + System.getProperty("file.separator") +Day+ System.getProperty("file.separator") ;
		File logdirectory = new File(logfolder);
	    if (!logdirectory.exists()) logdirectory.mkdirs(); 
	    
	    DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = domFactory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader( requestMessage0.getRequestMessage().getPayload().toString())));
        Element rootElement = document.getDocumentElement();
		
        
		String fileName = Day
						+ "_"+ getString("type",rootElement)
						+ "_"+ getString("mRID",rootElement)
						+".xml";
			
	    System.out.println(fileName);
	    String fileContent=requestMessage0.getRequestMessage().getPayload().xmlText();
	    BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(logfolder+fileName));
		    writer.write(fileContent);
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileContent=ResponseDoc.xmlText();
	    try {
			writer = new BufferedWriter(new FileWriter(logfolder+"ACK_"+fileName));
		    writer.write(fileContent);
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		new  java.lang.UnsupportedOperationException("Unable to create Acknowledgement Message " + this.getClass().getName());
	}
	
    return ResponseDoc;    
}

	private x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocumentDocument1 createACK(PayloadType request) throws Exception {
        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = domFactory.newDocumentBuilder();
//        Document document = builder.parse(new File("C:/log/2019_03_05_12_15_10_383.xml"));
        Document document = builder.parse(new InputSource(new StringReader(request.toString())));
        Element rootElement = document.getDocumentElement();
		
	    x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocumentDocument1 ACKDoc = x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocumentDocument1.Factory.newInstance();
		x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1 ACK = x351Tc57Wg164511Acknowledgementdocument70.iec62325.AcknowledgementMarketDocument1.Factory.newInstance();
		
		ACK.setMRID("ACK_"+ getString("mRID",rootElement));
		
		Calendar cal = Calendar.getInstance();
		ACK.setCreatedDateTime(cal);
		
		x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString Sender = x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString.Factory.newInstance();
		Sender.setCodingScheme("A01");
		Sender.setStringValue(getString("receiver_MarketParticipant.mRID",rootElement));
		ACK.setSenderMarketParticipantMRID(Sender);
		ACK.setSenderMarketParticipantMarketRoleType(getString("receiver_MarketParticipant.marketRole.type",rootElement));
		

		x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString Reciever = x351Tc57Wg164511Acknowledgementdocument70.iec62325.PartyIDString.Factory.newInstance();
		Reciever.setCodingScheme("A01");
		Reciever.setStringValue(getString("sender_MarketParticipant.mRID",rootElement));
		ACK.setReceiverMarketParticipantMRID(Reciever);
		ACK.setReceiverMarketParticipantMarketRoleType(getString("sender_MarketParticipant.marketRole.type",rootElement));
		
		ACK.setReceivedMarketDocumentMRID(getString("mRID",rootElement));
		
		DatatypeFactory factory = DatatypeFactory.newInstance();
		XMLGregorianCalendar xmlCal = factory.newXMLGregorianCalendar(getString("createdDateTime",rootElement));
		Calendar ReceivedMarketDocumentCreatedDateTime = xmlCal.toGregorianCalendar();
		
		ACK.setReceivedMarketDocumentCreatedDateTime(ReceivedMarketDocumentCreatedDateTime);
		
		ACK.setReceivedMarketDocumentType(getString("type",rootElement));
		
		Reason reason = Reason.Factory.newInstance();
			reason.setCode("A01");
		ACK.addNewReason();
		ACK.setReasonArray(0, reason );
		
		
		ACKDoc.setAcknowledgementMarketDocument(ACK);
		return ACKDoc;
	}
	
    protected static String getString(String tagName, Element element) {
        NodeList list = element.getElementsByTagName(tagName);
        if (list != null && list.getLength() > 0) {
            NodeList subList = list.item(0).getChildNodes();

            if (subList != null && subList.getLength() > 0) {
                return subList.item(0).getNodeValue();
            }
        }

        return null;
    }

}
