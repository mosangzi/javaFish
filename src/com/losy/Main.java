package com.losy;

public class Main {

    public static void main(String[] args) {
        int[] arr = {6, 4, 8, 2, 3, 7};
        bubbleSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag) {
                break;
            }
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("Sort done!");
    }
}
