package PrintTable;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		//Ask user for a number
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		
		
		for(int i = 1; i <= 10; i++) {
			int result = n * i;
			System.out.println(n + " x " + i + " = " + result);
			
		}
		
		s.close();
	}

}
