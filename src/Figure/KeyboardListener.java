package Figure;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyboardListener implements KeyListener {
    private Component component;
    private Figure figure;
    
    public KeyboardListener(Component component,Figure figure){
        this.component = component;
        this.figure = figure;
    }
    
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            figure.move(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            figure.move(5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            figure.move(0,-5);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            figure.move(0, 5);
        }

        component.repaint();
    }
    
    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent ke) {
    }
}
