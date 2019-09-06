package cmdTools;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailEngine {

	public static String sendMail(String msg) throws AddressException, MessagingException, Exception{
		final String username = "689218@cognizant.com";
		final String password = "Asdqwe$3477";

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

		

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("ivrnotification@cognizant.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("atal.phatak@cognizant.com"));
			message.setSubject("Smart IVR automated notification");
			message.setText(msg);

			Transport.send(message);

			System.out.println("Done");
			return ("Email Success");

		

		
	}

}
