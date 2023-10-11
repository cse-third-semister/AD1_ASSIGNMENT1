package coding_ninja;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {-3,-2,-1,2,3,4,5};
		System.out.println("original array is :-");
		for(int l:arr) {
			System.out.print(l + " ");
		}
		System.out.println();
		ArrayList <Integer> obj = new ArrayList<>();
		for(int a:arr) {
			obj.add(a);
		}
		for(int i=1;i<arr.length;i++) {
			if(obj.contains(i) == false) {
				System.out.print("Missing number is "+ i);
				break;
			}
		}

	}

}
