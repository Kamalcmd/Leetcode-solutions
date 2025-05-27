package easy;

//Problem: https://leetcode.com/problems/two-sum/description/
//Tags: Array, HashMap
//Approach: Brute-force / HashMap
//Time: O(n^2)/ O(n), Space: O(n)

//Given an array of integers nums and an integer target,
//        return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution,
//        and you may not use the same element twice.
//
//        You can return the answer in any order.

import java.util.HashMap;

public class TwoSum_0001 {

    //Brute Force O(n^2)
//    public int[] twoSum(int[] nums, int target){
//        for(int i = 0; i < nums.length; i++){
//            for(int j= i+1; j < nums.length; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        return new int[]{};
//    }


    //Optimized method O(n)
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{};
    }

    public static void main(String[] args){
        TwoSum_0001 obj = new TwoSum_0001();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        printResult(obj.twoSum(nums1, target1));

        int[] num2 = {3, 2, 4};
        int target2 = 6;
        printResult(obj.twoSum(num2, target2));

        int[] num3 = {3,3};
        int target3 = 6;
        printResult(obj.twoSum(num3, target3));
    }

    private static void printResult(int[] result){
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
