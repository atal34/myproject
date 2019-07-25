package json;

import java.util.Calendar;
import java.util.Date;

public class ExtractJSONObject {

	public static void main(String[] args) {

		
		String jsonString = "2019-03-15 06:28:05 - JAHNAVEE MEHTA (Work notes)\nTesting\n\n2019-03-13 09:32:33 - JAHNAVEE MEHTA (Work notes)\nHi Wyletta Grace, \n\nThank you for contacting the EOC. \nKindly submit a Active Directory Group Membership request in service now. \n\nPlease use this path to submit this request \nService Catalog > Security and Access > Windows Infrastructure Access > Active Directory Group Membership \n\nRegards, \nMahendran D\n\n2019-03-13 07:52:36 - Noor Hakeem Naina (Work notes)\nTesting going on\n\n";
		
		jsonString = "2018-09-18 12:05:25 - SyedRiyaz Begam (Work notes)\nxMatters - Terminated existing events for this Incident\nxMatters - Injected notification with xM event ID 69071074 for Assignment targeting #Dev-Store-DevOps\nxMatters - Injected notification with xM event ID 69073020 for FYI targeting ServiceNow_FYI\n\n2018-09-18 12:04:20 - SyedRiyaz Begam (Work notes)\nxMatters - Terminated existing events for this Incident\n\n2018-09-18 12:03:49 - System (Work notes)\nThis incident was not responded to within 30 minutes. Reassigning to EOC Corporate Service Desk\n\n2018-09-18 12:03:49 - System (Work notes)\nxMatters - Terminated existing events for this Incident\nxMatters - Injected notification with xM event ID 69002990 for Assignment targeting EOC Corporate Service Desk\n\n2018-09-18 11:33:42 - Noor Hakeem Naina (Work notes)\nTeam\r\nwe are getting these page able incidents continuously\r\nPlease checkk\n\n2018-09-18 11:33:42 - Noor Hakeem Naina (Work notes)\nxMatters - Injected notification with xM event ID 68999968 for FYI targeting ServiceNow_FYI\n\n2018-09-17 09:24:30 - SalmaanNisar Sharief (Work notes)\nxMatters - Terminated existing events for this Incident\nxMatters - Injected notification with xM event ID 68924719 for Assignment targeting #Dev-Store-DevOps\n\n2018-09-17 09:24:26 - SalmaanNisar Sharief (Work notes)\nHi Team, \nPlease find the posted Alert configurations below.\nKindly review the Alert configurations.\nAssigning the incident to Store-DevOps Team.\n\n2018-09-17 09:05:25 - SalmaanNisar Sharief (Work notes)\nkohls_prod_stores_poc_auto_failover_Stores_Alert_summary\naction.email.useNSSubject = 1\naction.summary_index = 1\naction.splunk_to_servicenow = 1\naction.summary_index._name = kohls_prod_splunk_application_summary\nalert.digest_mode = True\nalert.expires = 10s\nalert.suppress = 0\nalert.track = 0\nauto_summarize.dispatch.earliest_time = -1d@h\ncron_schedule =2-47/15 * * * *\ndescription = POC Offline Mode - Auto Failover\ndispatch.earliest_time = -30m@m\ndispatch.latest_time = @m\nenableSched = 1\nrealtime_schedule = 0\nsearch =index=kohls_prod_stores_health_poc_summary kpi_type=\"POC Offline Mode - Auto Failover\" health=Red \\\n|stats latest(health) as health latest(_time) as _time by store |rename store as Stores\\\n| join type=left Stores\\\n     search index=kohls_prod_tools_snow dv_description=\"*One or more stores down for POC Offline Mode - Auto Failover*\"  earliest=-7d \\\n    | rex field=dv_description \": ID (?<ID>\\d\\s+)\" \\\n    | stats latest(dv_incident_state) as LATEST_ID by ID \\\n    | search LATEST_ID!=\"Resolved\" AND LATEST_ID!=\"Closed\" \\\n    | stats values(ID) as ID\\\n    | nomv ID\\\n    | eval ID=replace(ID,\"\\s\",\" \")\\\n    | makemv ID delim=\" \"\\\n    | mvexpand ID\\\n    | table ID\\\n    | rename ID as Stores\\\n    | eval Include=\"No\"\\\n| table Stores Include\\\n| fillnull value=\"Yes\" Include\\\n| search Include=\"Yes\"\\\n| stats values(Stores) as difference,count(Stores) as storesCount\\\n| where storesCount > 0\\\n| nomv difference \\\n| eval ID=difference \\\n| eval Metric_Category=\"Application\" \\\n| eval Value=\"POC Offline Mode - Auto Failover\" \\\n| eval Metric=\"Health\" \\\n| eval Metric_Type=\"Error\" \\\n| eval Application=\"POC\" \\\n| eval Description= \"(SHHD-POC) One or more stores down for POC Offline Mode - Auto Failover\" \\\n| eval Alert_Type=\"Critical\" \\\n| eval Alert=\"Yes\" \\\n| eval Search_name=\"kohls_prod_stores_poc_auto_failover_Stores_Alert_summary\" \\\n| eval Service-Now_Assignment_Group=\"INSTORE - SD\" \\\n| eval Assignment_Group=\"INSTORE - SD\" \\\n| eval _time=now() \\\n| eval Frequency=\"15 Minutes\" \\\n| eval Violation=\"1\" \\\n| eval Item=\"NA\" \\\n| eval Instance=\"NA\" \\\n| eval Vendor_Ticket=\"NA\" \\\n| eval Vendor=\"NA\" \\\n| eval Knowledge_Article=\"NA\" \\\n| eval Business_Service=\"NA\" \\\n| eval Urgency=if(storesCount>5,\"1\",\"2\") \\\n| eval Impact=\"4\" \\\n| eval Node=\"NA\" \\\n| eval RequestTask_Number=\"NA\" \\\n| eval Location=ID \\\n| eval Key=ID \\\n| table _time Metric_Category Metric Metric_Type Application Key ID Description Frequency Value Alert_Type Alert Violation Item Instance Assignment_Group Vendor_Ticket Vendor Business_Service Knowledge_Article Urgency Impact Location Node RequestTask_Number Search_name\n\n2018-09-17 08:58:46 - xMatters Integration (Work notes)\nxMatters - Allowing xMatters to terminate existing events for this Incident\n\n2018-09-17 08:58:46 - xMatters Integration (Work notes)\nxMatters - Received Response Own by TKMAHGZ(Personal Voice Mobile 2) at 18-09-17 13:58:46.332 null\n\n2018-09-17 08:54:30 - xMatters Integration (Work notes)\nxMatters - Received Response Ignore by TKMADJC(Home Phone 1) at 18-09-17 13:54:29.870 null\n\n2018-09-17 08:53:22 - Naveed Mohammed Nawab (Work notes)\nxMatters - Injected notification with xM event ID 68925623 for Assignment targeting Operational Intelligence Platform\nxMatters - Injected notification with xM event ID 68923748 for FYI targeting ServiceNow_FYI\n\n";
		
		String currentYear[] = jsonString.split("-");
		
		String parts[] = jsonString.split(currentYear[0]);
		String finalyear = currentYear[0].concat(parts[1]);
		System.out.println(finalyear);
		
	}

}