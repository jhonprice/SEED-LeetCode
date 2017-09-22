package com.seed.leetcode.easy;

import jdk.nashorn.internal.ir.LocalVariableConversion;

/**
 * Created by 若宇 on 2017/9/19.
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        String ss = new StringBuffer(s).reverse().toString();
        //TODO:
        //System.out.println(LCS(s,ss));
        return false;
    }

    public static void main(String[] args) {
        new ValidPalindromeII().validPalindrome("abca");
    }
}
