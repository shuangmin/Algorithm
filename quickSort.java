package com.cn.review;

public class quickSort {
	public static void main(String[] args) {
		int[] array = { 56, 74, 32, 3, 45, 7, 84, 32, 76, 4, 321 };
		new quickSort().sort(array,0,array.length-1);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i] + " ");
		}
	}

	void sort(int[] arry, int start, int end) {

		if (start < end) {
			int k = partition(arry, start, end);
			sort(arry, start, k - 1);
			sort(arry, k + 1, end);
		}
	}

	private int partition(int[] arry, int start, int end) {
		int provit = (start + end) / 2;
		int value = arry[provit];
		int ken = provit;
		int i = start;
		int j = end;
		while (i < j) {

			while (i < j && arry[j] > value)
				j--;

			arry[ken] = arry[j];
			ken = j;

			while (i < j && arry[i] <= value)
				i++;

			arry[ken] = arry[i];
			ken = i;
		}

		arry[ken] = value;
		return ken;
	}

}
