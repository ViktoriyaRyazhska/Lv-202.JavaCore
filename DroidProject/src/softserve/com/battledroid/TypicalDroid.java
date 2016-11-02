package softserve.com.battledroid;

public class TypicalDroid implements Droid{
	private static final long serialVersionUID = 1L;
	private int health;
	private String name;
	private int energyLevel;

	public TypicalDroid(int health, String name, int energyLevel) {
		this.health = health;
		this.name = name;
		this.energyLevel = energyLevel;
	}

	public TypicalDroid(String name) {
		this(100, name, 1);
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	@Override
	public String toString() {
		return "TypicalDroid [name=" + name + "]";
	}

	@Override
	public DroidType getType() {
		return DroidType.TYPICAL;
	}

}
