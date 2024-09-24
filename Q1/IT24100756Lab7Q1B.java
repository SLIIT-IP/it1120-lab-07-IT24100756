import java.util.Scanner;

public class IT24100756Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

      
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.println("Enter marks: ");

        
            int mark1 = scanner.nextInt();
            int mark2 = scanner.nextInt();
            int mark3 = scanner.nextInt();
            int mark4 = scanner.nextInt();

         
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

           
            System.out.println("Average: " + average);
            System.out.println("Grade: " + getGrade(average));
            System.out.println();
        }

       
        scanner.close();
    }

 
    public static String getGrade(double average) {
        if (average >= 75) {
            return "Distinction";
        } else if (average >= 50) {
            return "Credit";
        } else {
            return "Fail";
        }
    }
}
