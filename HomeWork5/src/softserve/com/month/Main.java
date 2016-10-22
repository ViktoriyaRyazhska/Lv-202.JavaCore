package softserve.com.month;

public class Main {
	public static void main(String[] args) {
		
		TenNumbers num = new TenNumbers();
		FiveNumbers numbers = new FiveNumbers();
		Month month = new Month();
		
		System.out.println(month.getMonth());
		
		System.out.println(getProductOfAllEnteredEvenNumbers());
		numbers.print(numbers.enterFiveNumbers());
		System.out.println(num.sumOrProduct(num.enterTenNumbers()));
	}

	public static IntegerNumbers getArraysPositiveNumber() {
		System.out.println("Enter integer numbers.");
		WrapperScanner scanner = WrapperScanner.getInstance();
		IntegerNumbers integers = new IntegerNumbers(10);
		for(;;){
			int answer = scanner.getNextInt();
			if(answer>=0){
				integers.add(answer);
			}else{
				break;
			}
		}
		return integers;
	}
	
	public static int getProductOfAllEnteredEvenNumbers(){
		int productOfAllEnteredEvenNumbers =1;
		IntegerNumbers integ = getArraysPositiveNumber();
		for(int i=0;i<integ.size();i++){
			if(integ.get(i)%2==0){
				productOfAllEnteredEvenNumbers*=integ.get(i);
			}
		}
		return productOfAllEnteredEvenNumbers;
	}
}
