package softserve.com.battledroid;

public class ProtectedDroid extends TypicalDroid {
	private static final long serialVersionUID = 1L;
	private int glassScreen;

	public ProtectedDroid(int health, String name, int energyLevel, int glassScreen) {
		super(health, name, energyLevel);
		this.glassScreen = glassScreen;
	}

	public ProtectedDroid(String name) {
		this(100, name, 1, 5);
	}

	public int getGlassScreen() {
		return glassScreen;
	}

	public void setGlassScreen(int glassScreen) {
		this.glassScreen = glassScreen;
	}

	@Override
	public String toString() {
		return "ProtectedDroid [getName()=" + getName() + "]";
	}

	@Override
	public DroidType getType() {
		return DroidType.PROTECTED;
	}
}
