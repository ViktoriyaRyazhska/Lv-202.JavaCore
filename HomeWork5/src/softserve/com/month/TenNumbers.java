package softserve.com.month;

public class TenNumbers {
	
	int [] enterTenNumbers(){
		System.out.println("Enter 10 integer numbers.");
		WrapperScanner scanner = WrapperScanner.getInstance();
		int[] tenNumbers = new int[10];
		for(int i = 0;i<tenNumbers.length;i++){
			tenNumbers [i]= scanner.getNextInt();
		}
		return  tenNumbers;
	}
	
	int sumOrProduct (int [] tenNumbers){
		if(checkPositiveNumber(tenNumbers)){
			return sumOfFirst5Elements(tenNumbers);
		}else{
			return productOfLast5Element(tenNumbers);
		}
	}
	
	boolean checkPositiveNumber(int [] tenNumbers){
		boolean isPositive = true;
		for(int i = 0;i<5;i++){
			if(tenNumbers[i]<0){
				isPositive = false;
				break;
			}
		}
		return isPositive;
	}
	
	int sumOfFirst5Elements (int [] tenNumbers){
		int sum =0;
		for(int i = 0;i<5;i++){
			sum+=tenNumbers[i];
		}
		return sum;
	}
	
	int productOfLast5Element (int [] tenNumbers){
		int product = 1;
		for (int i = tenNumbers.length-1; i > tenNumbers.length-6;i--){
			product*=tenNumbers[i];
		}
		return product;
	}
	
}
