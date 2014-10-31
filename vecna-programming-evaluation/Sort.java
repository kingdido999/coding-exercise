public class Sort {

	public static void main(String[] args) {
		// This code will sort the numbers in the array.
		// task: Modify the algorithm to reverse the sort, then comment on its
		// efficiency in the space //provided below:
		//
		// Comments:
		// This algorithm has a space complexity of O(n^2) because it
		// always compares n times to find a maximum number in the sorted array
		// and there are n numbers need to be sorted.

		int[] unsorted = new int[100];
		for (int i = 0; i < 100; i++)
			unsorted[i] = (int) (Math.random() * 100);
		System.out.println("Here are the unsorted numbers:");
		for (int i = 0; i < 100; i++)
			System.out.print(unsorted[i] + " ");
		System.out.println();

		int[] sorted = new int[100];
    
		// reverse the index of sorted array so that integers will be stored in
		// ascending order
		for (int i = 99; i >= 0; i--) {
			int hi = -1;
			int hiIndex = -1;
			for (int j = 0; j < 100; j++) {
				if (unsorted[j] > hi) {
					hi = unsorted[j];
					hiIndex = j;
				}
			}
			sorted[i] = hi;
			unsorted[hiIndex] = -1;
		}
		System.out.println("Here are the sorted numbers:");
		for (int i = 0; i < 100; i++)
			System.out.print(sorted[i] + " ");
		System.out.println();
	}

}
