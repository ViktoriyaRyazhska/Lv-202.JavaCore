package hw9;

import java.util.Scanner;

public class Read {
//	int start;
//	int end;



	public int readNumber(int start,int end) throws Exception {
		System.out.println("������  ����� � ������� �� 10 �� 20: ");
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
//		if (start >= 19 || end <= 40){
//		return sc.nextInt();
//		}
		if(start <= 19 || end >= 40) throw new Exception("Exeption((");
		return sc.nextInt();
		
		

	}
}
