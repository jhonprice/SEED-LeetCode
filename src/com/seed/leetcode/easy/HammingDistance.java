package com.seed.leetcode.easy;

import java.util.Scanner;

/**
 * Created by 若宇 on 2017/9/13.
 */


public class HammingDistance {
    private int hammingDistance(int x, int y) {
        int sum=0;
        int xorNum = x^y;
        /*while(xorNum!=0){
            if((xorNum & 1)==1) sum++;
            xorNum=xorNum>>1;
        }


        return sum;*/
        return Integer.bitCount(xorNum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println(new HammingDistance().hammingDistance(scanner.nextInt(),scanner.nextInt()));
        }

    }
}
