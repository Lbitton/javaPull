
import java.awt.*;
import javax.swing.*;


public class MyPannel extends JPanel{
    public void AddLabel(JFrame frame){
	JLabel label = new JLabel("Hollow World");
        frame.getContentPane().add(label);
	//System.out.println(label);
	//frame.pack();
	//frame.setVisible(true);
    }

}

