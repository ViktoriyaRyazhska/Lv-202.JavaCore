import java.util.LinkedHashSet;
import java.util.Set;

public class Union_Intersect {

	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);

		Set<Integer> set2 = new LinkedHashSet<>();
		set1.add(4);
		set1.add(3);
		set1.add(5);
		set1.add(6);

		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));
	}

	public static Set<Integer> union(Set <Integer> set1, Set <Integer> set2) {
		Set<Integer> tmp = new LinkedHashSet<>(set1);
		tmp.addAll(set2);
		return tmp;

	}

	public static Set<Integer> intersect(Set <Integer> set1, Set <Integer> set2) {
		Set<Integer> tmp = new LinkedHashSet<>(set1);
		tmp.retainAll(set2);
		return tmp;
	}

}
