enum Breed {
	ÌÎÏÑ, Â²Â×ÀĞÊÀ, ÄÎÁÅĞÌÀÍ
}

class Dog {
	private String name;
	private Breed breed;
	private int age;

	public Dog(String name, Breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + "]";
	}

}

public class Task2 {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Äæåê", Breed.Â²Â×ÀĞÊÀ, 6);
		Dog dog2 = new Dog("Äæåê", Breed.ÌÎÏÑ, 7);
		Dog dog3 = new Dog("Áğàóí", Breed.ÄÎÁÅĞÌÀÍ, 7);
		if ((dog1.getName() == dog2.getName()) || (dog1.getName() == dog3.getName())
				|| (dog2.getName() == dog3.getName())) {
			System.out.println("There are two at least dogs with the same name.");
		} else {
			System.out.println("There are no two dogs with the same name.");
		}
		System.out.println("\nThe oldest dog(s) is(are):");
		if (dog1.getAge() < dog2.getAge()) {
			if (dog2.getAge() > dog3.getAge()) {
				System.out.println(dog2);
			} else {
				if (dog2.getAge() < dog3.getAge()) {
					System.out.println(dog3);
				} else {
					System.out.println(dog2 + ", " + dog3);
				}
			}
		} else {
			if (dog1.getAge() > dog2.getAge()) {
				if (dog1.getAge() > dog3.getAge()) {
					System.out.println(dog1);
				} else {
					if (dog1.getAge() < dog3.getAge()) {
						System.out.println(dog3);
					} else {
						System.out.println(dog1 + ", " + dog3);
					}
				}
			} else {
				if (dog1.getAge() < dog3.getAge()) {
					System.out.println(dog3);
				} else {
					if (dog1.getAge() > dog3.getAge()) {
						System.out.println(dog1 + ", " + dog2);
					} else {
						System.out.println(dog1 + ", " + dog2 + ", " + dog3);
					}
				}
			}
		}
	}

}

