package coding_ninja;

public class Question7 {

	public static void main(String[] args) {
		System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
		System.out.println("----------------------------------------------");
		int arr[] = {-3,-2,4,1,0,-3};
		System.out.println("original array is :-");
		for(int l:arr) {
			System.out.print(l + " ");
		}
		System.out.println();
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum =  sum + arr[i];
			if(sum<0) {
				sum  = 0;
			}
			max = Math.max(sum, max);
			
			
		}
		System.out.println("sum of Maximum Contigious sub array is "+ max);

	}

}
