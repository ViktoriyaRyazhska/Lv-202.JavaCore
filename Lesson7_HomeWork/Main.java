package Lesson7.HomeWork;

public class Main {

	public static void main(String[] args) {
		// TASK1
		System.out.println("________________Start Task 1________________");
		SetTask setTask = new SetTask();
		System.out.println("We have two sets -> " + setTask.getSet1() + " and " + setTask.getSet2());
		setTask.union(setTask.getSet1(), setTask.getSet2());
		setTask.intersect(setTask.getIntersect1(), setTask.getIntersect2());
		System.out.println("________________End Task 1________________");
		// TASK1

		System.out.println("\n");

		// TASK2
		System.out.println("________________Start Task 2________________");
		MapTask mapTask = new MapTask();
		mapTask.addTenPerson();
		mapTask.outputEntitiesOfMapOnScreen();
		mapTask.checkIfTheraAreAtLeastTwoPersonsWithTheSameName();
		mapTask.removeOrestFromPersonMap();
		System.out.println("________________End Task 2________________");
		// TASK2

	}

}
