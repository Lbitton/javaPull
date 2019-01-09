
import java.io.*;


public class Serialize{
    Object temp;

    public void SerializeFile(String str, Toy toy){
	try{
	    FileOutputStream fileOut = new FileOutputStream(str);
	    ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
	    objectOut.writeObject(toy);
	    objectOut.close();
	    System.out.println("The Object was successfully written");
	    
	}catch(Exception e){
	    e.printStackTrace();
	}

    }

    public void UnserializeFile(String str){
	try{
	    FileInputStream fileIn = new FileInputStream(str);
	    ObjectInputStream objectIn = new ObjectInputStream(fileIn);

	    temp = objectIn.readObject();

	    System.out.println("The Object has been read from the file");
	    objectIn.close();
	}catch(Exception e){
	    e.printStackTrace();
	}
    }

    public Object getUnserialized(){
	return temp;
    }
    
}
