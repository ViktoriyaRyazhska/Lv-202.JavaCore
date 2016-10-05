package Home_Work3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_c {
	
	public static void main(String[] args)  throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of HTTP Error");
		int number = Integer.parseInt(reader.readLine());
		
		switch(number)
		{
		case 400: 
			System.out.println(HTTPError.BAD_REQUEST);
			break;
		case 401: 
			System.out.println(HTTPError.UNAUTHORIZED);
			break;
		case 402:
			System.out.println(HTTPError.PAYMENT_REQUIRED);
			break;
		case 403:
			System.out.println(HTTPError.FORBIDDEN);
			break;
		case 404:
			System.out.println(HTTPError.NOT_FOUND);
			break;
		case 405:
			System.out.println(HTTPError.METHOD_NOT_ALLOWED);
			break;
		case 406: 
			System.out.println(HTTPError.NOT_ACCEPTABLE);
			break;
		case 407: 
			System.out.println(HTTPError. PROXY_AUTHENTICATION_REQUIRED );
			break;
		case 408: 
			System.out.println(HTTPError.REQUEST_TIMEOUT);
			break;
		case 409: 
			System.out.println(HTTPError.CONFLICT);
			break;
		case 410: 
			System.out.println(HTTPError.GONE);
			break;
		case 411: 
			System.out.println(HTTPError.LENGTH_REQUIRED);
			break;
		case 412: 
			System.out.println(HTTPError.PRECONDITION_FAILED);
			break;
		case 413: 
			System.out.println(HTTPError.PAYLOAD_TOO_LARGE);
			break;
		case 414: 
			System.out.println(HTTPError.URI_TOO_LONG);
			break;
		case 415: 
			System.out.println(HTTPError.UNSUPPORTED_MEDIA_TYPE);
			break;
		case 416: 
			System.out.println(HTTPError.RANGE_NOT_SATISFIABLE);
			break;
		case 417: 
			System.out.println(HTTPError.EXPECTATION_FAILED);
			break;
		case 418: 
			System.out.println(HTTPError.I_M_A_TEAPOT);
			break;
		case 421: 
			System.out.println(HTTPError.MISDIRECTED_REQUEST);
			break;
		case 422: 
			System.out.println(HTTPError.UNPROCESSABLE_ENTITY );
			break;
		case 423: 
			System.out.println(HTTPError.LOCKED);
			break;
		case 424: 
			System.out.println(HTTPError.FAILED_DEPENDENCY);
			break;
		case 426: 
			System.out.println(HTTPError.UPGRADE_REQUIRED);
			break;
		case 428: 
			System.out.println(HTTPError.PRECONDITION_REQUIRED);
			break;
		case 429: 
			System.out.println(HTTPError.TOO_MANY_REQUESTS);
			break;
		case 431: 
			System.out.println(HTTPError.REQUEST_HEADER_FIELDS_TOO_LARGE);
			break;
		default:
		System.out.println("UnKnown Error!");
		break;
		}
		
		
	}

}
 enum HTTPError{BAD_REQUEST,
	 UNAUTHORIZED, 
	 PAYMENT_REQUIRED,
	 FORBIDDEN,
	 NOT_FOUND,
	 METHOD_NOT_ALLOWED,
	 NOT_ACCEPTABLE,
	 PROXY_AUTHENTICATION_REQUIRED, 
	 REQUEST_TIMEOUT,
	 CONFLICT,
	 GONE,
	 LENGTH_REQUIRED,
	 PRECONDITION_FAILED,
	 PAYLOAD_TOO_LARGE, 
	 URI_TOO_LONG, 
	 UNSUPPORTED_MEDIA_TYPE,
	 RANGE_NOT_SATISFIABLE,
	 EXPECTATION_FAILED, 
	 I_M_A_TEAPOT,
	 MISDIRECTED_REQUEST,
	 UNPROCESSABLE_ENTITY,
	 LOCKED, 
	 FAILED_DEPENDENCY, 
	 UPGRADE_REQUIRED,
	 PRECONDITION_REQUIRED,
	 TOO_MANY_REQUESTS, 
	 REQUEST_HEADER_FIELDS_TOO_LARGE 
};
