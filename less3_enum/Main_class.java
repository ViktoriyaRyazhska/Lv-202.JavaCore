package less3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_class {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input 3 integer");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int c=Integer.parseInt(br.readLine());
		
		MaxMin maxmin = new MaxMin();
		System.out.println("max = "+maxmin.Max(a, b, c));
		System.out.println("min = "+maxmin.Min(a, b, c));
	}

}
