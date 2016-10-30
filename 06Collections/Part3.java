package Collections;

import java.util.Iterator;
import java.util.List;

public class Part3 {
	
	void printStudents(List <Student> students, Integer course){
		Iterator it = students.iterator();
		while(it.hasNext()){
			if (it.next().course==course){
				System.out.println("Student: "+it.name+" , course: "+it.course);
			}
		}
	}
	
	public static void main(String[] args) {
		Student me = new Student(1, "Taras");
		
	}
}


class Student{
	int course=0;
	String name;
	Student(int course, String name){
		course = this.course;
		name = this.name;
	}
	public int  getFields(){
		return course;
	}
	
	
}