package Default;

import java.util.Scanner;

public class Tute1Qu1 {
	public static void main(String[] args) {

		int num;
		int sum = 0;
		int count = 0;
		int average = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a valid positive number : ");
		while(true) {
			num =sc.nextInt();
			if(num < 0) {
				System.out.println("Its a negative number enter again from beginning! ");
				break;
			}
		sum += num;
		
		count ++;
		
		}
		System.out.println("The sum of entered numbers : "+sum);
		
		average = sum/2;
		System.out.println("The Average of entered numbers : "+average);
	}

}
