package com.acer.sort;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {16,13,18,17,33};
        System.out.println("排序前————————————————————————");
        System.out.print(Arrays.toString(arr)+"\n");
       for(int i=1;i<arr.length;i++){
           int insertIndex=i-1;
           int insertValue=arr[i];
           while(insertIndex>=0&&insertValue<arr[insertIndex]){
               arr[insertIndex+1]=arr[insertIndex];
               insertIndex--;
           }
           arr[insertIndex+1]=insertValue;
       }
        System.out.println("排序后————————————————————————");
        System.out.print(Arrays.toString(arr)+"\n");
    }

}
