package softserve.com.bird;

public class Chicken extends NonFlyingBird{
	public Chicken() {
	}

	@Override
	public String toString() {
		return "Chicken [fly()=" + fly() + ", getFeathers()=" + getFeathers() + ", isLayEggs()=" + isLayEggs()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
