package studentManagingSystem;

import java.util.Scanner;

public class SolutionSTD {
	public static void main(String[] args) {

		//To accept inputs from user 
		Scanner scan=new Scanner(System.in);

		//UpCasting for achieving abstraction
		StudentManagementSystemImplements sms=new StudentManagementSystemImplements();

		System.out.println("Welcome to Student DataBase Project ");

		System.out.println("<-------------------------------------->");

		while(true) {
			System.out.println("1:Add Student\n2:Display Student");
			System.out.println("3:Display All Student\n4:Remove Student");
			System.out.println("5:Remove All Student\n6:Update Student");
			System.out.println("7:Count Student\n8:Sort Student");
			System.out.println("9:Exit\nEnter Choice");
			int choice=scan.nextInt();

				switch(choice) {
				case 1:sms.addStudent();
				break;
				case 2:sms.displayStudent();
				break;
				case 3:sms.displayAllStudent();
				break;
				case 4:sms.removeStudent();
				break;
				case 5:sms.removeAllStudent();
				break;
				case 6:sms.updateStudent();
				break;
				case 7:sms.countStudent();
				break;
				case 8:sms.sortStudent();
				break;
				case 9:System.out.println("ThankYou.....!!");
					System.exit(0);
				default : 
					try {
						throw new Exception("Invalid Choice Entered");
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					} 
				}
				System.out.println("<------------------------>");
			}
				
			}
	}