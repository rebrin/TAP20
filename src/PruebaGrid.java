import javax.swing.*;
import java.awt.*;

public class PruebaGrid {
    JFrame v;
    JButton b[];

    PruebaGrid(){
        v=new JFrame("prueba grid Layout");
        b=new JButton[10];
        v.setLayout(new GridLayout(4,3));
        int i=0;
        for(JButton bh:b){
            bh=new JButton("boton"+ ++i);
            v.add(bh);
        }
        v.setSize(400,400);
        v.setVisible(true);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PruebaGrid();
    }
}
