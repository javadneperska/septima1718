package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final int LENGTH = 5;
        final int WIDTH = 5;
        final int HEIGHT = 5;
        int sum = 0;
       double multiplied = 1;
	int grid [][][] = new int [LENGTH][WIDTH][HEIGHT];
        Random rn = new Random();

        for (int i = 0;i< grid.length ; i++ ) {
            for (int j = 0; j < grid[i].length; j++) {
                for (int k = 0; k < grid[i][j].length; k++) {
                    int number = rn.nextInt(15) + 1;
                    grid[i][j][k] = number;
                    sum += grid[i][j][k];
                    multiplied = multiplied * grid[i][j][k];
                    System.out.println(grid[i][j][k]);
                }
            }
        }
        System.out.println("Summed numbers :" + sum);
        System.out.println("Multiplied numbers :"+multiplied);
    }
}
