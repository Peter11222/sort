package com.acer.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {16,13,18,17,33};
        System.out.println("排序前++++++++++++++++++++++");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("排序后+++++++++++++++++++++++");
        System.out.print(Arrays.toString(arr));
    }
}
