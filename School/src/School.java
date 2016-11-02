import java.io.Serializable;

/**
 * Created by Babajko on 29.10.2016.
 */
public class School implements Serializable{
    private int number;
    private String address;

    public School(int number, String address) {
        this.number = number;
        this.address = address;
    }

    public void prontInfo(){
        System.out.println("Number: " + number + "\nAddress: " + address);
    }

    @Override
    public String toString() {
        return "School{" +
                "number=" + number +
                ", address='" + address + '\'' +
                '}';
    }
}
