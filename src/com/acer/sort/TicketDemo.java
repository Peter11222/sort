package com.acer.sort;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        java.lang.Thread t1=new java.lang.Thread(t);
        java.lang.Thread t2=new java.lang.Thread(t);
        java.lang.Thread t3=new java.lang.Thread(t);
        t1.setName("t1 窗口");
        t2.setName("t2 窗口");
        t3.setName("t3 窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
