package task_1;

public class Main {

	public static void main(String[] args) {

		Bird[] br = new Bird[4];
		
		br[0]=new Eagle("Black", "yes", 1000, "Гоша");
		br[1]=new Swallow("Gray", "yes", 20, "Masha");
		br[2]=new Pinguin("Black and White", "yes", 5);
		br[3]=new Chicken("White", "yes", 10);
		
		for (int i = 0; i < br.length; i++) {
			br[i].fly();
			System.out.println(br[i]);
			
		}
	}

}
