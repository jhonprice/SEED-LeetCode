package com.seed.leetcode.easy;

import java.util.Scanner;

/**
 * Created by 若宇 on 2017/9/13.
 */
public class JudgeRouteCircle {
    /**
     * 显然数组索引比判断语句来得快
     */
    public boolean judgeCircleSample(String moves) {
        int[] counts = new int[255];
        for (char c : moves.toCharArray()) {
            counts[c]++;
        }
        return counts['U'] == counts['D'] && counts['L'] == counts['R'];
    }
    private boolean judgeCircle(String moves) {
        int moveX=0;
        int moveY=0;
        for (char c : moves.toCharArray()){
            if(c=='D') moveY--;
            if(c=='U') moveY++;
            if(c=='L') moveX--;
            if(c=='R') moveX++;
        }
        return moveX==0&&moveY==0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println(new JudgeRouteCircle().judgeCircle(scanner.next()));
        }
    }
}
