package array;

public class Avarge {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum=0;
		double avg=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		avg=(double)sum/arr.length;
		System.out.println(avg+" is the average of an array.");
	}

}
