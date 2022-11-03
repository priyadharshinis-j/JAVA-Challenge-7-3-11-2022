package javaChallenge7;

import java.util.Scanner;

//Java Problem (7/20)
//
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true


public class RepetitiveNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		
		int[] nums = new int[size];
		System.out.println("============================");
		System.out.println("Enter the array values");
		for (int i=0;i<size;i++)
		{
			nums[i]=sc.nextInt();
		}
		sc.close();
		int count=0;
		for(int i=0 ;i<size;i++)
		{
			
			for(int j=1;j<size;j++)
			{
				if(nums[i]==nums[j]&&i!=j)
				{
					count++;
				}
				
			}
			
		}
		if(count>=1)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		
	}

}
