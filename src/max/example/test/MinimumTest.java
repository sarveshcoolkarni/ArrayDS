package max.example.test;

public class MinimumTest {

	public static void main(String[] args) {
		int []arr= {5,6,7,8,3,9,4};
		int n=arr.length;
		int minimum=arr[0];
		for(int i=0; i<n;i++) {
			if (arr[i]<minimum) {
				minimum=arr[i];
			}
		}
		System.out.println(minimum);
				
	}

}
