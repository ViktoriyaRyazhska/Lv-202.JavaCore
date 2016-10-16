package softserve.com.bird;

public class Application {

	public static void main(String[] args) {
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle();
		birds[1] = new Chicken();
		birds[2] = new Penguin();
		birds[3] = new Swallow();
		for (int i = 0; i < birds.length; i++) {
			System.out.println(birds[i].fly());
		}
	}

}
