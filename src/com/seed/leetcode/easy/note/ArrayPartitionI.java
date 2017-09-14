package com.seed.leetcode.easy.note;

import java.util.Arrays;

/**
 * Created by 若宇 on 2017/9/13.
 */
public class ArrayPartitionI {
    //TODO:复习此题的证明
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
