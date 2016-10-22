package softserve.com.exercise1;

public class Sentence {
	public String enterSentense(){
		System.out.println("Enter sentence of five words.");
		WrapperScanner scanner = WrapperScanner.getInstance();
		return scanner.getNextValue();
	}
	
	public String getLongestWord(String string){
		String[] sArray = string.split(" ");
		String longestWord = sArray[0];
		int max = sArray[0].length();
		for (int i =0;i<sArray.length;i++) {
			if(max<sArray[i].length()){
				longestWord = sArray[i];
				max = sArray[i].length();
			}
		}
		return longestWord;
	}
	
	public int getNumberLetters(String string){
		return getLongestWord(string).length();
	}
	
	public String getReverse (String string, int count){
		String[] sArray = string.split(" ");
		return new StringBuilder(sArray[count-1]).reverse().toString();
	}
}
