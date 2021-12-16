package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONException;
import org.json.JSONObject;


public class EmailChecker 
{
	//This is trail api you can use api for check your email exist or not in any domain you want to get a better experience for that you can buy a plan
	private final String apikey="7410a431b00a6aeb3ac193b5440bd9ac";
	 
	   
	  @SuppressWarnings("unused")
	public void checkEmail(String email) throws Exception 
	  {
        //Rest Api
		   String url = "http://apilayer.net/api/check?access_key="+apikey+"&email="+email+"&smtp=1&format=1";
		   
		   URL urlobj = new URL(url);
		   
		   HttpURLConnection con = (HttpURLConnection) urlobj.openConnection();
	
		   // optional default is GET
		   con.setRequestMethod("GET");
	
		   //add request header
		   con.setRequestProperty("User-Agent", "Mozilla/17.0");
	
		   
		   BufferedReader in = new BufferedReader(
		           new InputStreamReader(con.getInputStream()));
		   String inputLine;
		  
	
		   while ((inputLine = in.readLine()) != null) 
		   {
			   System.out.println(inputLine);
			   JSONObject j = new JSONObject(inputLine);
			   
			   if(j.getString("smtp_check")=="true") {
				   System.out.println("accounts are already taken");
				   Scanner myObj = new Scanner(System.in);

				    System.out.println("Enter Password:");

				    // String input
				    String password = myObj.nextLine();
				    
				    System.out.println("You signup with this "+password);
			   }
			   else {
				   System.out.println("We didn't have this email");
			   }
		   }
		   in.close();
	
		   //print result
		   
	  }

//Suggestions of any user name
	public void suggest(String user) throws Exception {
		// TODO Auto-generated method stub
		 //ALL Domains
		  	String[] domains = {"gmail.com",
		  			"yahoo.com",
		  			"aol.com",
		  			"hotmail.co.uk",
		  			"hotmail.fr",
		  			"yahoo.fr",
		  			"wanadoo.fr",
		  			"orange.fr",
		  			"comcast.net",
		  			"yahoo.co.uk",
		  			"yahoo.com.br",
		  			"yahoo.co.in",
		  			"live.com",
		  			"rediffmail.com",
		  			"free.fr",
		  			"gmx.de",
		  			"web.de",
		  			"yandex.ru",
		  			"ymail.com",
		  			"libero.it",
		  			"outlook.com",
		  			"uol.com.br",
		  			"bol.com.br",
		  			"mail.ru",
		  			"cox.net",
		  			"hotmail.it",
		  			"sbcglobal.net",
		  			"sfr.fr",
		  			"live.fr",
		  			"verizon.net",
		  			"live.co.uk",
		  			"googlemail.com",
		  			"yahoo.es",
		  			"ig.com.br",
		  			"live.nl",
		  			"bigpond.com",
		  			"terra.com.br",
		  			"yahoo.it",
		  			"neuf.fr",
		  			"yahoo.de",
		  			"alice.it",
		  			"rocketmail.com",
		  			"att.net",
		  			"laposte.net",
		  			"facebook.com",
		  			"bellsouth.net",
		  			"yahoo.in",
		  			"hotmail.es",
		  			"charter.net",
		  			"yahoo.ca",
		  			"yahoo.com.au",
		  			"rambler.ru",
		  			"hotmail.de",
		  			"tiscali.it",
		  			"shaw.ca",
		  			"yahoo.co.jp",
		  			"sky.com",
		  			"earthlink.net",
		  			"optonline.net",
		  			"freenet.de",
		  			"t-online.de",
		  			"aliceadsl.fr",
		  			"virgilio.it",
		  			"home.nl",
		  			"qq.com",
		  			"telenet.be",
		  			"me.com",
		  			"yahoo.com.ar",
		  			"tiscali.co.uk",
		  			"yahoo.com.mx",
		  			"voila.fr",
		  			"gmx.net",
		  			"mail.com",
		  			"planet.nl",
		  			"tin.it",
		  			"live.it",
		  			"ntlworld.com",
		  			"arcor.de",
		  			"yahoo.co.id",
		  			"frontiernet.net",
		  			"hetnet.nl",
		  			"live.com.au",
		  			"yahoo.com.sg",
		  			"zonnet.nl",
		  			"club-internet.fr",
		  			"juno.com",
		  			"optusnet.com.au",
		  			"blueyonder.co.uk",
		  			"bluewin.ch",
		  			"skynet.be",
		  			"sympatico.ca",
		  			"windstream.net",
		  			"mac.com",
		  			"centurytel.net",
		  			"chello.nl",
		  			"live.ca",
		  			"aim.com",
		  			"bigpond.net.au"};
		  	 String aemail = null ;	
		  				   for (int i=0; i<domains.length;i++ ) {
		  				  aemail = user+"@"+domains[i];
		  				  
		  				  	// This Is rest api
		  				  String url1 = "http://apilayer.net/api/check?access_key="+apikey+"&email="+aemail+"&smtp=1&format=1";
		  				   
		  				   URL urlobj1 = new URL(url1);
		  				   
		  				   HttpURLConnection con1 = (HttpURLConnection) urlobj1.openConnection();
		  			
		  				   // optional default is GET
		  				   con1.setRequestMethod("GET");
		  			
		  				   //add request header
		  				   con1.setRequestProperty("User-Agent", "Mozilla/17.0");
		  			
		  				   
		  				   BufferedReader in1 = new BufferedReader(
		  				           new InputStreamReader(con1.getInputStream()));
		  				   String inputLine1;
		  				   
		  				   while((inputLine1 = in1.readLine()) != null) {
		  					//System.out.println(inputLine1);
		  				   JSONObject j1 = new JSONObject(inputLine1);
		  					if(j1.getString("smtp_check")=="false") {
		  						
		  						//Suggestions
		  						System.out.println(j1.getString("email"));
		  						
		  						// after enter your password for any mail
		  						Scanner myObj1 = new Scanner(System.in);

		  					    System.out.println("Enter Password:");

		  					    // String input
		  					    String password1 = myObj1.nextLine();
		  					    
		  					    System.out.println(j1.getString("email")+ "is connect with password:"+password1);
		  					    
		  					}
		  					else if(j1.getString("smtp_check")=="true")  {
		  						//already exist
		  						System.err.println(j1.getString("email"));
		  						
		  						
		  						
		  					}
		  				   }
		  				   }
	}

//Email verification and If you have user name  it can change in to Suggestion
	public void change() throws Exception {
		
		 Scanner myObj = new Scanner(System.in);

		    System.out.println("Enter Email/UserName:");

		    // String input
		    String x = myObj.nextLine();
		    
		    if(x.contains("@")) {
		    	checkEmail(x);
		    }
		    else {
		    	suggest(x);
		    }
		// TODO Auto-generated method stub
		
	}

}
