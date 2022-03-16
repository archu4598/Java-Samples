package com.exercise.task4;

public class Sorting {

	public int a[] = { 5, 6, 2, 9, 10, 32, 4, 22, -1, -2};
	public int b;

	public void sort() {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					b = a[i];
					a[i] = a[j];
					a[j] = b;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		Sorting sorting = new Sorting();

		sorting.sort();
	}

}
