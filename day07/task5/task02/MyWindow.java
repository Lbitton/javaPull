
import java.awt.*;
import javax.swing.*;


public class MyWindow extends JFrame{
    public static void CreateWindow(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("MyWindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Title");
        Dimension dimension = new Dimension(250,250);

	MyPannel mp = new MyPannel();
	mp.AddLabel(frame);

	/*try{
	  mp.AddImage(frame);
	  }catch (Exception e){
	  System.out.println("Exception occured");
	  e.printStackTrace();
	  }*/
	try{
	    mp.AddBtnImage(frame);
	}catch(Exception ex){
	    ex.printStackTrace();
	}
        frame.setPreferredSize(dimension);
	frame.pack();
                                           
	frame.setVisible(true);
	//	System.out.println(frame);
    }

}
