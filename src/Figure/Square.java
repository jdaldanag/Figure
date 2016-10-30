package Figure;
import java.awt.*;
import javax.swing.*;

public class Square extends Figure {
    private int lenght;
    
    public Square(int x,int y,int lenght){
        super(x,y);
        this.lenght = lenght;
    }
    
    public void draw(Graphics graphics){
        graphics.fillRect(this.getX(),this.getY(), lenght, lenght);        
    }
    
}
