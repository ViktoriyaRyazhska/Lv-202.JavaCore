package Lesson4.HomeWork;

/*
 * Create 3 instances of type Dog.
 * 
 * Check if there is no two dogs with the same name.
 * 
 * Display the name and the kind of the oldest dog.
 */
//This class was named like "Lesson4_DogMain" only for better recognizing on GitHub, 
//I know that's not according to Java naming convention, SORRY!!! I wont write this in production code
public class Lesson4_DogMain {

	public static void main(String[] args) {

		// Create 3 instances of type Dog.
		Lesson4_Dog dog1 = new Lesson4_Dog("jack", DogBreed.GERMAN_SHEPHEARD, 15);
		Lesson4_Dog dog2 = new Lesson4_Dog("", DogBreed.BULLDOG, 30);
		Lesson4_Dog dog3 = new Lesson4_Dog("rex", DogBreed.LABRADOR_RETRIEVER, 80);

		// Check if there is no two dogs with the same name.
		System.out.println("Checkcing if there is no two dogs with the same name ->");
		if (dog1.getName().toUpperCase() != dog2.getName().toUpperCase()
				& dog1.getName().toUpperCase() != dog3.getName().toUpperCase()
				& dog3.getName().toUpperCase() != dog2.getName().toUpperCase()) {
			System.out.println("There is no dogs with same names");
		} else if (dog1.getName().toUpperCase() == dog2.getName().toUpperCase()) {
			System.out.println("dogs 1 and dogs 2 have the same names");
		} else if (dog1.getName().toUpperCase() == dog3.getName().toUpperCase()) {
			System.out.println("dogs 1 and dogs 3 have the same names");
		} else if (dog2.getName().toUpperCase() == dog3.getName().toUpperCase()) {
			System.out.println("dogs 2 and dogs 3 have the same names");
		}

		// Display the name and the kind of the oldest dog.
		System.out.println("Display the name and the kind of the oldest dog ->");
		if (dog1.getAge() > dog2.getAge() & dog1.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is " + dog1.getName() + "; breed " + dog1.getBreed());
		} else if (dog2.getAge() > dog1.getAge() & dog2.getAge() > dog3.getAge()) {
			System.out.println("The oldest dog is " + dog2.getName() + "; breed " + dog2.getBreed());
		} else if (dog3.getAge() > dog2.getAge() & dog3.getAge() > dog1.getAge()) {
			System.out.println("The oldest dog is " + dog3.getName() + "; breed " + dog3.getBreed());
		}
	}
}

