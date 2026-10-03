package box6;

import java.util.Scanner;

public class ExceptionExmpl3 {
	public static void main(String[] args) {
		System.out.println("Main start");
		int[] arr = {20,40,60,80,50};
		//length --> 5     index = 0-4
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Index of Element in an array");
		int n = sc.nextInt();
		try {
			System.out.println(arr[n]);
      	}catch(ArrayIndexOutOfBoundsException a1) {
      		System.out.println("uss word mein itne letters hai kya bee takle... ");
      	}
		System.out.println("main end");
}
}