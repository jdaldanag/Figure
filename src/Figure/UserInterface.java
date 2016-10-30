package Figure;
import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Figure figure;
    
    
    public UserInterface(Figure figure){
        this.figure = figure;}
    
    public void run(){
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400,400));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        DrawingBoard draw = new DrawingBoard(this.figure); 
        container.add(draw);
        frame.addKeyListener(new KeyboardListener(draw,figure));
        
    }
    
}
