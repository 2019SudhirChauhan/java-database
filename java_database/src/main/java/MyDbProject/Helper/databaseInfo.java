package MyDbProject.Helper;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class databaseInfo {
	String URL;
	String username;
	String pass;
	
	public databaseInfo() {
		System.out.println("Database Info Fetching :-) ...");
		
		JSONParser parser = new JSONParser();
		 
        try {
 
            Object obj = parser.parse(new FileReader(
                    "C:\\Users\\Sudhir_Karna\\git\\java-database\\java_database\\src\\main\\java\\Data\\DBInfo.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
            
            this.setURL((String) jsonObject.get("URL"));
            this.setUsername((String) jsonObject.get("USERNAME"));
            this.setPass((String) jsonObject.get("PASS"));

 
        } catch (Exception e) {
            e.printStackTrace();
        }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
