package softserve.com.bird;

public class Eagle extends FlyingBird{

	public Eagle() {
	}

	@Override
	public String toString() {
		return "Eagle [fly()=" + fly() + ", getFeathers()=" + getFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
