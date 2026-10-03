package array;

public class Smallest {
	public static void main(String[] args) {
		int[] arr = {10, 45, 23, 78, 12};
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
	        if(smallest>arr[i]) {
	        	smallest=arr[i];
	        }
		}
		System.out.println(smallest+" is the smallest element in array.");
	}

}
