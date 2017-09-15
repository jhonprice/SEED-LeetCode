package com.seed.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 若宇 on 2017/9/15.
 */
public class ReshapeMatrix {
    //16ms
    List<Integer> init(int[][] nums){
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                list.add(nums[i][j]);
            }
        }
        return list;
    }
    int[][] resharp(List<Integer> list,int r,int c){
        int[][] result = new int[r][c];
        int rr =0;
        int cc =0;
        for(int num : list){
            result[rr][cc]=num;
            cc++;
            if(cc>=c){
                cc=0;
                rr++;
            }
            if(rr>=r){
                break;
            }
        }
        return result;
    }
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        List<Integer> list = init(nums);
        if(list.size()!=(r*c)){
            return nums;
        }
        else{
            return resharp(list,r,c);
        }
    }
}
