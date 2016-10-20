import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int birthYear;
	
	BufferedReader br = new BufferedReader(
	new InputStreamReader(System.in));
	public Person(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public  int Age (int age) {
		
		int Age = 2016 - birthYear;
		return Age;
	}
	
	public void changeName(String name) {
		this.name = name;
		}

	public void InPut (String Input) throws IOException{
		String name = br.readLine();
		int age = Integer.parseInt(br.readLine());
	}
	
		public void OutPut (String Output){
			System.out.println(name);
			System.out.println(2016 - birthYear);
			
		}
}

