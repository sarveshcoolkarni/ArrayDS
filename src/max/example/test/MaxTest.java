package max.example.test;

public class MaxTest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		int max=arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);		
		

	}

}
