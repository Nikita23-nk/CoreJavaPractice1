package array;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = {10, 45, 23, 78, 12};
		int largest=arr[0];
		int secondLargest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
	            secondLargest=largest;
				largest=arr[i];
			}	else if(arr[i]>secondLargest && arr[i]!=largest ) {
				secondLargest=arr[i];
			}
		}
		System.out.println(largest+" is largest num");
		System.out.println(secondLargest+" is SecondLargest num");
	}

}
