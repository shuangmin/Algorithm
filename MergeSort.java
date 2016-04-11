package com.cn.review;

public class MergeSort {
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11};
		int[] b = {2,4,6,8,10,12,23,45};
		int[] c = new int[a.length + b.length];
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;

		while (aIndex < a.length && bIndex < b.length) {
			c[cIndex++] = a[aIndex] <= b[bIndex] ? a[aIndex++] : b[bIndex++];
		}
		
		if(aIndex == a.length)
		{
			while (cIndex < c.length) {
				c[cIndex++] = b[bIndex++];
			}
		}
		else if(bIndex == b.length)
		{
			while (cIndex < c.length) {
				c[cIndex++] = a[aIndex++];
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
