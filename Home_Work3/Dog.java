package Home_Work3;

public class Dog {
	private String name;
	private Breed breed;
	private int age;

	enum Breed {
		AUSTRALIAN_TERRIER, BULLDOG, COLLIE, DALMATAIN, ENGLISH_FOXHOUND, FOX_TERRIER, MASTIFF, PAPILLON, YORKSHIRE_TERRIER
	};

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

	public Dog() {

	}

	public Dog(String name, Breed breed, int age) {

		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public static void main(String[] args) {

		Dog dog1 = new Dog("Lucky", Breed.BULLDOG, 5);
		Dog dog2 = new Dog("Beethoven", Breed.YORKSHIRE_TERRIER, 3);
		Dog dog3 = new Dog("Chucky", Breed.COLLIE, 8);

		if ((dog1.getName() != dog2.getName()) && (dog1.getName() != dog3.getName())
				&& (dog2.getName() != dog3.getName())) {
			System.out.println("There are no dogs with same name");
			
		if(dog1.getAge()>dog2.getAge() && dog1.getAge()>dog3.getAge()){System.out.println("The name and the kind of the oldest dog is "+dog1.name+", "+dog1.breed);}
		if(dog2.getAge()>dog1.getAge() && dog2.getAge()>dog3.getAge()){System.out.println("The name and the kind of the oldest dog is "+dog2.name+", "+dog2.breed);}
		if(dog3.getAge()>dog1.getAge() && dog3.getAge()>dog2.getAge()){System.out.println("The name and the kind of the oldest dog is "+dog3.name+", "+dog3.breed);}

		}

	}
}