import java.util.Scanner;
public class CollegeDegreeDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		CollegeDegree myDegree = new CollegeDegree();
		int option;
		
		do {
			System.out.println("Press 1 to change the major of the degree");
			System.out.println("Press 2 to view the major of the degree");
			System.out.println("Press 3 to add a course to the degree");
			System.out.println("Press 4 to view all the courses required for the degree");
			System.out.println("Press 5 to view the number of courses required for the degree");
			System.out.println("Press 6 to view the total number of credits required for the degree");
			System.out.println("Press 7 to increase the maximum number of courses for all degrees");
			System.out.println("Press 8 to view the maximum number of courses for all degrees");
			System.out.println("Press 9 to the end the program");
			option = keyboard.nextInt();
			
			switch(option) {
			case 1: {
				System.out.println("Major name?");
				String newMajor = keyboard.next();
				myDegree.setMajor(newMajor);
				break;
			}
			case 2: {
				System.out.println(myDegree.getMajor());
				break;
			}
			case 3: {
				System.out.println("Course name?");
				String courseName = keyboard.next();
				System.out.println("Number of credits?");
				int numberOfCredits = keyboard.nextInt();
				myDegree.addCourse(courseName, numberOfCredits);
				break;
			}
			case 4: {
				System.out.println(myDegree.getCourses());
				break;
			}
			case 5: {
				System.out.println(myDegree.getNumberOfCourses());
				break;
			}
			case 6:{
				System.out.println(myDegree.getTotalNumberOfCredits());
				break;
			}
			case 7: {
				System.out.println("New maximum number of courses?");
				int newMaximumNumberOfCourses = keyboard.nextInt();
				CollegeDegree.increaseMaximumNumberOfCourses(newMaximumNumberOfCourses);
				break;
			}
			case 8: {
				System.out.println(CollegeDegree.getMaximumNumberOfCourses());
				break;
			}
			case 9: {
				System.out.println("Goodbye!");
				break;
			}
			default: System.out.println("Error!");
			}
			
		} while(option!=9);
		
		keyboard.close();
	}

}
