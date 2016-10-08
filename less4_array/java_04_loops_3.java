package java_04_loops_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_04_loops_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int [] number= new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input 5 integer number:");
		for (int i = 0; i < number.length; i++) {
			number[i]=Integer.parseInt(br.readLine());
		}
		int min=number[0];
		int position_min=0;
		for (int i = 1; i < number.length; i++) {
			if (min>number[i]){
				min=number[i];
				position_min=i+1;
			}
		}
		System.out.println("min "+min+" position "+ position_min);
		
		int position_positiv=0;
		int kil=0;
		for (int i = 0; i < number.length; i++) {
			if(number[i]>0){
				kil++;
				position_positiv=i+1;
			}
			if(kil==2){
				System.out.println("second positive is position "+position_positiv);
			}
		}
	}

}
