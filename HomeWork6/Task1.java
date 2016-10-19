import java.util.LinkedHashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("five");
		set1.add("six");
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("five");
		set2.add("six");
		set2.add("seven");
		set2.add("eight");
		set2.add("nine");
		set2.add("ten");
		System.out.println(union(set1, set2));
		System.out.println(intersect(set1, set2));
	}

	public static Set<String> union(Set<String> s1, Set<String> s2) {
		Set<String> tmp = new LinkedHashSet<>(s1);
		tmp.addAll(s2);
		return tmp;
	}

	public static Set<String> intersect(Set<String> s1, Set<String> s2) {
		Set<String> tmp = new LinkedHashSet<>(s1);
		tmp.retainAll(s2);
		return tmp;
	}
}
