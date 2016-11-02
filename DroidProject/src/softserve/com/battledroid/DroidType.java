package softserve.com.battledroid;

public enum DroidType {
	TYPICAL, TOXIN, PROTECTED, UNKNOWN;
	public static DroidType getTypeByCode(String code) {
		DroidType result = DroidType.UNKNOWN;
		for (DroidType type : DroidType.values()) {
			if (code.equalsIgnoreCase(type.name())) {
				result = type;
				break;
			}
		}
		return result;
	}

	public static String getDroidTypeNames() {
		StringBuilder builder = new StringBuilder();
		for (DroidType type : DroidType.values()) {
			if (!type.equals(UNKNOWN)) {
				builder.append(type).append(", ");
			}
		}
		return builder.substring(0, builder.length() - 2).toString();
	}
}
