package less3_dog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;

public class main_dog {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dog dog1 = new Dog();
		System.out.println("input dog1 name");
		dog1.setName(br.readLine());
		System.out.println("input dog1 breed: 1 - lapos; 2 - mastuf; 3 -lajka");
		dog1.breed(Integer.parseInt(br.readLine()));
		System.out.println("input dog1 age");
		dog1.setAge(Integer.parseInt(br.readLine()));
		
		Dog dog2 = new Dog();
		System.out.println("input dog2 name");
		dog2.setName(br.readLine());
		System.out.println("input dog2 breed: 1 - lapos; 2 - mastuf; 3 -lajka");
		dog2.breed(Integer.parseInt(br.readLine()));
		System.out.println("input dog2 age");
		dog2.setAge(Integer.parseInt(br.readLine()));		
		
		Dog dog3 = new Dog();
		System.out.println("input dog3 name");
		dog3.setName(br.readLine());
		System.out.println("input dog3 breed: 1 - lapos; 2 - mastuf; 3 -lajka");
		dog1.breed(Integer.parseInt(br.readLine()));
		System.out.println("input dog3 age");
		dog3.setAge(Integer.parseInt(br.readLine()));
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		
		if (dog1.equals(dog2)||dog2.equals(dog3)
				||dog1.equals(dog3)){
			System.out.println("two dogs odnakovi imena");
		}
		int max=dog1.getAge();
		if (max<dog2.getAge()){
			max=dog2.getAge();
		}
		if (max<dog3.getAge()){
			max=dog3.getAge();
		}
		
		if (max==dog1.getAge()){
			System.out.println("oldest dog: "+dog1);
		}
		if (max==dog2.getAge()){
			System.out.println("oldest dog: "+dog2);
		}
		if (max==dog3.getAge()){
			System.out.println("oldest dog: "+dog3);
		}
			
	}

}
