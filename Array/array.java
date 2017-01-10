package Array;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
	int month_days[ ]  = {31, 28, 31, 30, 31, 30, 
			31, 31, 30, 31, 30, 31} ;

//	for(int i=0;i<month_days.length;i++){
//		int a=month_days[i];
//	}
//	System.out.println("Введіть номер місяць де 0-Січень,11-грудень");
//	Scanner sc=new Scanner (System.in);
//	int a=sc.nextInt();
//	System.out.println("Кількість днів=" +a );
	Scanner sc= new Scanner(System.in);
	int sum=0;
	int n;
	for (int i = 0; i < month_days.length; i++) {
		System.out.println("Inpun number month ");
		n=Integer.parseInt(sc.nextLine());
		if(n<0){
			n=i;
			continue;
			
		}
		sum+=n;
	}
	System.out.println(sum);
	sc.close();
	}

	
	
}
