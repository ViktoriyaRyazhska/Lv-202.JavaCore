import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Homework2 {
	static void month() throws NumberFormatException, IOException{
		int month_days[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of month: ");
		int month = Integer.parseInt(br.readLine());
		month--;
		System.out.print("This month have "+month_days[month]+" days.");
	}
	
	static void summ_or_product() throws NumberFormatException, IOException{
		int nums[] = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 10 nums: ");
		
		
		for (int i=0;i<nums.length;i++){
			nums[i] = Integer.parseInt(br.readLine());
		}
		boolean positive=true;
		for (int i=0;i<5;i++){
			if(nums[i]<0){
				positive = false;
			}
		}
		if (positive){
			int summ=0;
			for (int i=0;i<5;i++){
				summ+=nums[i];
			}
			System.out.println("Summ of first 5 numbers = "+summ);
		} else {
			int product=1;
			for (int i=5;i<nums.length;i++){
				product*=nums[i];
			}
			System.out.println("Product of last 5 numbers = "+product);
		}
	}
	
	static void min_and_positive() throws NumberFormatException, IOException{
		int nums[] = new int[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter 5 nums: ");
		for (int i=0;i<nums.length;i++){
			nums[i] = Integer.parseInt(br.readLine());
		}
		int minIndex=0;
		int positiveCount=0;
		int secondPositiveIndex=0;
		for (int i=0;i<nums.length;i++){
			if (nums[i]<nums[minIndex]){
				minIndex=i;
			}
			if (positiveCount>=2){
				continue;
			} else {
				if (nums[i]>=0){ 
					++positiveCount;}
				}
				if (positiveCount==2){
					secondPositiveIndex=i;
				}
		}
		System.out.println("Minimum number = "+nums[minIndex]+ " in index: "+(minIndex+1));
		if (positiveCount==2){
			System.out.println("Position of second positive number is: "+(secondPositiveIndex+1));
		} else {
			System.out.println("There are not two positive numbers in array");
		}
	}
	
	static void product_until_minus() throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter nums: ");
		int product=1;
		for (;;){
			int userNum = Integer.parseInt(br.readLine());
			if (userNum>0){
				product*=userNum;
			} else {
				System.out.println("Detected unpositive num");
				break;
			}
		}
		if (product!=1){
		System.out.println("Product of nums = "+product);
		} else{
			System.out.println("Nothing to count");
		}
	}
	
	static void show_by_year(Car cars[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("-------------------------\nEnter year: ");
		int year = Integer.parseInt(br.readLine());
		System.out.println("Cars maded in "+year+" year");
		for (int i=0;i<cars.length;i++){
			if (cars[i].year==year){
				//showCar(cars[i]);
				cars[i].show();
			}
		}
		
	}
	static Car[] sortCars(Car cars[]){
		for (int i = 0; i<cars.length;i++){
			int minCarIdx=i;
			Car minCarObj=cars[i];
			for(int s = i;s<cars.length;s++){
				if(cars[minCarIdx].year>cars[s].year){
					minCarIdx=s;
					minCarObj=cars[s];
				}
			}
			cars[minCarIdx]=cars[i];
			cars[i]=minCarObj;
			
			
		}
		return cars;
		
	}
	static void showCars(Car cars[]){
		for (int i=0;i<cars.length;i++){
			cars[i].show();
		}
	}
	public static void main(String[] args) throws IOException {
		
		System.out.println("Ask user to enter the number of month.\n"
				+ "Read the value and write the amount of days in this month (create array with amount days of"
				+ "each month)\n----------------------");
		month();
		
		System.out.println("\n--------------------------\n"
				+ "Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or \n"
				+ "product of last 5 element in the other case.\n");
		summ_or_product();
		
		System.out.println("\n--------------------------\n"
				+ "Enter 5 integer numbers. Find "
				+ "\n- position of second positive number;"
				+ "\n- minimum and its position in the array.\n");
		min_and_positive();
		
		System.out.println("\n--------------------------\n"
				+ "Organize entering integers until the first negative number.\n"
				+ "Count the product of all entered even numbers.\n");
		product_until_minus();
		
		System.out.println("\n--------------------------\n"
				+ "Create class Car with fields type, year of production and engine capacity.\n"
				+ "Create and initialize four instances of class Car. Display cars:\n"
				+ "- certain model year  (enter year in the console);\n"
				+ "- ordered by the field year.\n");

		Car cars[] = new Car[5];
		cars[0] = new Car("mercedes","pickup",2013,4);
		cars[1] = new Car ("BMW","crossover", 2010, 3.3);
		cars[2] = new Car("AUDI","sportcar",2015,3.5);
		cars[3] = new Car("Zaporogets","retrocar",1963,1.2);
		cars[4] = new Car("DeLorean","timecar",2004,3000000);
		
		cars=sortCars(cars);
		showCars(cars);
		show_by_year(cars);
	}
	
	
}
class Car {
	String name;
	String type;
	int year;
	double capacity;
	void show(){
		System.out.println("Car: "+this.name+"  ||  Type: "+this.type+"  ||  Year: "+this.year+"  ||  Capacity: "+this.capacity);
	}
	Car (String n, String t,int y, double c){
		name=n;
		type=t;
		year=y;
		capacity=c;
	}
}
