import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrade {
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);




System.out.println("How many students do you have?");

int numOfStudents = scanner.nextInt();
int[] scores = new int[numOfStudents];
String [] names = new String[numOfStudents];

System.out.println("How many subjects do they offer?");
int numOfSubjects = scanner.nextInt();

System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Saved Successfully");


System.out.println("Entering score for student " + (1) + "  ");
for (int i = 0; i <= numOfStudents; i++) {
	scanner.nextLine();
for (int j = 0; j <= numOfSubjects; j++) {
	System.out.print("Enter score for subject " + (j + 1) + " : ");
	scores[i] = scanner.nextInt();
	System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Saved Successfully");
    System.out.println("Enter score for student " + (j + 1) + "  ");
	}
   }

System.out.print("=========================================================================");
System.out.printf("%10s%10s%10s%10s\n", "Student", "Sub1", "Sub2", Sub  "TOTAL" );
	}
}