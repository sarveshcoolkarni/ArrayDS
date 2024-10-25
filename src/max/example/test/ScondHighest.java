package max.example.test;

public class ScondHighest {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 12, 4, 5, 13, 14};
		int max=arr[0];
		int secmax = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				secmax = max;
				max=arr[i];
			}
			if(arr[i]>secmax && arr[i]<max) {
				secmax = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secmax);
	}

}
