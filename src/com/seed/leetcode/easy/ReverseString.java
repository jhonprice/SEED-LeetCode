package com.seed.leetcode.easy;

/**
 * Created by 若宇 on 2017/9/13.
 */
public class ReverseString {
    private String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i=s.length()-1;i >= 0;i--){
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseString().reverseString("abc"));
    }
}
