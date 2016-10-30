package Figure;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class CompoundFigure extends Figure {
    private ArrayList <Figure> figures = new ArrayList <Figure> ();
    
    public CompoundFigure(){  }
    
    public void add(Figure figure){
        this.figures.add(figure);
    }
    
    public void draw(Graphics graphics){
        for(Figure i : figures){
            i.draw(graphics);
        }
    }
    
    public void move(int mx,int my){
        for(Figure i : figures){
            i.move(mx, my);
        }
    }
    
}
