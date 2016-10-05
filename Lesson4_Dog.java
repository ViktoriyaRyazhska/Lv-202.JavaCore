package Lesson4.HomeWork;

/*Сreate class Dog with fields name, breed, age.
Declare enum for field breed. 
Create 3 instances of type Dog. 
Check if there is no two dogs with the same name. 
Display the name and the kind of the oldest dog. 
 */
//This class was named like "Lesson4_Dog" only for better recognizing on GitHub, 
//I know that's not according to Java naming convention, SORRY!!!I wont write this in production code
public class Lesson4_Dog {

	private String name;
	private Lesson4.HomeWork.DogBreed breed;
	private int age;

	public Lesson4_Dog() {
		super();
	}

	public Lesson4_Dog(String name, Lesson4.HomeWork.DogBreed breed, int age) {
		super();
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

	public Lesson4.HomeWork.DogBreed getBreed() {
		return breed;
	}

	public void setBreed(Lesson4.HomeWork.DogBreed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lesson4_Dog other = (Lesson4_Dog) obj;
		if (age != other.age)
			return false;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lesson4_Dog [name=" + name + ", breed=" + breed + ", age=" + age + "]";
	}
}

