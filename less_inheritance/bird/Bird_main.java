package less_Inheritance_01;

public class Bird_main {
	public static void main(String[] args) {
		Bird [] bird = new Bird[4];
		bird[0]= new Eagle(true, true, "eagle");
		bird[1]= new Swallow(true, true, "swalow");
		bird[2]= new Penguin(false, true, "penguin");
		bird[3]= new Chicken(true, true, "chicken");
		
		for (int i = 0; i < bird.length; i++) {
			System.out.print(bird[i]);
			bird[i].printBird();
			bird[i].fly();
		
		}
	}	
}
