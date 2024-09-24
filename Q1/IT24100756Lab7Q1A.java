import java.util.Scanner;
	public class  IT24100756Lab7Q1A {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		
			int mark1, mark2, mark3, mark4;
			double average;

			System.out.println("Enter marks for four subjects:");
			System.out.print("Enter subject mark 1: ");
			mark1 = scanner.nextInt();

			System.out.print("Enter subject mark 2: ");
			mark2 = scanner.nextInt();

			System.out.print("Enter subject mark 3: ");
			mark3 = scanner.nextInt();

			System.out.print("Enter subject mark 4: ");
			mark4 = scanner.nextInt();

			average = (mark1 + mark2 + mark3 + mark4) / 4.0;

			System.out.println("Average is: " + average);
			System.out.println("overall grade is: " + getgrade(average));
		
	
}
			public static String getgrade(double average) {
				if (average >= 75){
				return "Distinction"; }
				else if (average >= 50)	{
				return "credit"; }
				else {
				return "Fail" ;
		}
	}

}