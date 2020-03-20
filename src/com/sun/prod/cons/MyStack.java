package com.sun.prod.cons;

public class MyStack {
    int ind;
    char data[];

    public MyStack(){
        data=new char[60];
        ind=0;
    }

    public void push(char c){
        synchronized (this){
        data[ind]=c;
        ind++;
        notify();
        }
    }

    public char pop() throws InterruptedException {
        synchronized (this) {
            while(ind<=0){
                    wait();
            }
            ind--;
            return data[ind];
        }
    }
}
