import javax.swing.*;

public class ProbeBox {
    JFrame v;
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;
    JPanel panelBox;

    public ProbeBox(){
        v=new JFrame("BoxLayout");
        B1=new JButton("Boton1");
        B2=new JButton("Boton2");
        B3=new JButton("Boton3");
        B4=new JButton("Boton4");
        B5=new JButton("Boton5");
        panelBox=new JPanel();
        //incluimos boxlayout al panel
        panelBox.setLayout(new BoxLayout(panelBox,BoxLayout.Y_AXIS));
        panelBox.add(B1);
        panelBox.add(B2);
        panelBox.add(B3);
        panelBox.add(B4);
        panelBox.add(B5);
        v.add(panelBox);
        v.setSize(400,400);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        new ProbeBox();
    }
}
