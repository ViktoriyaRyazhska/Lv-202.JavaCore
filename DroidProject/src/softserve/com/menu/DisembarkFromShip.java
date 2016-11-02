package softserve.com.menu;

import java.io.IOException;
import java.util.List;

import softserve.com.battledroid.Droid;

public class DisembarkFromShip implements Menu{

	@Override
	public void run(List<Droid> droids) throws IOException {
		droids.clear();
	}

}
