package Home_Work5.task1;

public class TestClass {

	public static void main(String[] args) {
		Bird [] birds = new Bird[4];
		
		birds[0] = new Eagle("black featgers", "Yes", 40, "Bald Eagle");
		birds[1] = new Swallow("Blue featgers", "Yes", 30, "Cave Swallow");
		birds[2] = new Penguin("Small featgers", "Yes", 10);
		birds[3] = new Chicken("White feathers", "Many eggs", 8);
		
		for(int i=0; i<birds.length; i++){
			birds[i].fly();
			System.out.println(birds[i]+"\n");
			
		}
		

	}

}
