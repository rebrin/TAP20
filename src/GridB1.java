import javax.swing.*;
import java.awt.*;

public class GridB1 {
    JFrame v;
    JButton b1,b2,b3,b4,b5;
    JPanel panelPrinc;

    GridB1(){
        v=new JFrame("gridBag1");
        b1=new JButton("b1");
        b2=new JButton("b2");
        b3=new JButton("b3");
        b4=new JButton("b4");
        b5=new JButton("b5");
        panelPrinc=new JPanel();
        panelPrinc.setLayout(new GridBagLayout());

        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.weightx=0.1;
        panelPrinc.add(b1,gbc);

        gbc=new GridBagConstraints();
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.weightx=0.1;
        panelPrinc.add(b2,gbc);

        gbc=new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.weightx=0.1;
        gbc.weighty=0.1;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        panelPrinc.add(b3,gbc);

        gbc=new GridBagConstraints();
        gbc.gridx=2;
        gbc.gridy=1;
        gbc.weighty=0.2;
        gbc.weightx=0.1;
        gbc.fill=GridBagConstraints.BOTH;
        gbc.gridheight=3;
        panelPrinc.add(b4,gbc);

        gbc=new GridBagConstraints();
        gbc.gridx=1;
        gbc.gridy=5;
        gbc.gridwidth=2;
        gbc.weightx=0.1;
        gbc.weighty=0.1;
        gbc.gridwidth=2;
       // gbc.insets=new Insets(10,0,0,0);
        gbc.fill=GridBagConstraints.HORIZONTAL;
        panelPrinc.add(b5,gbc);

        v.add(panelPrinc,BorderLayout.CENTER);
        v.setSize(300,250);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        new GridB1();
    }
}
