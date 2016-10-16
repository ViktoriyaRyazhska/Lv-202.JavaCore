
public class Homework3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird birds [] = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};
		for (Bird bird : birds){
			System.out.println("Bird: "+bird.getClass().getName()+"  |  Can fly: "+bird.fly()+"  |  Featgers: "+bird.feathers
					+"  |  layEggs: "+bird.layEggs);
		}
	}

}
abstract class Bird {
	String feathers;
	int layEggs;
	abstract boolean fly();
}
class NonFlyingBird extends Bird {
	boolean fly(){
		return false;
	}
}
class FlyingBird extends Bird {
	boolean fly(){
		return true;
	}
}
class Eagle extends FlyingBird {
	Eagle(){
	feathers = "long";
	layEggs = 3;}
}
class Swallow extends FlyingBird {
	Swallow(){
	feathers = "long";
	layEggs = 6;}
}
class Penguin extends NonFlyingBird {
	Penguin(){
	feathers = "short";
	layEggs = 2;}
}
class Chicken extends NonFlyingBird {
	Chicken(){
	feathers = "middle";
	layEggs = 1;}
}

