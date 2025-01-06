import java.util.Scanner;

public class IT24104016Lab10Q1A {
    public static void main(String[] args) {
      
               Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the mark (0 to 100): ");
        int mark = scanner.nextInt();

       
        assert mark >= 0 && mark <= 100 : "Invalid Mark";

        
        System.out.println("Mark is Validated");

       
        scanner.close();
    }
}
