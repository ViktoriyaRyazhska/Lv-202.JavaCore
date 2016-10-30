package hw8;

public class Main {

	public static void main(String[] args) {
		ex1 sentence = new ex1();
		 		ex2 sentense2 =new ex2();
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
		 		dollar currency = new dollar();
		 		currency.getUSCurrency(currency.enterSentense(),
		 				currency.enterSentense(),currency.enterSentense());

	}

}
