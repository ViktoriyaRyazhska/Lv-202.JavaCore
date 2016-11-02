package softserve.com.menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import softserve.com.battledroid.Droid;
import softserve.com.scanner.WrapperScanner;

public class LandingOnShip implements Menu {
	private static String systemFileName = "C://Users//okovalyk//Desktop//Epam TALab//Workspase//DroidProject//Ship";
	private File directory;
	
	public LandingOnShip(){
		this.directory=new File (systemFileName);
	}

	public File getDirectory() {
		return directory;
	}

	public void listFilesForFolder(File folder) {
		for (final File directory : folder.listFiles()) {
			System.out.println(directory.getName());
		}
	}
	
	public String getNameShip() throws IOException{
		WrapperScanner scanner = WrapperScanner.getInstance();
		System.out.println("Choose the ship:");
		listFilesForFolder(directory);
		return scanner.getNextValue();
	}

	@SuppressWarnings({ "resource", "unchecked" })
	public List<Droid> readDroid() throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(directory+"//"+getNameShip()));
		List<Droid> droids= (List<Droid>) in.readObject();
		return droids;
	}
	@Override
	public void run(List<Droid> droids) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directory+"//"+getNameShip()));
		out.writeObject(droids);
		for (Droid droid : droids) {
			System.out.println(droid);
		}
		out.close();
	}

}
