import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.*;

public class Test1 {
	public static void main(String[] args) {
		Student marko = new Student("marko", "markovic", 250);
		Student petar = new Student("petar", "petrovic", 21);
		Student marina = new Student("marina", "markovic", 259);
		
		JSONObject obj = new JSONObject();
		obj.put("ime", marko.getIme());
		obj.put("prezime", marko.getPrezime());
		obj.put("index", marko.getIndex());
		
		JSONObject obj1 = new JSONObject();
		obj1.put("ime", petar.getIme());
		obj1.put("prezime", petar.getPrezime());
		obj1.put("index", petar.getIndex());
		
		
		try {
			FileWriter fw = new FileWriter("studentiJson");
			fw.write(obj.toString() + "\n");
			fw.write(obj1.toString());
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
