import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int birthYear;
	
	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public void age(){
		System.out.println(name + " is "+ (2016-birthYear));
	}
	
	public void input() throws IOException{
	System.out.println("input name person");
	name = br.readLine();
	System.out.println("input birthYear person");
	birthYear = Integer.parseInt(br.readLine());
	System.out.println("Person create");
	}
	
	public void output(){
		System.out.println("Person: "+ name+" is age "+(2016-birthYear));
	}
	
	public void changeName() throws IOException{
		System.out.println("change name of "+name+ "on");
		name = br.readLine();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getbirthYear() {
		return birthYear;
	}

	public void setbirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
	

}
