package softserve.com.month;

import java.util.Arrays;

public class IntegerNumbers {
	private int[] integer;
	private int length = 10;
	private int size;

	public IntegerNumbers(int initialCapacity) {
		if (initialCapacity > 0) {
			length = initialCapacity;
		}
		integer = new int[length];
	}

	public IntegerNumbers() {
		integer = new int[length];
	}

	public void add(int a) {
		size++;
		if (size < length) {
			integer[size - 1] = a;
		} else {
			length *= 2;
			integer = Arrays.copyOf(integer, length);
			integer[size - 1] = a;
		}
	}

	public int get(int index) {
		return integer[index];
	}

	public int size() {
		return size;
	}

}
