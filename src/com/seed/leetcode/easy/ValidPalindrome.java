package com.seed.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by 若宇 on 2017/9/18.
 */
public class ValidPalindrome {

    //TODO:栈方法失灵？
    public boolean isPalindrome(String s) {
        String actual = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }


    public static void main(String[] args) {
        System.out.println(new ValidPalindrome().isPalindrome("aabaa"));
    }
}
