package com.exercise.task4;

public class RemoveDuplicate {
	public int a[] = { 5, 6, 6, 9, 10, 10, 4, 22 };

	public void removedpl() {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == 0)
					continue;
				else if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				continue;
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {

		RemoveDuplicate rd = new RemoveDuplicate();

		rd.removedpl();
	}

}
