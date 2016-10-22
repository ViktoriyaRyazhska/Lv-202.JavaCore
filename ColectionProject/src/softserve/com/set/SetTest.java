package softserve.com.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public Set<Integer> getUnionSet(Set<Integer> set, Set<Integer> set1) {
		Set<Integer> unionSet = new HashSet<>(set);
		unionSet.addAll(set1);
		return unionSet;
	}

	public Set<Integer> getIntersect(Set<Integer> set1, Set<Integer> set2) {
		set1.retainAll(set2);
		return set1;
	}
}
