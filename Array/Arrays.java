package Array;

public class Arrays {

	public static void main(String[] args) {
		int[] arr = { 3, -8, 2, 5, 12, 10, -5, 7, -4, 8 };

		int sum = 0;
		for (int i = 0; i < 5; i++) { sum += arr[i];}
		System.out.println("Sum = " + sum);
		
		int product = 1;
		for (int i = 5; i < 10; i++) {
			if (arr[i] > 0) {product = product * arr[i];}}
		System.out.println("Product = " + product);

		
	}

}
