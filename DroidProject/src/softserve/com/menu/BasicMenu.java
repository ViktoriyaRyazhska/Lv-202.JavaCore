package softserve.com.menu;

public enum BasicMenu {
	CHOOSE(1, "Choose the ship"),
	NEWSHIP(2,"Create new ship"),
	EXIT(3,"Exit"),
	UNKNOWN(-1,"");
	private int index;
	private String displayableText;

	private BasicMenu(int index, String displayableText) {
		this.index = index;
		this.displayableText = displayableText;
	}

	public int getIndex() {
		return index;
	}

	public String getDisplayableText() {
		return displayableText;
	}
	
	public static BasicMenu getMenuByIndex(int index){
		BasicMenu result = BasicMenu.UNKNOWN;
		for (BasicMenu menu : BasicMenu.values()) {
			if(index == menu.getIndex()){
				result = menu;
				break;
			}
		}
		return result;
	}
	public static String getMenuName(){
		StringBuilder builder = new StringBuilder();
		for (BasicMenu type : BasicMenu.values()) {
			if (!type.equals(UNKNOWN)) {
				builder.append(type.displayableText).append(", ");
			}
		}
		return builder.substring(0, builder.length() - 2).toString();
	}
}
