package problem;
/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class problem1 {
	 public int[] twoSum(int[] nums, int target) {
		 for(int x = 0; x <= nums.length;x++){
			 int min = target - nums[x];
			 for(int y = x+1; y <= nums.length; y++) {
				 if(min == nums[y]) {
					 return new int[] {x,y};
				 }
			 }
		 }
		 throw new IllegalArgumentException("No two sum solution");
	 }
}
