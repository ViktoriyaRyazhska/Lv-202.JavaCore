
public class Main {

	public static void main(String[] args) {
		Bird birds [] = new Bird[4] ;
		birds[0] = new Penquin(false, true);
		birds[1] = new Chicken(true, true);
		birds[2] = new Swallow(true, true);
		birds[3] = new Eagle(true, true);
		
		
		for (int i = 0; i < birds.length; i++) {
			if (birds[i] instanceof FlyingBirds ){
				
				System.out.print("I am a " + birds[i]);
				birds[i].fly();
			} else  System.out.println("I'm a " + birds[i]);
			
		}

	}

}
