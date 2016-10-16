package Home_Work5.task2;

public class Test {

	public static void main(String[] args) {
			Employee [] array = new Employee[4];
			
			Employee temp = null;
			
			array[0] = new SalariedEmployee("001", "Vitalii", "111", 80, 150);
			array[1] = new SalariedEmployee("002", "Andrii", "112", 200, 130);
			array[2] = new ContractEmployee("003", "Vova", "101", 3500);
			array[3] = new ContractEmployee("004", "Oleg", "102", 4100);
			
		
			
		for(int i=0; i<array.length-1; i++){
				for(int j = i+1;j<array.length; j++){
					if(((Payable)array[j]).calculatePay()>((Payable)array[i]).calculatePay()){
						temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				}
			}
		
			
			for(int i=0; i<array.length; i++){
				System.out.println(array[i].toString());
			} 
	}

}
