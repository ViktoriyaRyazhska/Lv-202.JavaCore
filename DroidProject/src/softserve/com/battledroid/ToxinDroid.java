package softserve.com.battledroid;

public class ToxinDroid extends TypicalDroid {
	private static final long serialVersionUID = 1L;
	private int poison;

	public ToxinDroid(int health, String name, int energyLevel, int poison) {
		super(health, name, energyLevel);
		this.poison = poison;
	}

	public ToxinDroid(String name) {
		this(100, name, 1, 10);
	}

	public int getPoison() {
		return poison;
	}

	public void setPoison(int poison) {
		this.poison = poison;
	}

	@Override
	public String toString() {
		return "ToxinDroid [getName()=" + getName() + "]";
	}

	@Override
	public DroidType getType() {
		return DroidType.TOXIN;
	}
}
