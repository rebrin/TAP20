import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaMenu{

    JMenuBar barra;
    JMenu menuFile;
    JMenu menuEdit;
    JMenu menuHelp;
    JMenuItem MIEdit;
    JMenuItem MISave;
    JMenuItem MIQuit;
    JFrame v;
    JTextArea textArea;

    PruebaMenu(){
        textArea=new JTextArea("Hola");
        v=new JFrame("menus");
        //barra
        barra=new JMenuBar();
        //menús
        menuFile=new JMenu("File");
        menuEdit=new JMenu("Edit");
        menuHelp=new JMenu("Help");
        //menu items menu1
        MIEdit=new JMenuItem("editar");
        MISave=new JMenuItem("Save");
        menuFile.addSeparator();
        MIQuit=new JMenuItem("Quit");

        //añadimos los componentes al menú respectivo
        menuFile.add(MIEdit);
        menuFile.add(MISave);
        menuFile.add(MIQuit);
        barra.add(menuFile);
        barra.add(menuEdit);
        barra.add(menuHelp);
        //programar eventos para el menu
        MISave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(v,"presionaste Save");
            }
        });

        MIQuit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //inicializa
        v.setJMenuBar(barra);

        v.add(new JScrollPane(textArea),BorderLayout.CENTER);

        v.setVisible(true);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setSize(400,300);
    }

    public static void main(String[] args) {
        //llamar swing utilities
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PruebaMenu();
            }
        });
    }
}
