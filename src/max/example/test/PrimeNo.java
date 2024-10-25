package max.example.test;

public class PrimeNo {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6,54,77,65,19,23,25,31,26,37,47,43,51,52,53,61,62,63,78,97};
		int sum = findPrime(arr);
		System.out.println(sum);
	}
	public static int findPrime(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
				sum = sum+arr[i];
			}
		}
		return sum;
		
	}
	public static boolean isPrime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}

}
