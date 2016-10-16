package less_Inheritance_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee_main {
	
	public static void rozdil(){
		System.out.println("_______________________________________________________________________");
	}
	
	public static void employees(Employee[] emp){
		 for (int i = 0; i < emp.length; i++) {
				System.out.println(emp[i]);
			}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee [] emp = new Employee[4];
		 emp[0]=new SalariedEmployee("sasha", "asd123", 0);
		 emp[1]=new ContractEmployee("olga", "sda321", 0);
		 emp[2]=new SalariedEmployee("valja", "123rt", 0);
		 emp[3]=new ContractEmployee("sem", "56sd", 0);
		
		 employees(emp);
		 
		 for (int i = 0; i < emp.length; i++) {
			if(emp[i]instanceof SalariedEmployee){
			System.out.println("input price hour for " +emp[i].getName());
			((SalariedEmployee)emp[i]).setPrice_hour(Integer.parseInt(br.readLine()));
			System.out.println("input work hour for " +emp[i].getName());
			((SalariedEmployee)emp[i]).setWork_hour(Integer.parseInt(br.readLine()));
			((SalariedEmployee)emp[i]).setAverage_monthly_salary(((SalariedEmployee)emp[i]).calculatePay());
		}	else{
			System.out.println("input month salary for " +emp[i].getName());
			((ContractEmployee)emp[i]).setFixed_monthly_salary(Integer.parseInt(br.readLine()));
			((ContractEmployee)emp[i]).setAverage_monthly_salary(((ContractEmployee)emp[i]).calculatePay());
			}}
		 
		rozdil();
		employees(emp);
		int [] mas = new int[4];
		for (int i = 0; i < emp.length; i++) {
			if (emp[i] instanceof SalariedEmployee)
				mas[i]=((SalariedEmployee)emp[i]).getAverage_monthly_salary();
			else mas[i]=((ContractEmployee)emp[i]).getAverage_monthly_salary();
		}
		rozdil();
		System.out.println();
		int tmp=mas[0];	
		for (int i = 0; i < mas.length-1; i++) {
			for (int j = i+1; j < mas.length; j++) {
				if (mas[i]<mas[j]){
					tmp=mas[i];
					mas[i]=mas[j];
					mas[j]=tmp;
						}
		}
		}
		int zap;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < emp.length; j++) {
			 if(emp[j]instanceof SalariedEmployee){
				zap= ((SalariedEmployee)emp[j]).getAverage_monthly_salary();
			 }else zap=((ContractEmployee)emp[j]).getAverage_monthly_salary();
			 if(zap==mas[i]){
				 System.out.println(emp[j]);
			 }
			
		}
	
}
		}
	}
