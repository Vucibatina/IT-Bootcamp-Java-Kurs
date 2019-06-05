import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UpisJson {

	public static void main(String[] args) {
		
		JSONObject obj = new JSONObject();
		
		obj.put("ime", "marko");
		obj.put("prezime", "markovic");
		obj.put("brlk", "6787989");
		
		JSONArray serije = new JSONArray();
		serije.add("Srecni ljudi");
		serije.add("Porodicno blago");
		serije.add("Bolji zivot");
		
		obj.put("serije", serije);
		
		try {
			FileWriter fw = new FileWriter("podaci");
			fw.write(obj.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
