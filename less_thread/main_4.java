package thread_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main_4 {

	public static void main(String[] args) throws IOException {
		
		String fileName_dani = "file1.txt";
		String fileName_zapus="file2.txt";
		BufferedWriter bw =  new BufferedWriter(new FileWriter(fileName_zapus));
		BufferedReader br = new BufferedReader(new FileReader(fileName_dani));
	
		int count =0;
		int i =0;
		ArrayList<String>arrayList = new ArrayList<>();
		
		String str=null;
		while ((str=br.readLine())!=null) {
			++count;
			i++;
			arrayList.add(str);
		}	
		
		int max=arrayList.get(0).length();
		int index=0;
		for (int j = 1; j < arrayList.size(); j++) {
			if(max<arrayList.get(j).length()){
				max=arrayList.get(j).length();
				index=j;
			}
		}
		
		String name = null;
		Pattern pattern = Pattern.compile("andrii hrynus");
		for (int j = 0; j < arrayList.size(); j++) {
			Matcher matcher = pattern.matcher(arrayList.get(j));
			if(matcher.matches()){
			name=arrayList.get(j);	
			}
		}
	
		bw.write("number of lines in file1: " +count+"	|||"+"the longest line: " +arrayList.get(index)
				+ " your name and birthday date: "+ name);
		bw.close();
	}

}
