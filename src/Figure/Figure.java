package Figure;
import java.awt.*;

public abstract class Figure {
    private int x;
    private int y;
    
    public Figure(){  }
    
    public Figure(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public void move(int mx,int my){
        this.x = this.x + mx;
        this.y = this.y + my;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public abstract void draw(Graphics graphics);

}
