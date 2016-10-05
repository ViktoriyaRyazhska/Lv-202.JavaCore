package softserve.com.number;

public class Main {

	public static void main(String[] args) {
		// 1
		Number number = new Number();
		number.checkNumber(12, 13, 11);
		
		// 2
		number.searchMaxMin(1, 23, 2);
		
		// 3
		WrapperScanner scanner = WrapperScanner.getInstance();
		String answer;

		System.out.print("Enter error: 400, 401, 402");
		answer = scanner.getNextValue().toUpperCase();
		try {
			HTTPError error = HTTPError.valueOf(answer);
			error.errorDiscribe();
		} catch (IllegalArgumentException e) {
			System.out.println(answer + " is not a valid choice.");
		}
	}

}
