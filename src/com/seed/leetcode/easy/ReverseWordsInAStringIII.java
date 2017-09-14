package com.seed.leetcode.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 若宇 on 2017/9/14.
 */
public class ReverseWordsInAStringIII {
    static final String space = " ";
    private String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int i=s.length()-1;i >= 0;i--){
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
    public String reverseWords(String s) {

        String[] lines = s.split(space);
        StringBuilder result = new StringBuilder();
        for(String item : lines){
            result.append(reverseString(item));
            result.append(space);
        }
        return result.toString().trim();
    }
}
