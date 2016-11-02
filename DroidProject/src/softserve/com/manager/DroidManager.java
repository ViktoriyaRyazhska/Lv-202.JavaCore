package softserve.com.manager;

import java.util.ArrayList;
import java.util.List;

import softserve.com.battledroid.Droid;
import softserve.com.battledroid.ProtectedDroid;
import softserve.com.battledroid.ToxinDroid;
import softserve.com.battledroid.TypicalDroid;

public class DroidManager {
	public static List<Droid> listDroid = new ArrayList<>();
	
	static {
		listDroid.add(new ProtectedDroid("Vasyl"));
		listDroid.add(new ToxinDroid("Pertro"));
		listDroid.add(new TypicalDroid("Pavlo"));
	}
}
