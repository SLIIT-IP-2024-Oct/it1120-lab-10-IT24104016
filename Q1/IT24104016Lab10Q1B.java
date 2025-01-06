import java.util.Scanner;

public class MarkValidator {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

              System.out.print("Enter the mark (0 to 100): ");
        int mark = scanner.nextInt();

        assert mark >= 0 && mark <= 100 : "Invalid Mark";
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

       
        assert (mark >= 75 && grade == 'A') || 
               (mark >= 60 && mark < 75 && grade == 'B') ||
               (mark >= 50 && mark < 60 && grade == 'C') ||
               (mark >= 40 && mark < 50 && grade == 'D') ||
               (mark < 40 && grade == 'F') : "Incorrect Grade Assigned";

        
        System.out.println("Mark is Validated");
        System.out.println("The assigned grade is: " + grade);


        scanner.close();
    }
}
