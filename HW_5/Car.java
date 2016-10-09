
public class Car {
String type;
int year;
double capacity;
public Car(String type, int year, double capacity) {
	super();
	this.type = type;
	this.year = year;
	this.capacity = capacity;
}
@Override
public String toString() {
	return "Car [type=" + type + ", year=" + year + ", capacity=" + capacity + "]";
}


}
