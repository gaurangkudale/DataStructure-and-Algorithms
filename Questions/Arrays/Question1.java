/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */

package Arrays;
public class Question1 {

    public static int[] twoSum(int [] nums, int target){
        int n = nums.length;

        int [] res = new int[2];
        for(int i =0; i<n ; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    public static void main(String[] args){
        int [] a = {1,2,4,5,6,7,5,7,8};
        int target = 10;
        Question1 q = new Question1();

        System.out.println(q.twoSum(a,target));
    }
}
