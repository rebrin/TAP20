import javax.swing.*;
import java.awt.*;

public class GUIButton {
    JFrame v;
    JButton b;
    JPanel p;

    public GUIButton(){
        //para pedir memoria
        v=new JFrame("Primer ejercicio");
        b= new JButton("da click");
        p=new JPanel();

        b.addActionListener(new BDelegate());
        //añadir el componente al contenedor
        p.add(b);
        v.add(p, BorderLayout.CENTER);

        //determinar el tam
        v.setSize(400,400);
        //cerrar la aplicación con el X
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mostrar
        v.setVisible(true);
    }

    public static void main(String[] args) {
        GUIButton gb=new GUIButton();
    }
}
