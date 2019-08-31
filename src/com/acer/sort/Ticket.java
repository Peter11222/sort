package com.acer.sort;

public class Ticket implements Runnable {
    int tick = 100;
    @Override
    public void run() {
        while(true){
            if(tick>0){
                System.out.println(java.lang.Thread.currentThread().getName()+"售出车票"+"票号为："+tick--);
            }else{
                break;
            }
        }
    }
}
