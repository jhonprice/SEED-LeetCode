package com.seed.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by 若宇 on 2017/9/14.
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        int len = candies.length;
        for(int num : candies){
            kinds.add(num);
        }
        int kindNum = kinds.size();
        if(kindNum>=len/2){
           return len/2;
        }else{
            return kindNum;
        }
    }

    public static void main(String[] args) {
        System.out.println(new DistributeCandies().distributeCandies(new int[]{1,1,1,1,2,2,2,3,3,3}));
    }
}
