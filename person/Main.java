import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Person pr1 = new Person();
		Person pr2 = new Person();
		Person pr3 = new Person();
		Person pr4 = new Person("Roman", 2000);
		Person pr5 = new Person("Sasha", 1980);	
		
		pr4.output();
			
		pr1.input();				
		pr1.output();
		
		pr4.changeName();
		pr4.output();
		
		pr5.age();
	}

}
