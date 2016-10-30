
package Figure;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    private Figure object;

    public DrawingBoard(Figure object) {
        super.setBackground(Color.WHITE);
        this.object = object;
    }

    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        this.object.draw(graphics);
    }
}