/**
 * Created by Babajko on 03.10.2016.
 */
public class Dog {
    public enum Breeds{Bulldog, Beagle, Poodle, Rottweiler, Boxer, Chihuahua}

    private String name;
    private int age;
    private Breeds breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(Breeds breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public Dog(String name, int age, Breeds breed) {
        setName(name);
        setAge(age);
        setBreed(breed);
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name.equals(dog.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
