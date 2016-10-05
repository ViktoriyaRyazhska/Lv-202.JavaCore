package softserve.com.dog;

public class Dog {
	private String name;
	private int age;
	private Breed breed;
	
	Dog(String name, int age, Breed breed){
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}
	
	public boolean equals(Dog dog) {
		if(name==dog.name){
			return true;
		}else{
		return false;
		}
	}
	
	static void searchOldestDog(Dog ... dog){
		Dog dogOldest = dog[0];
		for (int i=1;i<dog.length; i++){
			if(dogOldest.age<dog[i].age){
				dogOldest = dog[i];
			}
		}
		System.out.println("Oldest dog - "+dogOldest.name);
	}
}
