import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("file1.txt"))) {
			String s = null;
			while ((s = br.readLine()) != null) {
				list.add(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("file2.txt"))) {
			bw.write("Number of lines in file1.txt: "+list.size());
			bw.newLine();
			int max = list.get(0).length();
			int imax = 0;
			for (int i = 1; i < list.size(); i++) {
				if (max < list.get(i).length()) {
					max = list.get(i).length();
					imax = i;
				}
			}
			bw.write("The longest line in file1.txt: "+list.get(imax));
			bw.newLine();
			bw.write("Oleksandr 03.09.1984");
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
	}

}
