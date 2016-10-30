package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

	static void baks (){
		for (;;){
			String pattern = "\\$[0-9]+\\.?[0-9]{0,2}";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter sentenct: ");
			String sent="";
			try {
				sent =  br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (sent.equals("end")){
				break;
			}
			
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(sent);
			while (m.find()) {
				  System.out.print(sent.substring(m.start(),m.end())+ " | ");
				}
			
		}
	}
	
	public static void main(String[] args) {
		baks();
		
	}

}
