package softserve.com.month;

public class FiveNumbers {

	int[] enterFiveNumbers() {
		System.out.println("Enter 5 integer numbers.");
		WrapperScanner scanner = WrapperScanner.getInstance();
		int[] fiveNumbers = new int[5];
		for (int i = 0; i < fiveNumbers.length; i++) {
			fiveNumbers[i] = scanner.getNextInt();
		}
		return fiveNumbers;
	}

	int positionOfSecondPositiveNumber(int[] fiveNumbers) {
		int position = 0;
		int i = 0;
		for (; i < fiveNumbers.length; i++) {
			if (fiveNumbers[i] > 0) {
				position++;
				if (position == 2) {
					break;
				}
			}
		}
		return i + 1;
	}

	int positionMinimumInTheArray(int[] fiveNumbers) {
		int position = 1;
		int min = fiveNumbers[0];
		for (int i = 0; i < fiveNumbers.length; i++) {
			if (min > fiveNumbers[i]) {
				min = fiveNumbers[i];
				position = i + 1;
			}
		}
		return position;
	}

	void print(int[] fiveNumbers) {
		System.out.println("Position of second positive number - " + positionOfSecondPositiveNumber(fiveNumbers)
				+ ",minimum - " + fiveNumbers[positionMinimumInTheArray(fiveNumbers)-1] + " ,its position in the array - "
				+ positionMinimumInTheArray(fiveNumbers));
	}
}
