package adwsHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import javax.net.ssl.HttpsURLConnection;


public class ADWS {

	/**
	 * Used for validation of emp ID 
	 * request param  : url and empID
	 * response param : JSN object with succes if validation is successful and fail if the validation fails 
	 * @throws MalformedURLException , IOExcpetion
	 */
	public String validateEmpID(String requestUrl, String payload) throws MalformedURLException,IOException {
		String res = null;

		SSLCertificate.execute();
		URL url = new URL(requestUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		StringBuffer jsonString = new StringBuffer();

		conn.setDoInput(true);
		conn.setDoOutput(true);
		System.setProperty("https.proxyHost","");
		System.setProperty("https.proxyPort",""); 
		conn.setConnectTimeout(150000);
		conn.setReadTimeout(150000);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
		writer.write(payload);
		writer.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		
		while ((line = br.readLine()) != null) {
			jsonString.append(line);
		}
		res = jsonString.toString(); 
		br.close();
		conn.disconnect();

		return res;
	}


}

