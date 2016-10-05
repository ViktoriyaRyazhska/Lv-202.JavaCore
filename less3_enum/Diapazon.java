package less3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diapazon {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input ch1");
		float ch1=Float.parseFloat(br.readLine());
		System.out.println("input ch2");
		float ch2=Float.parseFloat(br.readLine());
		System.out.println("input ch3");
		float ch3=Float.parseFloat(br.readLine());
			if (ch1>=-5&&ch1<=5) {
				System.out.println(ch1+" is diapazon -5  5");
			}else {
				System.out.println(ch1+" is not diapazon -5  5");
			}
			if (ch2>=-5&&ch2<=5) {
				System.out.println(ch2+" is diapazon -5  5");
			}else {
				System.out.println(ch2+" is not diapazon -5  5");
			}
			if (ch3>=-5&&ch3<=5) {
				System.out.println(ch3+" is diapazon -5  5");
			}else {
				System.out.println(ch3+" is not diapazon -5  5");
			}
		}

}
