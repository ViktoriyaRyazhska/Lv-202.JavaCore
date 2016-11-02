package softserve.com.menu;

import java.io.IOException;

import softserve.com.scanner.WrapperScanner;

public class Application {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		while (true) {
			try {
				WrapperScanner scanner = WrapperScanner.getInstance();
//				String menu = BasicMenu.getDisplayableText();
//				String[] strings = BasicMenu.getMenuName().split(" ");
//				for (int i = 0; i < strings.length; i++) {
//					System.out.println(BasicMenu.getDisplayableText);
//				}
				System.out.println("Choose number menu");
				for (BasicMenu menu : BasicMenu.values()) {
					if(!menu.equals(BasicMenu.UNKNOWN)){
					System.out.println(menu.getIndex()+":"+menu.getDisplayableText());
					}
				}
				//System.out.println("Enter type : " + BasicMenu.getMenuName());
				String type = scanner.getNextValue().toLowerCase();
				int index = Integer.parseInt(type);
				BasicMenu basicMenu = BasicMenu.getMenuByIndex(index);
				switch (basicMenu) {
				case CHOOSE:
					Submenu.run();
					break;
				case NEWSHIP:
					Submenu.run();
					break;
				case UNKNOWN:
					System.out.println("You enter incorect date.");
					break;
				case EXIT:
					System.exit(0);
					break;
				default:
					break;
				}
			} catch (RuntimeException e) {
				System.out.println("Invalid index. Try again.");
			}

		}
	}
}
