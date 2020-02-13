package paint.com.itsp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class PanelPaint extends JPanel implements MouseListener, MouseMotionListener {

    Integer xi,yi,xf,yf;
    Boolean dibujando=false;
    ArrayList<Figura> figuras;

    public PanelPaint() {
        xi=0;yi=0;xf=0;yf=0;
        figuras=new ArrayList<>();
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255,0,0));
        for (Figura f : figuras) {
            g.fillRect(f.xi, f.yi, f.xf - f.xi, f.yf - f.yi);
            if(dibujando)
                g.fillRect(xi, yi, xf - xi, yf - yi);
            System.out.println(figuras.size());
            }



    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        xi=e.getX();
        yi=e.getY();
        dibujando=true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        dibujando=false;
        xf=e.getX();
        yf=e.getY();
        if(!dibujando)
            figuras.add(new Figura(xi,yi,xf,yf));

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xf=e.getX();
        yf=e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
