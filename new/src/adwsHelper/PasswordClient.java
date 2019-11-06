package adwsHelper;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONException;
import org.json.JSONObject;



	public class PasswordClient {

		/**
		 * @param args
		 * @throws JSONException 
		 */
		
		public String passwordReset(String requestUrl, String payload) throws MalformedURLException,IOException {
			String res = null;
		    try {
		    	SSLCertificate.execute();
		        URL url = new URL(requestUrl);
		        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		        StringBuffer jsonString = new StringBuffer();
		        conn.setDoOutput(true);
		        //System.setProperty("https.protocols","TLSv1.2");
		        System.setProperty("https.proxyHost","");
				System.setProperty("https.proxyPort","");
		        conn.setConnectTimeout(1500000);
				conn.setReadTimeout(150000000);
				conn.setRequestMethod("POST");
				//conn.setRequestProperty("Content-Type", "application/json");
		        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		        OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
		        writer.write(payload);
		        writer.close();
		        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		        String line;
		        while ((line = br.readLine()) != null) {
		                jsonString.append(line);
		        }
		        System.out.println(jsonString.toString());
		        res = jsonString.toString(); 
		        br.close();
		        conn.disconnect();
		    } catch (Exception e) {
		            throw new RuntimeException(e.getMessage());
		    }
		    return res;
		}
		
		
		public String accountUnlock(String requestUrl, String payload) throws MalformedURLException,IOException {
			String res = null;
		    try {
		    	SSLCertificate.execute();
		        URL url = new URL(requestUrl);
		        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		        StringBuffer jsonString = new StringBuffer();
		        conn.setDoOutput(true);
		        //System.setProperty("https.protocols","TLSv1.2");
		        System.setProperty("https.proxyHost","");
				System.setProperty("https.proxyPort","");
		        conn.setConnectTimeout(1500000);
				conn.setReadTimeout(150000000);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");
		        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		        OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
		        writer.write(payload);
		        writer.close();
		        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		        String line;
		        while ((line = br.readLine()) != null) {
		                jsonString.append(line);
		        }
		        System.out.println(jsonString.toString());
		        res = jsonString.toString(); 
		        br.close();
		        conn.disconnect();
		    } catch (Exception e) {
		            throw new RuntimeException(e.getMessage());
		    }
		    return res;
		}
		
		// emp_Password() method generates 11 characters Password.
	      public  String generatePassword() 
	        { 
	        	String password = "";
	        	String upperCaseAplha = "ABCDEFGHIJKLMNOPQRSTUVWXY";
				String specialCharacters ="!.";
				String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
				password = RandomStringUtils.random(1,upperCaseAplha);
				password = password.concat(RandomStringUtils.random(1,specialCharacters));
				password = password.concat(RandomStringUtils.random(9,characters));
				//System.out.println("Generated password is = "+password);
				return password; 
			}

		}
			
			
				




