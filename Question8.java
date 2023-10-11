package coding_ninja;
import java.util.*;

public class Question8 {
	
	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		int n = sc.nextInt();
		System.out.println("Fibonacci numbers is");
	
		int arr[] = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int a:arr) {
			System.out.print(a + " ");
		}
	
	
		

	}

}
