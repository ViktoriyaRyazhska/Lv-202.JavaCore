import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException2 extends Exception {
	public MyException2() {
	}

	public MyException2(String str) {
		super(str);
	}
}

public class Task2 {
	private static boolean flag;
	private static boolean flag2 = false;
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 1; i < 11; i++) {
			flag = false;
			while (flag == false) {
				System.out.printf("Please, enter a[%d]:\n", i);
				a[i-1]=readNumber(2, 99);
				if (i>1 && a[i-2]>=a[i-1] && !flag2){
					try {
						throw new MyException2("a["+(i-1)+"]>=a["+i+"] !!!");
					} catch (MyException2 e) {
					System.err.println(e);
					flag = false;
					}
				}
			}
		}
		System.out.println("You've just entered this array:");
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}

	public static int readNumber(int start, int end) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		flag2 = false;
		try {
			n = Integer.parseInt(br.readLine());
			if (n >= start && n <= end) {
				flag = true;
				return n;
			} else
				try {
					throw new MyException2("Out of range!!!");
				} catch (MyException2 e) {
					System.err.println(e);
					flag2 = true;
					return -1;
				}
		} catch (NumberFormatException e) {
			System.err.println("Not an integer!!!");
			flag2 = true;
			return -2;
		} catch (IOException e) {
			e.printStackTrace();
			flag2 = true;
			return -3;
		}

	}
}
