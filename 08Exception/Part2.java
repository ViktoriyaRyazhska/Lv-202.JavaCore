package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Part2 {

static int readNumber(int start, int end) throws IOException, badNumException, NumberFormatException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter number: ");
	int num;
	try {
		num = Integer.parseInt(br.readLine());
	} catch (NumberFormatException e) {
		throw e;
	} catch (IOException e) {
		throw e;
	}
	if (num<start || num >end){
		throw new badNumException("Non ranged num");
	}
return num;
	
}	
	public static void main(String[] args) {
			 try {
				System.out.println(readNumber(1,10));
				} 
			 catch (badNumException e) {
					e.printStackTrace();
				}
			 catch (IOException e) {
				 e.printStackTrace();
			}
			 catch (NumberFormatException e) {
				 e.printStackTrace();
			}
	}
}

class badNumException extends Exception {
	public badNumException(String msg) {
	    super(msg);
	  }
}