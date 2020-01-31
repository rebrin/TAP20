import javax.swing.*;
import java.awt.*;

public class ProbeFlow {
    JFrame v;
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;

    public ProbeFlow(){
        v=new JFrame("FlowLayout");
        B1=new JButton("Boton1");
        B2=new JButton("Boton2");
        B3=new JButton("Boton3");
        B4=new JButton("Boton4");
        B5=new JButton("Boton5");
        v.setLayout(new FlowLayout());
        v.add(B1);
        v.add(B2);
        v.add(B3);
        v.add(B4);
        v.add(B5);
        //-------
        v.setSize(200,200);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        new ProbeFlow();
    }
}
