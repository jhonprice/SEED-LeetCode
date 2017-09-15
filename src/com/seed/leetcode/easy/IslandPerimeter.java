package com.seed.leetcode.easy;

/**
 * Created by 若宇 on 2017/9/15.
 */
public class IslandPerimeter {
    int sumPerimeter(int i,int j,int[][] grid){
        int tmp = 4;
        //TODO:理解思路
        //if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
        //if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
        return 0;
    }
    public int islandPerimeter(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    sumPerimeter(i,j,grid);
                }
            }
        }
        return sum;
    }
}
