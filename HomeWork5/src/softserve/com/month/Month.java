package softserve.com.month;

public class Month {
	int getMonth() {
		int[] month_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		WrapperScanner scanner = WrapperScanner.getInstance();
		System.out.println("Enter the number of month");
		int month = scanner.getNextInt();
		return month_days[month];
	}
}
