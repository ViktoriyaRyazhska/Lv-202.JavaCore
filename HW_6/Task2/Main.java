public class Main {

	public static void main(String[] args) {
		Employee temp = null;
		Employee employee[] = new Employee[4];
		employee[0] = new SalariedEmployee("01", "Olya", 2055.3, "1");
		employee[1] = new SalariedEmployee("02", "Ira", 2500, "2");
		employee[2] = new ContractEmployee("03", "Vova", 150, 100, "3");
		employee[3] = new ContractEmployee("04", "Olena", 100, 48, "5");
		
		
		for(int i=0; i<employee.length-1; i++){
			for(int j = i+1;j<employee.length; j++){
				if(((calc)employee[j]).calculatePay()>((calc)employee[i]).calculatePay()){
					temp = employee[j];
					employee[j] = employee[i];
					employee[i] = temp;
				}
			}
		}
	
		
		for(int i=0; i<employee.length; i++){
			System.out.println(employee[i].toString());
		} 
	}
}