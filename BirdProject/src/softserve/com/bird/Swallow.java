package softserve.com.bird;

public class Swallow extends FlyingBird{

	public Swallow() {
	}

	@Override
	public String toString() {
		return "Swallow [fly()=" + fly() + ", getFeathers()=" + getFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
