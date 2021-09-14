package com.company;

import java.util.Arrays;

public class HomeWork03 {

    public static void main(String[] args) {
        //Задание 1
        int[] arr01 = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(invertArray(arr01)));
        //Задание 2

        // Задание 3
        int[] arr03 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        ymnoj(arr03);
        System.out.println(Arrays.toString(arr03));
        //Задание 4
        diagonal(4);
    }

    //Задание 1
    public static int[] invertArray(int[] arr01) {
        for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = 1;

            } else {
                arr01[i] = 0;
            }
        }
        return arr01;
    }
    // Задание 2
    public static void from1to100() {
        int[] arr02 = new int[100];
        for (int i = 0; i < arr02.length; i++)
            System.out.print(arr02[i] + " ");
    }
    // Задание 3
    public static void ymnoj(int[] arr03) {
        for (int i = 0; i < arr03.length; i++) {
            if (arr03[i] < 6) {
                arr03[i] *= 2;
            }
        }
    }
    // Задание 4
    public static void diagonal(int size) {
        int[][] arr4;
        arr4 = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++)
                if (i == j) arr4[i][j] = 1;
            System.out.println();
        }
    }
    //Задание 5
    public static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}