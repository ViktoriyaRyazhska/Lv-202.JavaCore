package softserve.com.menu;

import java.io.IOException;
import java.util.List;

import softserve.com.battledroid.Droid;
import softserve.com.battledroid.DroidType;
import softserve.com.battledroid.ProtectedDroid;
import softserve.com.battledroid.ToxinDroid;
import softserve.com.battledroid.TypicalDroid;
import softserve.com.scanner.WrapperScanner;

public class AddDroid implements Menu {
	
	@Override
	public void run(List<Droid> droids) throws IOException {
		WrapperScanner scanner = WrapperScanner.getInstance();
		System.out.println("Enter type : " + DroidType.getDroidTypeNames());
		String type = scanner.getNextValue().toLowerCase();
		System.out.println("Enter name");
		String name = scanner.getNextValue().toLowerCase();
		DroidType droidType = DroidType.getTypeByCode(type);
		switch (droidType) {
		case TOXIN:
			droids.add(new ToxinDroid(name));
			break;
		case TYPICAL:
			droids.add(new TypicalDroid(name));
			break;
		case PROTECTED:
			droids.add(new ProtectedDroid(name));
			break;
		case UNKNOWN:
			System.out.println("You enter incorect type.");
			break;
		}
	}

}
