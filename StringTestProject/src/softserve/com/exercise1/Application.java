package softserve.com.exercise1;

import softserve.com.exercise2.Sentense2;
import softserve.com.exercise3.USCurrency;

public class Application {
	public static void main(String[] args) {
		Sentence sentence = new Sentence();
		Sentense2 sentense2 =new Sentense2();
		//1.1
		String string = sentence.enterSentense();
		System.out.println(string);
		
		//1.2
		System.out.println(sentence.getLongestWord(string));
		System.out.println(sentence.getNumberLetters(string));
		
		//1.3
		System.out.println(sentence.getReverse(string, 2));
		
		//2.1
		string = sentence.enterSentense();
		System.out.println(string);
		System.out.println(sentense2.getSentense(string));
		
		//3.1
		USCurrency currency = new USCurrency();
		currency.getUSCurrency(currency.enterSentense(),
				currency.enterSentense(),currency.enterSentense());
		
	}
}
