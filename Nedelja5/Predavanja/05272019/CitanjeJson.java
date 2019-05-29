import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CitanjeJson {

	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		
		try {
			FileReader fr = new FileReader("podaci");
			BufferedReader br= new BufferedReader(fr);
			String linija;
			
			linija= br.readLine();
			JSONParser parser = new JSONParser();
			obj = (JSONObject) parser.parse(linija);
			
			System.out.println(obj.get("ime"));

			System.out.println(obj.get("prezime"));
			
			
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
