package com.losy;

public class Main {

    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 2, 3, 7};
        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
