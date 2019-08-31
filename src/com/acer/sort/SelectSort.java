package com.acer.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={16,13,18,17,33};
        System.out.println("排序前——————————————————————————————");
        System.out.print(Arrays.toString(arr)+"\n");
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            int min=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    minIndex=j;
                }
            }
            if(minIndex != i){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
        }
        System.out.println("排序后————————————————————");
        System.out.print(Arrays.toString(arr));
    }
}
