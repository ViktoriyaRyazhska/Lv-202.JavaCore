
public class Main {

	String name;
	int age;
	Breeds breed;

	public static void main(String[] args) {

		Dog dog1 = new Dog("Linda", Breeds.Shepherd, 5);
		Dog dog2 = new Dog("Linda", Breeds.Shepherd, 5);
		Dog dog3 = new Dog("Leo", Breeds.Spaniel, 8);

		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog2));

		if (dog1.age > dog2.age && dog1.age > dog3.age) {

			System.out.println("The oldest dog is " + dog1.name + dog1.breed);

		}
		if (dog2.age > dog1.age && dog2.age > dog3.age) {

			System.out.println("The oldest dog is " + dog2.name + dog2.breed);

		}
		if (dog3.age > dog1.age && dog3.age > dog2.age) {

			System.out.println("The oldest dog is "+ dog3.breed + " " + dog3.name );

		}

	}

}