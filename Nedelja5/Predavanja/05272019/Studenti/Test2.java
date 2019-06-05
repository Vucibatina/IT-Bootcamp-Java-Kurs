import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test2 {
	
	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		JSONObject obj;
		String line= null;
		
		try {
			FileReader fr = new FileReader("studentiJson");
			BufferedReader br= new BufferedReader(fr);
			line = br.readLine();
			while (line != null) {
				obj = (JSONObject) parser.parse(line);
				System.out.println(obj.get("ime"));
				System.out.println(obj.get("prezime"));
				System.out.println(obj.get("index"));
				
			
				line= br.readLine();
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
