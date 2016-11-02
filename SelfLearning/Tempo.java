package SelfLearning;

import java.util.*;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tempo {
	int ccard;
	int pcard;
	int choise;
	public List<Tempo> steps = new ArrayList();
	// public List<Tempo> b = new ArrayList();

	public Tempo() {
	}

	Tempo(int a, int b, int c) {
		ccard = a;
		pcard = b;
		choise = c;
	}

	List<Tempo> tempogive() {
		return steps;
	}

	void tempoadd(int ccard, int pcard, int choise) throws IOException {
		steps.add(new Tempo(ccard, pcard, choise));
	}

	void temporec(List<Tempo> a, int res) throws IOException {
		int z = 0;
		int sov = 0;
		while (a.size() > 0) {
			try (BufferedReader reader = new BufferedReader(new FileReader("C:/" + a.get(z).ccard + ".txt"))) {
				String line;
				Pattern already = Pattern.compile("^" + a.get(z).pcard + "\\s" + a.get(z).choise + "\\s-?\\d*$");
				while ((line = reader.readLine()) != null) {
					Matcher m = already.matcher(line);

					if (m.matches()) {
						String fileName = "C:/" + a.get(z).ccard + ".txt";
						String search = line;
						String[] digits = search.split(" ");
						int recordResult = Integer.parseInt(digits[2]);
						recordResult += res;
						String replace = digits[0] + " " + digits[1] + " " + recordResult;
						Charset charset = StandardCharsets.UTF_8;
						Path path = Paths.get(fileName);
						Files.write(path, new String(Files.readAllBytes(path), charset).replace(search, replace)
								.getBytes(charset));
						sov++;
					}
				}
				if (sov > 0) {
					a.remove(z);
				} else {
					try (FileWriter writer = new FileWriter("C:/" + a.get(z).ccard + ".txt", true)) {
						String text = a.get(z).pcard + " " + a.get(z).choise + " " + res;
						writer.write(text);
						writer.write('\n');
						a.remove(z);
					} catch (IOException ex) {

						System.out.println("No file");
					}
				}
			} catch (IOException ex) {
				System.out.println("No file");
			}
		}
	}
}