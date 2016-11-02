package softserve.com.menu;

import java.io.IOException;
import java.util.List;

import softserve.com.battledroid.Droid;

public class ReadShip implements Menu {

	@Override
	public void run(List<Droid> droids) throws IOException {
		if (droids.isEmpty()) {
			System.out.println("Ship is empty.");
		} else {
			for (Droid droid : droids) {
				System.out.println(droid);
			}
		}
	}

}
