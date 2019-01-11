
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;

public class MyPannel extends JPanel{
    // private BufferedImage image = ImageIO.read(new File("./image");
    
    public void AddLabel(JFrame frame){
	JLabel label = new JLabel("Hollow World");
        frame.getContentPane().add(label);
    }

    public void AddImage(JFrame frame) throws IOException{
	try{
	    JPanel imagePanel = new JPanel();
	    //System.out.println("in ?");
	    BufferedImage image = ImageIO.read(new File("image.jpg"));
	    JLabel label = new JLabel(new ImageIcon(image));
	    //    System.out.println(label);
	    imagePanel.add(label);
	    imagePanel.setVisible(true);
	    //  System.out.println(imagePanel);
	    // System.out.println("in");
	    frame.getContentPane().add(imagePanel);
	}catch(Exception e){
	    System.out.println("Exception occured");
	    e.printStackTrace();
	}
    }

    public void AddBtnImage(JFrame frame) throws Exception{
	JButton btn = new JButton("Display");
	btn.setBounds(50,50,0,0);
	frame.add(btn);

	btn.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e){
		    try{
			AddImage(frame);
			btn.setVisible(false);
		    }catch(Exception exp){
			exp.printStackTrace();
		    }
		}
	    });
    }
}

