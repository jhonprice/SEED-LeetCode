package com.seed.leetcode.easy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 若宇 on 2017/9/14.
 */
public class FizzBuzz {
    //TODO:学习写法
    private int size = 0;
    private final List<String> fizzBuzzList = new AbstractList<String>() {
        @Override
        public String get(int index) {
            final int i = index + 1;
            return i % 15 == 0 ? "FizzBuzz"
                    : i % 3 == 0 ? "Fizz"
                    : i % 5 == 0 ? "Buzz"
                    : String.valueOf(i);
        }

        @Override
        public int size() {
            return FizzBuzz.this.size;
        }
    };


    public List<String> fizzBuzz(int n) {
        this.size = n;
        return fizzBuzzList;
    }
}
