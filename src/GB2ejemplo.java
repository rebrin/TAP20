import javax.swing.*;
import java.awt.*;

public class GB2ejemplo {
//direccion http://www.chuidiang.org/java/layout/GridBagLayout/GridBagLayout.php
    JButton b1,b2,b3,b4;
    JTextArea textArea;
    JTextField textField;
    JFrame v;

    GB2ejemplo(){
        v=new JFrame("segundo ejemplo");
        v.setLayout(new GridBagLayout());
        GridBagConstraints gbc= new GridBagConstraints();

        //text area
        textArea= new JTextArea("area de texto");
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridheight=2;
        gbc.gridwidth=2;
        gbc.weighty=1.0;
        gbc.fill=GridBagConstraints.BOTH;
        v.add(textArea,gbc);

        gbc.fill=GridBagConstraints.NONE;
        gbc.gridheight=1;
        gbc.gridwidth=1;
        gbc.weighty=0.0;
        //boton 1
        b1=new JButton("boton1");
        gbc.gridx=2;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.NORTH;
        v.add(b1,gbc);
        gbc.anchor=GridBagConstraints.CENTER;
        //b2
        b2=new JButton("boton2");
        gbc.gridx=2;
        gbc.gridy=1;
        v.add(b2,gbc);
        //b3
        b3=new JButton("boton 3");
        gbc.gridx=0;
        gbc.gridy=2;
        v.add(b3,gbc);
        //textfield
        textField=new JTextField("campo de texto");
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.weightx=1.0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        v.add(textField,gbc);
        gbc.fill=GridBagConstraints.NONE;
        gbc.weightx=0.0;
        //b4
        b4=new JButton("boton 4");
        gbc.gridx=2;
        gbc.gridy=2;
        v.add(b4,gbc);


        v.setSize(400,300);
        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GB2ejemplo();
    }
}
