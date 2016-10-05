package softserve.com.number;

public class Number {
	void checkNumber(float a, float b, float c) {
		if ((-5 <= a) && (a <= 5)&&(-5 <= b) && (b <= 5)&&(-5 <= c) && (c <= 5)) {
			System.out.println("they all belong to the range [-5,5]");
		} else {
			System.out.println("they all don't belong to the range [-5,5]");
		}
	}
	
	void searchMaxMin(int a,int b,int c){
		int[] array = {a,b,c};
		System.out.println("Max = "+searchMax(array)+" Min = "+searchMin(array));
		
		
	}
	
	int searchMax(int array[]){
		int max = array[0];
		for(int i = 1; i<array.length;i++){
			if(max<array[i]){
				max=array[i];
			}
		}
		return max;
	}
	
	int searchMin(int array[]){
		int min = array[0];
		for(int i = 1; i<array.length;i++){
			if(min>array[i]){
				min=array[i];
			}
		}
		return min;
	}
}
