package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GetJSONObjs {

	public static void main(String[] args) throws JSONException {

		
		String s = "{\"result\":[{\"number\":\"REQ0011557\",\"status\":\"Review\",\"assignment_group\":\"\",\"employee_number\":\"929183\",\"opened_at\":\"2019-06-06 04:01:23\",\"sla_status\":\"false\",\"sla_time\":\"2 Days 11 Hours 59 Minutes\"},{\"number\":\"REQ0011090\",\"status\":\"Pending\",\"assignment_group\":\"\",\"employee_number\":\"929183\",\"opened_at\":\"2019-03-27 09:23:21\",\"sla_status\":\"false\"},{\"number\":\"REQ1824283\",\"status\":\"Closed Skipped\",\"assignment_group\":\"\",\"employee_number\":\"929183\",\"opened_at\":\"2019-03-15 11:15:33\",\"sla_status\":\"false\"}]}";
		
		JSONObject json = new JSONObject(s);
		
		JSONArray jsonArr = json.getJSONArray("result");
		
		for (int i=0; i < jsonArr.length();i++ ){
			JSONObject obj = jsonArr.getJSONObject(i);
			System.out.println(obj);
		}
		
		
		
		//String resultString = s.replace("]", "");
		//String result[] = resultString.split("\\["); 
		
		
		
		//System.out.println("result String = "+resultString);
		//System.out.println("result = "+result[1]);
		
		//result[1] = result[1].substring(0, result[1].length()-1);
		
		//String jObjects[] = result[1].split("\\},\\{");
		//System.out.println(jObjects[0]);
		//System.out.println(jObjects[1]);
		//System.out.println(jObjects[2]);
	}

}
