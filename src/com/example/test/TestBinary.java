package com.example.test;
import java.util.*;

import com.example.services.ServiceArray;
public class TestBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter size of an array: ");
		size = sc.nextInt();
		System.out.println("Enter array elements: ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		String res = "";
		do {
			System.out.println("Enter the number you want to search: ");
			int num = sc.nextInt();
			int arr1[] = new int[size];
			arr1 = ServiceArray.sortArray(arr);
			for(int i=0; i<arr1.length; i++) {
				System.out.println(arr1[i]);
			}
			int ans = ServiceArray.BinarySearch(arr1, 0, arr1.length-1, num);
			if(ans!=-1) {
				System.out.println(ans);
			}
			else {
				System.out.println("Element not found: ");
			}
			System.out.println("Do you want to continue:(yes/no)");
			res = sc.next();
		}while(res.equals("yes"));

	}


}
