package less_generic_collection_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import	java.util.*;


public class main_student {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		
		ArrayList<Student> student = new ArrayList<>();
		student.add(new Student("vasja", 1));
		student.add(new Student("sem", 2));
		student.add(new Student("masha", 1));
		student.add(new Student("aveta", 3));
		student.add(new Student("valja", 2));
		daniStudent(student);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input course");
		int course_console=Integer.parseInt(br.readLine());
		
		printStudent(student, course_console);
		
		System.out.println("compare name");
		student.sort(new nameComperator());
		daniStudent(student);
		
		System.out.println("compare course");
		student.sort(new course_Comperator());
		daniStudent(student);
		}
		
	public static void printStudent(ArrayList student, int course){
		Iterator<Student> iterator = student.iterator();
		while(iterator.hasNext()){
			Student std =iterator.next();
			if(std.getCourse()==course){
				System.out.println("course " +course+" student "+std.getName());
				}	
		}
	}
	public static void daniStudent(ArrayList student){
		System.out.println(student);
		}
	}
		
