package HomeT1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kolo {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

			System.out.println("Enter radius, please");
			int r = Integer.parseInt(br.readLine());
			double p = 2*Math.PI*r;
			double a = Math.PI*Math.pow(r, 2);
            System.out.println("Perimetr is "+ Math.round(p*100)/100.0);
            System.out.println("Area is " + Math.round(a*100)/100.0);
            
	}

}
