package array;

public class Search {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int search = 30;
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
				System.out.println(search+" is found at the index "+i);
			}
		}
		if(found) {
			System.out.println("search element is found.");
		}else {
			System.out.println("search elemnt is not found.");
		}
	}

}
