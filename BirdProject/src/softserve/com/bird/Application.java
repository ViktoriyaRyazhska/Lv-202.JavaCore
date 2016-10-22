package softserve.com.bird;

public class Application {

	public static void main(String[] args) {
		Bird[] birds = { new Eagle(), new Chicken(), new Penguin(), new Swallow() };
		for (int i = 0; i < birds.length; i++) {
			System.out.println(birds[i].fly());
			System.out.println(birds[i]);
		}
	}

}
