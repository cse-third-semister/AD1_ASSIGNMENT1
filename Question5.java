package coding_ninja;

public class Question5 {

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {1,2,3,4,5,6};
		System.out.println("original array is :-");
		for(int l:arr) {
			System.out.print(l + " ");
		}
		System.out.println();
		int arr2[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i] = arr[i];
		}
		int st = 0;
		int sp = arr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(i  % 2 == 0) {
				arr[i] = arr2[sp];
				sp--;
			}
			else {
				arr[i] = arr2[st];
				st++;
				
			}
		}
		System.out.println("max min array is");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	

	}

}
