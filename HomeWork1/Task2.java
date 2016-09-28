import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws IOException {
	String name;
	int age;
	String address;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("What is your name?");
	name = br.readLine();
	System.out.printf("How old are you, %s?\n",name);
	age = Integer.parseInt(br.readLine());
	System.out.printf("Where do you live, %s?\n",name);
	address = br.readLine();
	System.out.printf("Total info:\n\tName - %s,\n\tAge - %d,\n\tAddress - %s.",name,age,address);
	}

}
