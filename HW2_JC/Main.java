
public class Main {

	public static void main(String[] args) {
		
		Person P1 = new Person("Olena", 1994);
		Person P2 = new Person("Olya", 1990);
		Person P3 = new Person("Ira", 1994);
		Person P4 = new Person("Vlad", 1994);
		Person P5 = new Person("Mary", 1994);
		System.out.println(P1.getName() + " is " + P1.Age(0));
		System.out.println(P2.getName() + " is " + P2.Age(0));
		System.out.println(P3.getName() + " is " + P3.Age(0));
		System.out.println(P4.getName() + " is " + P4.Age(0));
		System.out.println(P5.getName() + " is " + P5.Age(0));

	}

}
