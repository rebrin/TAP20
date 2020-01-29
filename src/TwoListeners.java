import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TwoListeners implements MouseListener, MouseMotionListener {
    JFrame vent;
    JLabel msg;
    JTextField jtf;

    public TwoListeners(){
        vent=new JFrame("mouse Listener");
        msg=new JLabel("mueve el mouse dentro");
        jtf=new JTextField(30);

        /*crear la interfaz*/
        vent.add(msg, BorderLayout.NORTH);
        vent.add(jtf,BorderLayout.SOUTH);
        /*añdimos los listener*/
        vent.addMouseListener(this);
        vent.addMouseMotionListener(this);
//        determinamos los valores de interfaz
        vent.setSize(400,400);
        vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vent.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("diste click en "+e.getX()+","+e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entro a la zona de escucha");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("salió de la zona de escucha");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("arrastrando el mouse:"+e.getX()+":"+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new TwoListeners();
    }
}
