import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Call {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		
		System.out.println("How much does call from c1 cost?");
		double c1 = Double.parseDouble(br.readLine());
		System.out.println("How long?");
		double t1 = Double.parseDouble(br.readLine());
		
		System.out.println("How much does call from c2 cost?");
		double c2 = Double.parseDouble(br.readLine());
		System.out.println("How long?");
		double t2 = Double.parseDouble(br.readLine());
		
		System.out.println("How much does call from c3 cost?");
		double c3 = Double.parseDouble(br.readLine());
		System.out.println("How long?");
		double t3 = Double.parseDouble(br.readLine());
		
		double m1 = c1*t1;
		double m2 = c2*t2;
		double m3 = c3*t3;
		double all = m1+m2+m3; 
		
		System.out.println("Call from c1 costs " + m1);
		System.out.println("Call from c2 costs " + m2);
		System.out.println("Call from c3 costs " + m3);
		System.out.println("All talk together cost " + all );
		
	}
	
}
