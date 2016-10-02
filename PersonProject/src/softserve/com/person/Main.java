package softserve.com.person;

public class Main {
	
	public static void main(String[] args) {
		Person person1 = new  Person("Olena", 1999);
		Person person2 = new Person("Olha",2001);
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person1.changeName("Nazar");
		person1.output();
		
		person3.input();
		person3.output();
		
		person4.getAge();
	}
}
