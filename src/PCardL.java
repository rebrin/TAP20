import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PCardL implements ItemListener {
    JFrame v;
    JPanel card1,card2,cardsPadre;
    JComboBox comboBoxOpciones;
    JButton b1,b2;
    JTextField tf;
    final String namesCard[]={"card_botones"
            ,"card_TF"};

    public PCardL(){
        v=new JFrame("ejemplo card");
        //--------primer panel card botones
        card1=new JPanel();
        b1=new JButton("B1");
        b2=new JButton("B2");
        card1.setLayout(new FlowLayout());
        card1.add(b1);
        card1.add(b2);
        //------------------card 2 textfield
        card2=new JPanel();
        JLabel lb= new JLabel("mensaje");
        tf=new JTextField(20);
        card2.setLayout(new FlowLayout());
        card2.add(lb);
        card2.add(tf);
        //-----------------card padre
        cardsPadre=new JPanel(new CardLayout());
        comboBoxOpciones=new JComboBox(namesCard);
        comboBoxOpciones.setEditable(false);
        comboBoxOpciones.addItemListener(this);
        v.add(comboBoxOpciones,BorderLayout.NORTH);
        cardsPadre.add(card1,"card_botones");
        cardsPadre.add(card2,"card_TF");
        v.add(cardsPadre,BorderLayout.CENTER);
        v.setSize(300,200);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        new PCardL();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout cl= (CardLayout) cardsPadre.getLayout();
        cl.show(cardsPadre,(String)e.getItem());
    }
}
