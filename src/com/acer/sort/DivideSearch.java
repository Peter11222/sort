package com.acer.sort;

public class DivideSearch {
    public static void main(String[] args) {
        int[] arr = {13,16,17,18,33,34};
        int dest=18;
        int head=0;
        int end=arr.length-1;
        boolean flag=false;
        while(head<=end){
            int middle=(head+end)/2;
            if(dest==arr[middle]){
                System.out.println("找到啦："+middle);
                flag=true;
                break;
            }else if(dest<arr[middle]){
                end=middle-1;
            }else{
                head=middle+1;
            }
            if(flag){
                System.out.println("没有找到哟！");
                break;
            }
        }


    }
}
