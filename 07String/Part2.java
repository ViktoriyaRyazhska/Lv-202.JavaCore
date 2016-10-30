package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part2 {
	
	static String readString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter sentenct: ");
		String sent=  br.readLine();
		
		String [] words = sent.split("");
		String res = "";
		String last = words[0];
		for (int a = 0;a<words.length;a++){
			
			if (words[a].equals(" ") && last.equals(" ")){
				last = words[a];
					continue;
			}
			last = words[a];
			res+=words[a];
			
			
		}
		return res;
}	
	
	
	public static void main(String[] args) throws IOException {
		System.out.println(readString());
		
	}

}
