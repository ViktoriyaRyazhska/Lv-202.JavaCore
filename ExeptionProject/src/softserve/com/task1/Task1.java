package softserve.com.task1;

import softserve.com.sours.MyExeption;

public class Task1 {
	public double div(double a, double b) throws MyExeption{
		if(b==0){
			throw new MyExeption(" dividing on zero. ");
		}
		return a/b;
	}
	
}
