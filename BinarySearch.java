package com.cn.test;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arry = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		new BinarySearch().binarySearch(arry, 7);
	}

	int binarySearch(int[] arry, int value) {
		if (null == arry || arry.length == 0) {
			return -1;
		}

		int low = 0;
		int high = arry.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (arry[mid] == value) {
				return mid;
			} else if (arry[mid] < value) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] dataset, int data, int beginIndex, int endIndex) {
		int midIndex = (beginIndex + endIndex) / 2;
		if (data < dataset[beginIndex] || data > dataset[endIndex] || beginIndex > endIndex) {
			return -1;
		}
		if (data < dataset[midIndex]) {
			return binarySearch(dataset, data, beginIndex, midIndex - 1);
		} else if (data > dataset[midIndex]) {
			return binarySearch(dataset, data, midIndex + 1, endIndex);
		} else {
			return midIndex;
		}
	}

}
