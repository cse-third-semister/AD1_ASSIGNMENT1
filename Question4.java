package coding_ninja;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int mul = 1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int b = sc.nextInt();
		if(b==0) {
			System.out.println("factorial of  "+ b + " is " + 1);
		}
		else {
			for(int i=1;i<=b;i++) {
				mul = mul * i;
				} 
				System.out.println("factorial of "+ b + " is " + mul);
		}
		


}
}