package coding_ninja;
import java.util.*;


public class Question2 {
	
	

public static void main(String[]args) {
	System.out.println("Name-Jyotiranjan Mahapatra\nReg. no.- 2241013013\nsec-2241023");
	System.out.println("----------------------------------------------");
	int arr[] = {-9,0,1,57,56,-7,2};
	System.out.println("original array is :-");
	for(int l:arr) {
		System.out.print(l + " ");
	}
	System.out.println();
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
	}
	System.out.println("Maximum number is "+ max + " and minimum number is "+ min);
	
	
		
        }
		
		
		
		

        	
      
		
		
		
		
		
		
	}
		
	


