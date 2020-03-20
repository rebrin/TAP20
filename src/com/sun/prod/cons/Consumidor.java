package com.sun.prod.cons;

public class Consumidor implements Runnable {
    MyStack stack;
    public Consumidor(MyStack stack){
        this.stack=stack;
    }

    @Override
    public void run() {
        for(int i=0;i<200;i++){
            try {
                char c=stack.pop();
                System.out.println(i+"consumidor:"+c);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
