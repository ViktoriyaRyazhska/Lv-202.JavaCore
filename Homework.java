import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Homework {
	static double perimeterCalc(double radius){
		return (Math.PI*radius*2);
	}
	static double areaCalc(double radius){
		return (Math.PI*Math.pow(radius, 2));
	}
	
	static double moneyPhone(double price, double sec){
		return((price/60)*sec);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius of Flower bed: ");
        double radius = Double.parseDouble(br.readLine());
        System.out.println("Perimeter of Flower bed: " +perimeterCalc(radius));
        System.out.println("Area of Flower bed: " +areaCalc(radius));
        
        String name;
        int age;
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("Enter your age: ");
        age = Integer.parseInt(br.readLine());
        String adress;
        System.out.println("Where are you live, "+name+"?");
        adress = br.readLine();
        System.out.println("Contact information: \nName: "+name+"\nAge: "+age+"\nAdress: "+adress);
        
        double c1,c2,c3,t1,t2,t3;
        System.out.println("Enter country 1 price: ");
        c1 = Double.parseDouble(br.readLine());
        System.out.println("Enter country 2 price: ");
        c2 = Double.parseDouble(br.readLine());
        System.out.println("Enter country 3 price: ");
        c3 = Double.parseDouble(br.readLine());
        System.out.println("Seconds talking with 1 country: ");
        t1 = Double.parseDouble(br.readLine());
        System.out.println("Seconds talking with 2 country: ");
        t2 = Double.parseDouble(br.readLine());
        System.out.println("Seconds talking with 3 country: ");
        t3 = Double.parseDouble(br.readLine());
        double c1price = moneyPhone(c1, t1);
        double c2price = moneyPhone(c2, t2);
        double c3price = moneyPhone(c3, t3);
        System.out.println("Country 1 call count of: "+c1price+" dollars");
        System.out.println("Country 2 call count of: "+c2price+" dollars");
        System.out.println("Country 3 call count of: "+c3price+" dollars");
        System.out.println("All talk togetger cost: "+(c1price+c2price+c3price)+" dollars");

	}
	
}
