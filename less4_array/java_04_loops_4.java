package java_04_loops_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_04_loops_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input integer number :");
		int ch;
		int sum=0;
		while((ch =Integer.parseInt(br.readLine()))>=0){
			if(ch%2==0){
				sum+=ch;
			}
		}
		System.out.println("sum = "+sum);
	}

}
