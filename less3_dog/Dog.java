package less3_dog;

public class Dog {
	private String name;
	DogBreed dogbreed;
	private int age;
	
	public Dog(String name, DogBreed dogbreed, int age) {
		this.name = name;
		this.dogbreed = dogbreed;
		this.age = age;
	}

	public Dog() {
	
	}
	
	public void breed(int a){
		switch (a) {
		case 1:
			dogbreed=DogBreed.lapos;
			break;
			
		case 2:
			dogbreed=DogBreed.mastuf;
			break;
			
		case 3:
			dogbreed=DogBreed.lajka;
			break;

		default:
			break;
		}
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DogBreed getDogbreed() {
		return dogbreed;
	}

	public void setDogbreed(DogBreed dogbreed) {
		this.dogbreed = dogbreed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", dogbreed=" + dogbreed + ", age=" + age + "]";
	}
	
	
	
	

}
