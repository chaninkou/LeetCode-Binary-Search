package leetcode704;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		
		int target = 9;
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		BinarySearchFunction solution = new BinarySearchFunction();
		
		System.out.println("Solution: " + solution.search(nums, target));
	}
}
