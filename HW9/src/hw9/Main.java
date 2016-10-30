package hw9;

public class Main {

	public static void main(String[] args)  {
		dilennya d=new dilennya(88, 0);
		try {
			d.div();
			System.out.print(d);
			System.out.println(" = "+ d.div());
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();
		}
		Read r = new Read();
		try {
			
			r.readNumber(10, 20);
			System.out.println(r.readNumber(10, 20));
		} catch (Exception e) {
			System.err.println(e.getMessage());
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

}
