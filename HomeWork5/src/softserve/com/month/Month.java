package softserve.com.month;

public class Month {
	int getMonth() {
		int[] month_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = 0;
		WrapperScanner scanner = WrapperScanner.getInstance();
		System.out.println("Enter the number of month");
		 month = scanner.getNextInt();
		if(month>=0&& month<12){
			return month_days[month-1];
		}else{
			System.out.println("Incorrect data. Please enter from 1 to 12.");
			getMonth();
		
		}
		return month_days[month-1];
	}
}
