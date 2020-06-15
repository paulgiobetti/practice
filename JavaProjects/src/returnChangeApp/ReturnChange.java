package returnChangeApp;

import java.util.Scanner;

public class ReturnChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Change receipt = new Change();
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter payment amount: $");
		long payment = in.nextLong();
		System.out.println(receipt.calculateOptimalChange(payment));
	}

}
