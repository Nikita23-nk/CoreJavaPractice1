package array;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = {10, 45, 23, 78, 12};
		int largest = arr[0];
		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest+ " is the largest element in the arr.");
	}

}
