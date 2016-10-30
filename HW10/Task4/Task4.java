import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Task4 {
	public static void main(String[] args) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String str = null;
		String[] arr = new String[50];
		String maxLine = "";
		int count = 0;

		try {
			fr = new FileReader("src/file1.txt");
			br = new BufferedReader(fr);

			while ((str = br.readLine()) != null) {

				arr[count] = str;
				count++;
				if (maxLine.length() < str.length())
					maxLine = str;
			}
			fr.close();
			br.close();

			String s = "Number of lines in file1.txt:\t" + count + "\n" + "The longest line in file1.txt:\n" + "\t"
					+ maxLine + "\n" + "My name is Olena ,  21.09.94";
			fw = new FileWriter("src/file2.txt");
			bw = new BufferedWriter(fw);
			bw.write(s);
			bw.close();
		} catch (Exception e) {

		}
	}
}