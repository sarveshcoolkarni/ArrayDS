package com.example.services;

public class ServiceArray {

	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int findSecondMax(int[] arr) {
		int max = arr[0];
		int max1 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max1 = max;
				max = arr[i];
			}
			if(arr[i]>max1 && arr[i]<max) {
				max1 = arr[i];
			}
		}
		return max1;
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
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

	public static int Search(int[] arr, int val) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==val) {
				return i;
			}
		}
		return 0;
	}

	public static int BinarySearch(int[] arr, int l, int h, int num) {
		int low = l;
		int high = h;
		if(low<=high) {
			int mid = (low+high)/2;
			System.out.println("Low " +low +" Mid "+mid+" High "+high);
			if(arr[mid] == num) {
				return mid;
			}
			else if(num<arr[mid]){
				return BinarySearch(arr, low, mid-1, num);
			}
			else if(num>arr[mid]) {
				return BinarySearch(arr, mid+1, high, num);
			}
			
		}
		return 0;
	}
	public static int[] sortArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp=0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] =arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
