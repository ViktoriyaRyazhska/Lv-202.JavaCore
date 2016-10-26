package softserve.com.task1;

import java.util.InputMismatchException;

import softserve.com.sours.MyExeption;
import softserve.com.sours.WrapperScanner;

public class Application {

	public static void main(String[] args) {
		Task1 task1 = new Task1();
		try (WrapperScanner scanner = WrapperScanner.getInstance();) {
			System.out.println("Enter two double numbers");
			double a = scanner.getNextDouble();
			double b = scanner.getNextDouble();
			System.out.println(task1.div(a, b));
		} 
		catch(NumberFormatException e){
			System.out.println("You don't enter double number");
		}catch (InputMismatchException e) {
			System.out.println("You don't enter double number");
		} catch (MyExeption e) {
			System.err.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
