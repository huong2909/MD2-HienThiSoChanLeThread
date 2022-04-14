package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
     OddThread oddThread = new OddThread("Thread1");
     EvenThread evenThread = new EvenThread("Thread2");
     oddThread.start();
     oddThread.join();
     evenThread.start();
    }
}
