package leetcode704;

public class BinarySearchFunction {
	public int search(int[] nums, int target) {
        if(nums == null){
            return -1;
        }
        
        if(nums.length == 1 && nums[0] == target){
            return 0;
        }
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int mid = (start + end)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid] > target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return -1;
    }
}
