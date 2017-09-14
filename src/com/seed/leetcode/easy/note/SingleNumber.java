package com.seed.leetcode.easy.note;

import java.util.Arrays;

/**
 * Created by 若宇 on 2017/9/14.
 */
public class SingleNumber {
    //TODO:666
    public int singleNumberSample(int[] nums){
        int res = 0;
        for (int n : nums) res ^= n;
        return res;
    }
    public int singleNumber(int[] nums) {
        int[] book = new int[290000000];
        int[] book2 = new int[290000000];
        for(int num : nums){
            if(num>=0)
                book[num]++;
            else
                book2[-num]++;
        }
        for(int i=0;i<book.length;i++){
            if(book[i]==1) return i;
        }
        for (int i=0;i<book2.length;i++){
            if(book2[i]==1) return i*-1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
