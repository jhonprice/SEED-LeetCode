package com.seed.leetcode.easy;

import java.util.Arrays;

/**
 * Created by 若宇 on 2017/9/13.
 */
public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i =0;i<nums.length/2;i++){
            int tmp = nums[i]-nums[nums.length-1-i];
            sum+=(tmp==0?nums[i]:tmp);
        }
        return sum;
    }
}
