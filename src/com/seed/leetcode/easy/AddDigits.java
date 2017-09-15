package com.seed.leetcode.easy;

/**
 * Created by 若宇 on 2017/9/14.
 */
public class AddDigits {
    //TODO:学习证明过程
    public int addDigits(int num) {
        return num==0?0:(num%9==0?9:(num%9));
    }
}
