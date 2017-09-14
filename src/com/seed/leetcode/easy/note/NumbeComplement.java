package com.seed.leetcode.easy.note;

/**
 * Created by 若宇 on 2017/9/14.
 */
public class NumbeComplement {
    //TODO:复习二进制正负数,正反补码的概念
    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num)-1);
    }

    public static void main(String[] args) {
        System.out.println(new NumbeComplement().findComplement(5));
    }
}
