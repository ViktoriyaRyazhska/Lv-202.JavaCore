package softserve.com.bird;

public class Penguin extends NonFlyingBird{

	public Penguin() {
	}

	@Override
	public String toString() {
		return "Penguin [fly()=" + fly() + ", getFeathers()=" + getFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
