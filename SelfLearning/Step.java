package SelfLearning;

import java.io.*;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class Step {
	int shield;
	int step;
	int trigger;
	Random r = new Random();
	public int choise = r.nextInt(2);

	int choise(int ccard, int pcard) throws IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("C:/" + ccard + ".txt"))) {
			String line;
			shield = 0;
			step = 0;
			trigger = 0;
			while ((line = reader.readLine()) != null) {
				Pattern variant = Pattern.compile("^" + pcard + "\\s" + 1 + "\\s-?\\d*$");
				Pattern sshield = Pattern.compile("^" + pcard + "\\s" + 0 + "\\s-?\\d*$");
				Matcher m = variant.matcher(line);

				if (m.matches()) {
					String[] a = line.split(" ");
					step = Integer.parseInt(a[2]);
					trigger++;
				}
				m = sshield.matcher(line);

				if (m.matches()) {
					String[] a = line.split(" ");
					shield = Integer.parseInt(a[2]);
					trigger++;
				}
			}

			if (trigger == 2) {
				if (step > shield) {
					return 1;
				} else {
					if ((shield - step) > 10) {
						return 0;
					} else {
						return r.nextInt(2);
					}
				}
			} else
				return r.nextInt(2);
		} catch (IOException ex) {
			System.out.println("Нема файлу, створюємо: ");
			File newFile = new File("C:/" + ccard + ".txt");
			newFile.createNewFile();
			System.out.println("C:/" + ccard + ".txt");
			return r.nextInt(2);
		}
	}
}
