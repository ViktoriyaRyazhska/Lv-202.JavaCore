package softserve.com.dog;

public class Main {
	public static void main(String[] args) {
	Dog dog1 = new Dog("Spake", 12, Breed.SIT);
	Dog dog2 = new Dog("Berta", 17, Breed.BARK);
	Dog dog3 = new Dog("Spake", 16, Breed.SIT);
	
	System.out.println(dog1.equals(dog2));
	
	Dog.searchOldestDog(dog1,dog2,dog3);
	}
}
