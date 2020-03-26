package com.sun.largas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterfazLarga {

    JFrame v;
    JComboBox<String> combo;
    JButton button;

    public  InterfazLarga(){
        v=new JFrame("Proceso largo");
        combo=new JComboBox<>();
        combo.addItem("opcion 1");
        combo.addItem("opcion 2");
        combo.addItem("opcion 3");
        button=new JButton("operacion larga");
        v.setLayout(new FlowLayout());
        v.add(combo);
        v.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ExecutorService service= Executors.newSingleThreadExecutor();
                try{
                    service.execute(()->{
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    });
                }finally {
                    if(service!=null) service.shutdown();
                }
            }
        });
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
        v.setSize(400,400);

    }

    public static void main(String[] args) {
        new InterfazLarga();
    }
}
