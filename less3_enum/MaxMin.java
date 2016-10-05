package less3_2;

import java.io.BufferedReader;
import java.io.IOException;

public class MaxMin {
	
	public int Max(int a, int b, int c) {
		int max=a;
		if (max<b){
			max=b;
		}
		if (max<c){
			max=c;
		}

		return max;
		
	}
	public int Min(int a, int b, int c){
		int min=a;
		if (min>b){
			min=b;
		}
		if (min>c){
			min=c;
		}
		return min;
		
		
	}

}
