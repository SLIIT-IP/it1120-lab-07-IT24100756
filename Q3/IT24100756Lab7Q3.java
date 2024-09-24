import java.util.Scanner;
	public class IT24100756Lab7Q3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double totalBill, discount, amountToPay;
		char paymentMode;

		for(int i = 1; i <= 5; i++){
		System.out.println("Customer " + i);

		
		System.out.print("Enter total bill amount: ");
		totalBill = scanner.nextDouble();

		System.out.print("Enter mode of payment (C for cash O for other): ");
		paymentMode = scanner.next().charAt(0);

		discount = 0;
		if (paymentMode == 'C' || paymentMode == 'c'){
			discount = totalBill * 0.05; }
		else if (paymentMode == 'O' || paymentMode == 'o'){
			System.out.println("No discount applicabke"); }
		else {
			System.out.println("payment mode is not valid");
			continue;
		}
		amountToPay = totalBill - discount;
		System.out.println("Discount is: "+ discount);
		System.out.println("Amount to be paid: " +amountToPay);
		}
	scanner.close();
	}
}
		