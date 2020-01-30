import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class HandlerInterno {
    JFrame v;
    JLabel msg;
    JTextField jft;

    public HandlerInterno(){
        v=new JFrame("clases internas");
        msg=new JLabel("hacer acciones con el mouse");
        jft=new JTextField(30);
        v.add(msg, BorderLayout.NORTH);
        v.add(jft,BorderLayout.SOUTH);
        v.addMouseListener(new InnerHandler());

        //inicializar la ventana
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setSize(400,400);
        v.setVisible(true);
    }
    //este es mi Handler
    class InnerHandler implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            jft.setText("haz dado un click!!! "+e.getX()+":"+e.getY());
        }

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) {
        new HandlerInterno();
    }
}
