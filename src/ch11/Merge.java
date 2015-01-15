/*
 * 11.1
 * You are given two sorted arrays, A and B, where A has a large
 * enough buffer at the end to hold B. Write a method to merge
 * into A in sorted order.
 */

package ch11;

public class Merge {
	public int[] merge(int[] a, int[] b, int lastA, int lastB) {
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastB + lastA - 1;

		while (indexB >= 0) {
			if (indexA >= 0 && a[indexA] > b[indexB]) {
				a[indexMerged] = a[indexA];
				indexA--;
			} else {
				a[indexMerged] = b[indexB];
				indexB--;
			}
			indexMerged--;
		}

		return a;
	}
}
