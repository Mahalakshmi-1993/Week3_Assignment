package week3.assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
			int arr[]= {1,4,3,2,8,6,7};
			Arrays.sort(arr);//1 2 3 4 6 7 8
			//		0			7
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]!=i+1) {
					System.out.println("Missing Elementn is : "+(i+1));
					break;
					}
				}
		}

}
