package softserve.com.menu;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import softserve.com.battledroid.Droid;
import softserve.com.scanner.WrapperScanner;

public class Submenu {
	private static final String systemFileName = new File("").getAbsolutePath() + "/resource/ship";
	public static File directory = new File(systemFileName);

	public static void listFilesForFolder(File folder) {
		for (final File directory : folder.listFiles()) {
			System.out.println(directory.getName());
		}
	}

	public static String getNameShip() throws IOException {
		while(true){
			try {
				WrapperScanner scanner = WrapperScanner.getInstance();
				System.out.println("Choose the ship:");
				listFilesForFolder(directory);
				String shipName = scanner.getNextValue();
				if (new File(systemFileName + "/" + shipName).exists()) {
					return shipName;
				}
			} catch (FileNotFoundException e) {
				System.out.println("You enter incorect droid ship");
				continue;
			}
			
		}
		
	}

	@SuppressWarnings("unchecked")
	public static List<Droid> readDroid(String string)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		List<Droid> droids = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(string));) {
			droids = (List<Droid>) in.readObject();

		} catch (EOFException e) {
			return droids;
		}catch (FileNotFoundException e) {
			System.out.println("You enter incorect date.");
		}
		return droids;
	}

	public static void run() throws FileNotFoundException, ClassNotFoundException, IOException {
		String nameShip = directory + "//" + getNameShip();
		List<Droid> droids = Submenu.readDroid(nameShip);
		WrapperScanner scanner = WrapperScanner.getInstance();
		String answer;
		HashMap<String, Menu> actions = new HashMap<>();
		actions.put("disembarkfromship", new DisembarkFromShip());
		actions.put("adddroid", new AddDroid());
		actions.put("readship", new ReadShip());
		actions.put("cancel", new Cancel());

		while (true) {
			System.out.println("Choose menu item:");
			for (String key : actions.keySet()) {
				System.out.println(key);
			}
			answer = scanner.getNextValue().toLowerCase();
			actions.get(answer).run(droids);
			if (answer.equalsIgnoreCase("cancel")) {
				break;
			}
		}
		Submenu.writeDroid(droids, nameShip);
	}

	public static void writeDroid(List<Droid> droids, String string) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(string));
		for (Droid droid : droids) {
			System.out.println(droid);
		}
		if (droids.isEmpty()) {
			out.flush();
		} else {
			out.writeObject(droids);
		}
		out.close();
	}

}
