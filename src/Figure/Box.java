package Figure;
import java.awt.*;
import javax.swing.*;

public class Box extends Figure {
    private int width;
    private int height;
    
    public Box(int x,int y,int width,int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(), this.getY(), width, height);    
    }
    
}
