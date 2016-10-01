/**
 * Created by Babajko on 29.09.2016.
 */
import java.time.LocalDate;


public class Person {
    private String name;
    private int birthYear;

    public Person(){}

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public byte age(){
        return (byte) (LocalDate.now().getYear() - this.birthYear);
    }

    public void input (String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public void output(){
        System.out.println(this);
    }

    public void changeName(String name){this.name = name; }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + age() +
                '}';
    }

}
