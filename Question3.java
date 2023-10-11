package coding_ninja;

import java.util.Scanner;

public class Question3 {
	public static void reverse(int arr[],int f,int l) {
		while(f<l) {
			arr[f] = arr[f] + arr[l] - (arr[l]=arr[f]);
			f++;
			l--;
		}
	}

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {0,4,8,5,7,2,1};
		System.out.println("original array is :-");
		for(int l:arr) {
			System.out.print(l + " ");
		}
		System.out.println();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter possition");
		int p = sc.nextInt();
		reverse(arr,0,(p % arr.length)-1);
		for(int i:arr) {
			System.out.print(i + " ");
		}
		

	}

}
