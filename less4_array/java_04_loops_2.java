package java_04_loops_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_04_loops_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int []mas = new int[10];
		int sum =0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input 10 integer number");
		for (int i = 0; i < mas.length; i++) {
			mas[i]=Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < 5; i++) {
			if (mas[i]>=0){
				sum+=mas[i];
			}
			else{
				sum=0;
				for (int j = 5; j < mas.length; j++) {
				sum+=mas[j];				
				}
				break;
			}
		}
		System.out.println("sum= "+sum);
	}

}
