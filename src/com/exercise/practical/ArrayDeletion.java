package com.exercise.practical;

public class ArrayDeletion {

	public static void main(String[] args) {
		int[] arr = new int[10];
		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
		int n = 5;
		// int delIndex = 3;

		int remEle = 8;
		for (int i = 0; i < n; i++) {
			if (arr[i] == remEle) { //5 6 7 8 9 8 8 = 5 6 7 9 8 8 8 = 5 6 7 9 8 8 
				int delIndex = i; 

				for (int j = delIndex ; j < n - 1; j++) { 
					arr[j] = arr[j + 1];
				}
				n--;
				i--;
			}

		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}
}
