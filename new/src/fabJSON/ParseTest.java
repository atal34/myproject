package fabJSON;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ParseTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		
		//String s = "{ \"applicationArea\": { \"correlationId\": \"B41da1b5abb4e644dea3c83f56d947d040\", \"countryOfOrigin\": \"SA\", \"creationDateTime\": \"13Feb2019 16:30:10\", \"requiredExecutionDate\": \"13Feb2019 16:30:10\", \"senderId\": \"RIB\", \"transactionDateTime\": \"2019-02-13T16:30:10.010Z\", \"transactionId\": \"B41da1b5abb4e644dea3c83f56d947d040\", \"language\": \"EN\" }, \"responseStatus\": { \"status\": \"SUCCESS\", \"metaData\": { \"dateFormat\": \"ddMMyyyy\" } }, \"dataArea\": { \"accountIdentifier\": \"3341807000500107\", \"openingBalanceAmount\": 0E+0, \"openingBalanceCurrency\": \"SAR\", \"closingBalanceAmount\": 5.0411E+2, \"closingBalanceCurrency\": \"SAR\", \"postingEntries\": [{ \"postedAmount\": 9E+0, \"valueDate\": \"13022019\", \"customerReference\": \"22223151\", \"transactionReference\": \"FT1904408XZ0\", \"postingDate\": \"13022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": null, \"beneficiaryCustomer\": null, \"transactionCode\": \"263\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Transfer-WPSMON0001\", \"balanceAmountBeforeTransaction\": 4.9511E+2, \"balanceAmountAfterTransaction\": 5.0411E+2 }, { \"postedAmount\": 1.75E+2, \"valueDate\": \"13022019\", \"customerReference\": null, \"transactionReference\": \"FT19044X5ZYZ\", \"postingDate\": \"13022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"846\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Online SI Transfer-7000500\", \"balanceAmountBeforeTransaction\": 3.2011E+2, \"balanceAmountAfterTransaction\": 4.9511E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"13022019\", \"customerReference\": null, \"transactionReference\": \"FT1904459ZZ6\", \"postingDate\": \"13022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 4.4011E+2, \"balanceAmountAfterTransaction\": 3.2011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"12022019\", \"customerReference\": null, \"transactionReference\": \"FT1904308805\", \"postingDate\": \"12022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 5.6011E+2, \"balanceAmountAfterTransaction\": 4.4011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"11022019\", \"customerReference\": null, \"transactionReference\": \"FT190429Z50X\", \"postingDate\": \"11022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 6.8011E+2, \"balanceAmountAfterTransaction\": 5.6011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"10022019\", \"customerReference\": null, \"transactionReference\": \"FT190410SW90\", \"postingDate\": \"10022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 8.0011E+2, \"balanceAmountAfterTransaction\": 6.8011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"09022019\", \"customerReference\": null, \"transactionReference\": \"FT19040Y5Y7S\", \"postingDate\": \"09022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 9.2011E+2, \"balanceAmountAfterTransaction\": 8.0011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"09022019\", \"customerReference\": null, \"transactionReference\": \"FT190400S5Z9\", \"postingDate\": \"09022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.04011E+3, \"balanceAmountAfterTransaction\": 9.2011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"07022019\", \"customerReference\": null, \"transactionReference\": \"FT19038Y460Z\", \"postingDate\": \"07022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.16011E+3, \"balanceAmountAfterTransaction\": 1.04011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"06022019\", \"customerReference\": null, \"transactionReference\": \"FT19037479XZ\", \"postingDate\": \"06022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.28011E+3, \"balanceAmountAfterTransaction\": 1.16011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"05022019\", \"customerReference\": null, \"transactionReference\": \"FT190366WX8Z\", \"postingDate\": \"05022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.40011E+3, \"balanceAmountAfterTransaction\": 1.28011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"04022019\", \"customerReference\": null, \"transactionReference\": \"FT1903547098\", \"postingDate\": \"04022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.52011E+3, \"balanceAmountAfterTransaction\": 1.40011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"03022019\", \"customerReference\": null, \"transactionReference\": \"FT19034ZZ7YX\", \"postingDate\": \"03022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.64011E+3, \"balanceAmountAfterTransaction\": 1.52011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"02022019\", \"customerReference\": null, \"transactionReference\": \"FT1903346XW8\", \"postingDate\": \"02022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.76011E+3, \"balanceAmountAfterTransaction\": 1.64011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"02022019\", \"customerReference\": null, \"transactionReference\": \"FT1903300X5Z\", \"postingDate\": \"02022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.88011E+3, \"balanceAmountAfterTransaction\": 1.76011E+3 }, { \"postedAmount\": 1.1E-1, \"valueDate\": \"01022019\", \"customerReference\": null, \"transactionReference\": \"3341807000500107-201\", \"postingDate\": \"31012019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": null, \"beneficiaryCustomer\": null, \"transactionCode\": \"381\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Credit Profit-\", \"balanceAmountBeforeTransaction\": 1.88E+3, \"balanceAmountAfterTransaction\": 1.88011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"31012019\", \"customerReference\": null, \"transactionReference\": \"FT190317S570\", \"postingDate\": \"31012019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 2E+3, \"balanceAmountAfterTransaction\": 1.88E+3 }, { \"postedAmount\": 2E+3, \"valueDate\": \"30012019\", \"customerReference\": \"NTB\", \"transactionReference\": \"FT19030ZWS80\", \"postingDate\": \"30012019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": null, \"beneficiaryCustomer\": null, \"transactionCode\": \"263\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Transfer-NTB\", \"balanceAmountBeforeTransaction\": 0E+0, \"balanceAmountAfterTransaction\": 2E+3 }] } }";
		
		
		String jSonstring = "{ \"applicationArea\": { \"correlationId\": \"B41da1b5abb4e644dea3c83f56d947d040\", \"countryOfOrigin\": \"SA\", \"creationDateTime\": \"13Feb2019 16:30:10\", \"requiredExecutionDate\": \"13Feb2019 16:30:10\", \"senderId\": \"RIB\", \"transactionDateTime\": \"2019-02-13T16:30:10.010Z\", \"transactionId\": \"B41da1b5abb4e644dea3c83f56d947d040\", \"language\": \"EN\" }, \"responseStatus\": { \"status\": \"SUCCESS\", \"metaData\": { \"dateFormat\": \"ddMMyyyy\" } }, \"dataArea\": { \"accountIdentifier\": \"3341807000500107\", \"openingBalanceAmount\": 0E+0, \"openingBalanceCurrency\": \"SAR\", \"closingBalanceAmount\": 5.0411E+2, \"closingBalanceCurrency\": \"SAR\", \"postingEntries\": [{ \"postedAmount\": 9E+0, \"valueDate\": \"13022019\", \"customerReference\": \"22223151\", \"transactionReference\": \"FT1904408XZ0\", \"postingDate\": \"13022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": null, \"beneficiaryCustomer\": null, \"transactionCode\": \"263\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Transfer-WPSMON0001\", \"balanceAmountBeforeTransaction\": 4.9511E+2, \"balanceAmountAfterTransaction\": 5.0411E+2 }, { \"postedAmount\": 1.75E+2, \"valueDate\": \"13022019\", \"customerReference\": null, \"transactionReference\": \"FT19044X5ZYZ\", \"postingDate\": \"13022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"846\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Online SI Transfer-7000500\", \"balanceAmountBeforeTransaction\": 3.2011E+2, \"balanceAmountAfterTransaction\": 4.9511E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"13022019\", \"customerReference\": null, \"transactionReference\": \"FT1904459ZZ6\", \"postingDate\": \"13022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 4.4011E+2, \"balanceAmountAfterTransaction\": 3.2011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"12022019\", \"customerReference\": null, \"transactionReference\": \"FT1904308805\", \"postingDate\": \"12022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 5.6011E+2, \"balanceAmountAfterTransaction\": 4.4011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"11022019\", \"customerReference\": null, \"transactionReference\": \"FT190429Z50X\", \"postingDate\": \"11022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 6.8011E+2, \"balanceAmountAfterTransaction\": 5.6011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"10022019\", \"customerReference\": null, \"transactionReference\": \"FT190410SW90\", \"postingDate\": \"10022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 8.0011E+2, \"balanceAmountAfterTransaction\": 6.8011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"09022019\", \"customerReference\": null, \"transactionReference\": \"FT19040Y5Y7S\", \"postingDate\": \"09022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 9.2011E+2, \"balanceAmountAfterTransaction\": 8.0011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"09022019\", \"customerReference\": null, \"transactionReference\": \"FT190400S5Z9\", \"postingDate\": \"09022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.04011E+3, \"balanceAmountAfterTransaction\": 9.2011E+2 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"07022019\", \"customerReference\": null, \"transactionReference\": \"FT19038Y460Z\", \"postingDate\": \"07022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.16011E+3, \"balanceAmountAfterTransaction\": 1.04011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"06022019\", \"customerReference\": null, \"transactionReference\": \"FT19037479XZ\", \"postingDate\": \"06022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.28011E+3, \"balanceAmountAfterTransaction\": 1.16011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"05022019\", \"customerReference\": null, \"transactionReference\": \"FT190366WX8Z\", \"postingDate\": \"05022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.40011E+3, \"balanceAmountAfterTransaction\": 1.28011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"04022019\", \"customerReference\": null, \"transactionReference\": \"FT1903547098\", \"postingDate\": \"04022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.52011E+3, \"balanceAmountAfterTransaction\": 1.40011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"03022019\", \"customerReference\": null, \"transactionReference\": \"FT19034ZZ7YX\", \"postingDate\": \"03022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.64011E+3, \"balanceAmountAfterTransaction\": 1.52011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"02022019\", \"customerReference\": null, \"transactionReference\": \"FT1903346XW8\", \"postingDate\": \"02022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.76011E+3, \"balanceAmountAfterTransaction\": 1.64011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"02022019\", \"customerReference\": null, \"transactionReference\": \"FT1903300X5Z\", \"postingDate\": \"02022019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 1.88011E+3, \"balanceAmountAfterTransaction\": 1.76011E+3 }, { \"postedAmount\": 1.1E-1, \"valueDate\": \"01022019\", \"customerReference\": null, \"transactionReference\": \"3341807000500107-201\", \"postingDate\": \"31012019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": null, \"beneficiaryCustomer\": null, \"transactionCode\": \"381\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Credit Profit-\", \"balanceAmountBeforeTransaction\": 1.88E+3, \"balanceAmountAfterTransaction\": 1.88011E+3 }, { \"postedAmount\": 1.2E+2, \"valueDate\": \"31012019\", \"customerReference\": null, \"transactionReference\": \"FT190317S570\", \"postingDate\": \"31012019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": \"7000500\", \"beneficiaryCustomer\": null, \"transactionCode\": \"845\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Debit\", \"transactionDesc\": \"Online SI Transfer-\", \"balanceAmountBeforeTransaction\": 2E+3, \"balanceAmountAfterTransaction\": 1.88E+3 }, { \"postedAmount\": 2E+3, \"valueDate\": \"30012019\", \"customerReference\": \"NTB\", \"transactionReference\": \"FT19030ZWS80\", \"postingDate\": \"30012019\", \"transactionCurrency\": \"SAR\", \"showFT\": \"N\", \"orderingCustomer\": null, \"beneficiaryCustomer\": null, \"transactionCode\": \"263\", \"exchangeRateToOriginalCurrency\": \"0.0\", \"transactionType\": \"Credit\", \"transactionDesc\": \"Transfer-NTB\", \"balanceAmountBeforeTransaction\": 0E+0, \"balanceAmountAfterTransaction\": 2E+3 }] } }";
		//jSonstring = jSonstring.replaceAll("/\\", "");
		
		System.out.println(jSonstring.charAt(129));
		
		ObjectMapper objectMapper = new ObjectMapper();

		String carJson =
		    "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		AccountTranHistory accHistory = new AccountTranHistory();
		
		//Car car = objectMapper.readValue(carJson, Car.class);
		accHistory = objectMapper.readValue(jSonstring, AccountTranHistory.class);
		
		System.out.println("Object = "+accHistory);
		System.out.println(accHistory.getApplicationArea().getSenderId());
				
	}
	
}