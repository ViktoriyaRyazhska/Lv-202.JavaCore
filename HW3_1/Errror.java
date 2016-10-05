import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Errror {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HTTPError error;

		System.out.println("Enter number of error");
		String input = br.readLine();

		switch (input) {
		case "401":
			error = HTTPError.BadRequest;
			System.out.println(error);
			break;
		case "402":
			error = HTTPError.Unauthorized;
			System.out.println(error);
			break;
		case "403":
			error = HTTPError.PaymentRequired;
			System.out.println(error);
			break;
		default:
			System.out.println("I don't know this error :( ");
			break;

		}
	}

}
