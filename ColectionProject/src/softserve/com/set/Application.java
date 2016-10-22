package softserve.com.set;

import java.util.HashSet;
import java.util.Set;

public class Application {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add(i);
		}
		Set<Integer> set1 = new HashSet<>();
		for (int i = 5; i < 15; i++) {
			set1.add(i);
		}
		SetTest setTest = new SetTest();
		for (Integer integer : setTest.getUnionSet(set, set1)) {
			System.out.print(integer+" ");
		}
		System.out.println();
		for (Integer integer : setTest.getIntersect(set, set1)) {
			System.out.print(integer+" ");
		}
	}
}
