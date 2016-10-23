package less_String_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_1 {

	public static void main(String[] args) throws IOException {
		int lenght_str;
		int number=0;
		StringBuilder[] str =new StringBuilder[5];
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < str.length; i++) {
			str[i]=new StringBuilder(bufferedReader.readLine());
		}
		lenght_str=str[0].length();
		for (int i = 1; i < 5; i++) {
			if(lenght_str<str[i].length()){
				lenght_str=str[i].length();
				number=i;
			}
		}
		
		System.out.println("longest word in the sentence: "+ str[number].toString());
		System.out.println("number of its letters: "+lenght_str);
		System.out.println("second word in reverse: "+str[1].reverse());
		}
	}
