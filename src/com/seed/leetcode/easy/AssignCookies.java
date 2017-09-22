package com.seed.leetcode.easy;

import java.util.Arrays;

/**
 * Created by 若宇 on 2017/9/19.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int sum = 0;
        for(int i = 0;i<s.length;i++){
            int tmp = s[i];
            for(int j=0;j<g.length;j++){
                if(tmp>=g[j]){
                    sum++;
                    g[j]=Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{3};
        System.out.println(new AssignCookies().findContentChildren(g,s));
    }
}
