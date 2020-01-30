import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HandlerAnon  {
    JFrame v;
    JLabel msg;
    JTextField jft;

    public HandlerAnon(){
        v=new JFrame("clases internas");
        msg=new JLabel("hacer acciones con el mouse");
        jft=new JTextField(30);
        v.add(msg, BorderLayout.NORTH);
        v.add(jft,BorderLayout.SOUTH);
        //variante de llamada anonima
        v.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jft.setText("presionaste un click (anonimo)");
            }
        });

        //inicializar la ventana
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setSize(400,400);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        new HandlerAnon();
    }
}
