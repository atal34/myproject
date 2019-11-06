package adwsHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class SecureEnvoy {

	public  String validateSecureEnvoyToken(String sec_url,String samAccountName,String passcode,String token) throws MalformedURLException,IOException {
		
		
		String requestUrl = sec_url.concat(samAccountName).concat(passcode).concat(token);
		System.out.println(requestUrl);
		URL url = new URL(requestUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setReadTimeout(50000);
        conn.setConnectTimeout(50000);
        System.setProperty("https.proxyHost","proxy.cognizant.com");
        System.setProperty("https.proxyPort","6050"); 
        if (conn.getResponseCode() != 200) {
              throw new RuntimeException("Failed : HTTP error code : "
                          + conn.getResponseCode());
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(
              (conn.getInputStream())));

        String output;
        String res = "";
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
              System.out.println(output);
              res = res.concat(output);
        }
        System.out.println("response is "+res);
        conn.disconnect();
        return res;
  } 


	
}

