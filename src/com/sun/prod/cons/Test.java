package com.sun.prod.cons;

public class Test {
    public static void main(String[] args) {
        Productor productor;
        Consumidor consumidor;
        Consumidor consumidor2;
        MyStack myStack=new MyStack();
        productor=new Productor(myStack);
        consumidor=new Consumidor(myStack);
        consumidor2=new Consumidor(myStack);

        Thread Hprod=new Thread(productor);
        Thread HCons=new Thread(consumidor);
        Thread HCons2=new Thread(consumidor2);

        Hprod.start();
        HCons.start();
        HCons2.start();
    }
}
