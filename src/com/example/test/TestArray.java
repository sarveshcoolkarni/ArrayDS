package com.example.test;
import java.util.*;

import com.example.services.ServiceArray;
public class TestArray {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size: ");
	int size;
	size = sc.nextInt();
	System.out.println("Enter array elements: ");
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i] = sc.nextInt();
	}
	int max = ServiceArray.findMax(arr);
	System.out.println("maximum value is: "+ max);
	
	
	int secondmax = ServiceArray.findSecondMax(arr);
	System.out.println("Second max: " +secondmax);
	
	System.out.println("Minimum value is: " +ServiceArray.findMin(arr));
	
	System.out.println("Addition of sum of prime numbers: " +ServiceArray.findPrime(arr));
	
	System.out.println("Enter value you want to find: ");
	int val = sc.nextInt();
	int pos = ServiceArray.Search(arr, val);
	if(pos!=-1) {
		System.out.println("Element found: " + pos);
	}
	else {
		System.out.println("Element not found");
	}
	

	}
	

}
