
import java.awt.*;
import javax.swing.*;


public class MyWindow extends JFrame{
    public static void CreateWindow(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("MyWindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Title");
        Dimension dimension = new Dimension(500,100);

	MyPannel mp = new MyPannel();
	mp.AddLabel(frame);
	
        frame.setPreferredSize(dimension);
	frame.pack();
                                           
	frame.setVisible(true);
    }



}
