package paint.com.itsp;

import javax.swing.*;

public class PaintPrinc {
    JFrame v;
    PanelPaint panelPaint;

    PaintPrinc(){
        v=new JFrame("MiniPaint");
        panelPaint=new PanelPaint();

        v.add(panelPaint);
        v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        v.setSize(800,600);
        v.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaintPrinc();
            }
        });
    }
}
