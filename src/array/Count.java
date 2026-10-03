package array;

public class Count {
	public static void main(String[] args) {
		int[] arr = {10, 15, 22, 7, 30, 41};
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println(even+" is the count of even numbers in an array.");
		System.out.println(odd+" is the count of odd numbers in an array.");
	}

}
