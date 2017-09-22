package com.seed.leetcode.easy;

/**
 * Created by 若宇 on 2017/9/15.
 */
public class FindtheDifference {
    public char findTheDifference(String s, String t) {
        //TODO:二进制做法
        int num=0;
        int num2=0;
        for(int i=0;i<s.length();i++) num+=s.charAt(i);
        for(int j=0;j<t.length();j++) num2+=t.charAt(j);

        return (char)(num2-num) ;
    }
}
