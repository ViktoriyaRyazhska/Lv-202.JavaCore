import java.io.*;

/**
 * Created by Babajko on 29.10.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        String str = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        FileWriter fw = null;

        int count = 0;
        String theLongestLine  = "";
        String[] arr = new String[50];//List<String> ls = new ArrayList<>();
        try {
            fr = new FileReader("src/file1.txt");
            br = new BufferedReader(fr);
            while ((str = br.readLine()) != null){
                arr[count] = str;
                count++;
                if (theLongestLine.length() < str.length()) theLongestLine = str;
            }
            br.close();
            fr.close();
            String s = "Number of lines in file1.txt:\t" + count + "\n"
                + "The longest line in file1.txt:\n" + "\t" + theLongestLine + "\n"
                + "My name Ruslan and birthday date: 4.08.84";
            fw = new FileWriter("src/file2.txt");
            bw = new BufferedWriter(fw);
            bw.write(s);
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
