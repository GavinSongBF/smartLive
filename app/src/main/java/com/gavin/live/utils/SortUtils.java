package com.gavin.live.utils;

public class SortUtils {


    /**
     *
     * 冒泡排序
     * 简单
     */
    public static int[] bubbleSort(int[] original) {
        int i, j;
        for (i = 0; i < original.length; i++) {
            for (j = i + 1; j < original.length; j++) {
                if (original[i] > original[j]) {
                    int temp = original[i];
                    original[i] = original[j];
                    original[j] = temp;
                }
            }
        }
        return original;
    }

    /**
     * 冒泡优化，小的每次都往上移动
     */
    public static int[] bubbleSort2(int[] original){
        int i, j;
        int length = original.length;
        for (i = 0; i < length; i++) {
            for (j = length-2; j >= i; j--) {
                if (original[j] > original[j+1]) {
                    int temp = original[j];
                    original[j] = original[j+1];
                    original[j+1] = temp;
                }
            }
        }
        return original;
    }

    /**
     * 简单快排，数组移动数次减少
     */
    public static int[] selectSort(int[] original) {

         int min;
         for (int i = 0;i<original.length;i++){
             min = i;
             for (int j=i+1;j< original.length;j++){
                 if (original[min]>original[j]){
                     min = j;
                 }
             }
             if (i != min){
                 int temp = original[i];
                 original[i] = original[min];
                 original[min] = temp;
             }
         }

        return original;
    }

    /**
     *插入排序，排左边
     **/
    public static int[] insertSort(int[] original){
        for (int i = 1;i<original.length;i++){
            int temp = original[i];
            int leftIndex = i - 1;
            while (leftIndex >= 0 && original[leftIndex] > temp){
                original[leftIndex + 1] = original[leftIndex];
                leftIndex --;
            }
            original[leftIndex + 1] = temp;
        }
        return original;
    }
}
