/**
 * Created by Babajko on 29.09.2016.
 */

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 2013);
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person("vova", 2001);
        Person person5 = new Person("Pavlo", 1999);

        person1.setBirthYear(2010);
        person2.input("Mery", 1991);
        person3.setName("Inna");
        person3.setBirthYear(1987);
        person4.changeName("Vova");

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
