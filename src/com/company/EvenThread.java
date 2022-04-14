package com.company;

public class EvenThread extends Thread {
    private String threadName;

    public EvenThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(threadName + " " + i);
                    Thread.sleep(15);
                }
            }
        }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

