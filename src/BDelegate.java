import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BDelegate implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hubo una interacción");
        System.out.println("hola mundo de los eventos");
        JOptionPane.showMessageDialog(null,"diste un click");
    }
}
