import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaLabels {
    JFrame v;
    JLabel label;
    JButton b;

    PruebaLabels(){
        Icon icon=new ImageIcon(getClass()
                .getResource("./img/img_avatar.png"));
        b=new JButton("aceptar",icon);
        JPasswordField jpf=new JPasswordField(10);
        jpf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPasswordField mipass=(JPasswordField) e.getSource();
                System.out.println(mipass.getPassword());
            }
        });

        v=new JFrame("prueba con labels");
        v.setLayout(new FlowLayout());
        v.add(jpf);
        v.add(b);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setSize(400,300);
        v.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PruebaLabels();
            }
        });
    }
}
