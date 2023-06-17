package studentManagingSystem;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystemImplements implements StudentManagementSystem {

	Map<String,Student> sdb=new LinkedHashMap<String,Student>();  // sdb
	Scanner scan=new Scanner(System.in);
	
	public void addStudent() {
		System.out.println("Enter Student name :");
		String name=scan.next();

		System.out.println("Enter Student age :");
		int age=scan.nextInt();

		System.out.println("Enter Student marks");
		double marks=scan.nextDouble();

		Student s=new Student(name,age,marks);    //s
		sdb.put(s.getId(), s);
		System.out.println("Student records inserted successfully");
		System.out.println("Student id is :"+s.getId());
		
	}

	public void displayStudent() {
		// TODO Auto-generated method stub
		
	}

	public void displayAllStudent() {
		// TODO Auto-generated method stub
		
	}

	public void removeStudent() {
		// TODO Auto-generated method stub
		
	}

	public void removeAllStudent() {
		// TODO Auto-generated method stub
		
	}

	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}

	public void countStudent() {
		// TODO Auto-generated method stub
		
	}

	public void sortStudent() {
		// TODO Auto-generated method stub
		
	}

}
