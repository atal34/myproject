package email;

import java.awt.Color;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendOutlookEmail {
	
	public static String addColor(String msg, Color color) {
	    String hexColor = String.format("#%06X",  (0xFFFFFF & color.getRGB()));
	    String colorMsg = "<FONT COLOR=\"#" + hexColor + "\">" + msg + "</FONT>";
	    return colorMsg;
	}
	//776786
	public static void main(String[]args) throws IOException {

        //final String username = "689218@cognizant.com";
        //final String password = "Asdqwe$344";
        
		//System.setProperty("", value)
		
        final String username = "689218@cognizant.com";
        final String password = "Asdqwe$3477";
        
        /*String bodyText = "<br>" + addColor("This line is red.", Color.RED) + "</br>";
        bodyText += "<br>" + addColor("This line is blue.", Color.BLUE) + "</br>";
        bodyText += "<br>" + addColor("This line is black.", Color.BLACK) + "</br>";*/
        

        Properties props = new Properties();
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "outlook.office365.com");
        props.put("mail.smtp.port", "587");
        

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("atal.phatak@cognizant.com"));
           // message.setFrom(new InternetAddress("ivrnotification@cognizant.com"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("atal.phatak@cognizant.com"));
            //message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("ashutosh.tripati@cognizant.com"));
            //message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("lbarone@gannett.com"));
            message.setSubject("Smart IVR automated notification");
            //message.setContent(bodyText,"text/html" );
            String finalLine = "\n\nThis is an automated email. Do not reply as this mailbox is not monitored.";
            addColor(finalLine, Color.BLUE);
            message.setText("Hi  \n\nShared mailbox for automated email at Cognizant end is ready!! "+finalLine);

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}