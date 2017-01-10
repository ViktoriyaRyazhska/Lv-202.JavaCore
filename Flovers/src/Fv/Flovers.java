package Fv;

import java.util.Scanner;

public class Flovers {

	public static void main(String[] args) {
		
		double Pi=3.14;
		double p,S;
		double R ;
		String name;
		String adress;
		double t1,t2,t3;
		double c=2;
		double T;
		double V;
		
		
//		System.out.println("Ввеіть R= ");
//		Scanner sc=new Scanner(System.in);
//		R=sc.nextDouble();
//		
//		p=2*Pi*R;
//		S=Pi*(R*R);
//		
//		System.out.println("Площа круга = "+ S);
//		System.out.println("Периметр круга = "+ p);
		
//		System.out.println("What is your name?");
//		Scanner SC=new Scanner(System.in);
//		name=SC.nextLine();
//		System.out.println("Where are you live?");
//		adress=SC.nextLine();
		
		
		Scanner C=new Scanner(System.in);
		System.out.println("Введіть час переговорів С1");
		t1=C.nextDouble();
		System.out.println("Цшна за переговори С1 = "+c*t1);
		
		System.out.println("Введіть час переговорів С2");
		t2=C.nextDouble();
		System.out.println("Цшна за переговори С2 = "+c*t2);
		
		System.out.println("Введіть час переговорів С3");
		t3=C.nextDouble();
		System.out.println("Цшна за переговори С3 = "+c*t3);
		
		T=t1+t2+t3;
		System.out.println("Загальний час розмов = "+ T);
		V=T*c;
		System.out.println("Загальна вартість = "+V);
		
		
	}

}
