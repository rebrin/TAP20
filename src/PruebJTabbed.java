import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebJTabbed {

    JFrame v;
    JButton [] botones;
    JLabel [] labels;
    JPanel panel1,panel2,panelTemp;
    JTabbedPane tabs;

    PruebJTabbed(){
        v= new JFrame("prueba Tabs");
        botones=new JButton[10];
        labels=new JLabel[10];
        panel1=new JPanel();
        panel2=new JPanel();
        panelTemp=new JPanel();
        tabs= new JTabbedPane();
        //panel1
        panel1.setLayout(new FlowLayout());
        int i=0;
        for(JButton b:botones){
            b=new JButton("boton"+i++);
            panel1.add(b);
        }
        //panel 2
        panel2.setLayout(new FlowLayout());
        i=0;
        for(JLabel l:labels){
            l=new JLabel("label "+i++);
            panel2.add(l);
        }
        //---panel temp
        JLabel lblMsg=new JLabel("introduce la temp:");
        JTextField tfTemp=new JTextField(5);
        JButton btnConv=new JButton("convertir");
        panelTemp.setLayout(new FlowLayout());
        panelTemp.add(lblMsg);
        panelTemp.add(tfTemp);
        panelTemp.add(btnConv);
        btnConv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double tempIni=Double.parseDouble(tfTemp.getText());
                /*formula*/
                Double tempFin=(tempIni*1.14)+32.0;
                JOptionPane.showMessageDialog(v,
                        "la temperatura es:"+tempFin);
            }
        });
        //añado los tabs al padre
        tabs.addTab("botones",panel1);
        tabs.addTab("labels",panel2);
        tabs.addTab("temperatura",panelTemp);
        v.add(tabs,BorderLayout.CENTER);
        v.setSize(300,400);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        new PruebJTabbed();
    }
}
