package softserve.com.manager;

import java.io.IOException;

import softserve.com.battledroid.Droid;
import softserve.com.menu.AddDroid;
import softserve.com.menu.LandingOnShip;
import softserve.com.menu.Menu;
import softserve.com.menu.Submenu;

public class MainTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Menu menu = new LandingOnShip();
		AddDroid droid = new AddDroid();
		droid.run(DroidManager.listDroid);
		for (Droid string : DroidManager.listDroid) {
			System.out.println(string);
		}
		menu.run(DroidManager.listDroid);
		Submenu.run();
	}
}
