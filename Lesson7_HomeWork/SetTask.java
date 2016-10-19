package Lesson7.HomeWork;

import java.util.HashSet;
import java.util.Set;

/*
 * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), 
 * realizing the operations of union and intersection of two sets.
 *  Test the operation of these techniques on two pre-filled sets. 
 */
public class SetTask {
	private Set<Integer> set1 = new HashSet<Integer>();

	private Set<Integer> set2 = new HashSet<Integer>();

	{
		set1.add(10);
		set1.add(7);
		set1.add(3);
		set1.add(9);
		set1.add(345);
		set1.add(36);
		set1.add(99);
	}
	{
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		set2.add(10);
		set2.add(11);
	}

	// union(Set set1, Set set2) -> union of two sets
	public Set<Integer> union(Set set1, Set set2) {
		set1.addAll(set2);
		System.out.println("Union of two sets -> " + set1);
		return set1;
	}

	// intersect(Set set1, Set set2) -> intersection of two sets
	Set<Integer> intersect1 = new HashSet<Integer>(set1);
	Set<Integer> intersect2 = new HashSet<Integer>(set2);

	public Set<Integer> intersect(Set intersect1, Set intersect2) {
		intersect1.retainAll(intersect2);
		System.out.println("Intersection of two sets -> " + intersect1);
		return intersect1;
	}

	public Set<Integer> getIntersect1() {
		return intersect1;
	}

	public Set<Integer> getIntersect2() {
		return intersect2;
	}

	public void setIntersect1(Set<Integer> intersect1) {
		this.intersect1 = intersect1;
	}

	public void setIntersect2(Set<Integer> intersect2) {
		this.intersect2 = intersect2;
	}

	public Set<Integer> getSet1() {
		return set1;
	}

	public Set<Integer> getSet2() {
		return set2;
	}

	public void setSet1(Set<Integer> set1) {
		this.set1 = set1;
	}

	public void setSet2(Set<Integer> set2) {
		this.set2 = set2;
	}

}
