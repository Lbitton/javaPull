
import javax.swing.*;
import java.awt.Dimension;

public class CreateWindow{
    private static void CreateWindow(){
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame("MyWindow");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	JLabel label = new JLabel("Hollow World");
	frame.setTitle("Title");
	frame.getContentPane().add(label);
	Dimension dimension = new Dimension(500,100);
	frame.setPreferredSize(dimension);
	frame.pack();
	//frame.setLocationRelativeTo(null);
	frame.setVisible(true);
    }

    public static void main(String[] args){
	CreateWindow();
    }
}
