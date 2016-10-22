package home_Work7;
import java.util.regex.*;


public class Task3 {

	public static void main(String[] args) {
		String text = "I have $1000.78 and you have $888.15";
		
		String pattern = "[$][0-9]+[.][0-9]{2}";
		
	
		
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = p.matcher(text);
		
		while (m.find()) {
	        System.out.print(text.substring(m.start(), m.end())+"\n");
	  }




	}

}
