package less3_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main_http {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input kod http_error");
		switch (Integer.parseInt(br.readLine())) {
		case 400:
			System.out.println(HttpError.bad_http);
			break;
			
		case 401:
			System.out.println(HttpError.bad_ssylka);
			break;
			
		case 402:
			System.out.println(HttpError.not_name);
			break;
			
		case 403:
			System.out.println(HttpError.not_page);
			break;
		default:
			break;
		}

	}

}
