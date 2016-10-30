package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Part1 {
	static String readString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter sentenct: ");
		String sent;
		try {
			sent = br.readLine();
		}
		catch (IOException e) {
			return "Input error";
		}
		return sent;
}	
	
	static String longest(String st){
		String[] words = st.split(" ");
		String longest = words[0];
		for (String word : words){
			if (word.length()>longest.length())
				longest = word;
		}
		return longest;
	}
	
	static String secondReverse (String st){
		String reverseWord = "";
		String[] words = st.split(" ");
		String[] second = words[1].split("");
		for (int a = second.length-1;a>=0;a--){
			reverseWord+=second[a];
		}
		
		return reverseWord;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sent = readString();
		String longestWord = longest(sent);
		System.out.println("Longest word: "+longestWord+" with "+longestWord.length()+" letters");
		System.out.println("Second reversed word: "+secondReverse(sent));
		
	}

}
