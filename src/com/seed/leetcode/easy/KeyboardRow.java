package com.seed.leetcode.easy;

import java.util.*;

/**
 * Created by 若宇 on 2017/9/14.
 */
public class KeyboardRow {
    public boolean contains(String s){
        String firstLine = "qwertyuiopQWERTYUIOP";
        String secondLine = "asdfghjklASDFGHJKL";
        String thirdLine = "zxcvbnmZXCVBNM";
        int flag = 0;
        for(char c1 : s.toCharArray()){
            String tmp = c1+"";
            if(firstLine.contains(tmp)){
                flag++;
                break;
            }
        }
        for(char c1 : s.toCharArray()){
            String tmp = c1+"";
            if(secondLine.contains(tmp)){
                flag++;
                break;
            }
        }
        for(char c1 : s.toCharArray()){
            String tmp = c1+"";
            if(thirdLine.contains(tmp)){
                flag++;
                break;
            }
        }
        if(flag>1) return false;
        else return true;
    }
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for(String s : words){
            if(contains(s)){
                result.add(s);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
