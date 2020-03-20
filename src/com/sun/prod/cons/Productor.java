package com.sun.prod.cons;

public class Productor implements Runnable {
    MyStack stack;
    public Productor(MyStack stack){
        this.stack=stack;
    }

    @Override
    public void run() {
        for(int i=0;i<200;i++){
            char c= (char)('A'+Math.random()*26);
            stack.push(c);
            System.out.println(i+" productor:"+c);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
