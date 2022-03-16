package com.exercise.practical;

public class ArrayInsertion {

	public static void main(String[] args) {
		int[] arr = new int[10];
	   // arr = {5,6,7,8,9,10};
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
		int n = 5;
		int insertionEle = 10;
		int insIndex = 3;

		for(int i=n-1; i >= insIndex-1;i--){
			arr[i+1] = arr [i]; //5 6 7 8 9 = 5 6 7 8 9 9 = 5 6 7 8 8 9 = 5 6 7 7 8 9
		}  //5 6 7 8 9 = 5 6 8 8 9 = 5 6 8 9 9 
        n++; 
		arr[insIndex-1] = insertionEle;
		
		for(int i =0; i<n; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
