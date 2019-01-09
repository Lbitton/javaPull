
import java.io.*;

public class ReadWrite{
    String readTxt ="";
    String toWrite = "";
    
    public void ReadFile(String str){
	BufferedReader reader = null;
	try{
	    File file = new File(str);
	    reader = new BufferedReader(new FileReader(file));

	    String line;
	    while((line = reader.readLine()) != null){
		//System.out.println(line);
		readTxt += line;
		readTxt += "\n";
	    }
	}catch(IOException e){
	    e.printStackTrace();

       	}finally{
	    try{
		reader.close();
	    }catch(IOException e){
		e.printStackTrace();
	    }
	}
    }
    public void printRead(){
	System.out.println(readTxt);	
    }

    public String getRead(){
	return readTxt;
    }

    public void setToWrite(String str){
	toWrite = str;
    }

    public void WriteFile(String str, boolean append){
	BufferedWriter bw = null;
	File file = null;
	FileWriter fileWrite = null;
	try{
	    file = new File(str);
	    fileWrite = new FileWriter(file, true);
	    bw = new BufferedWriter(fileWrite);
	    bw.write(toWrite);
	    bw.newLine();
	    System.out.println("File Written Successfully.");
	}catch(Exception e){
	    e.printStackTrace();
	}finally{
	    if(bw != null){
		try{
		    bw.close();
		}catch(IOException e){
		    e.printStackTrace();
       		}
	    }
	}
    }


    public void WriteFile(String str){
        BufferedWriter bw = null;
        File file = null;
        FileWriter fileWrite = null;
        try{
            file = new File(str);
            fileWrite = new FileWriter(file);
            bw = new BufferedWriter(fileWrite);
            bw.write(toWrite);
	    bw.newLine();
            System.out.println("File Written Successfully.");
	}catch(Exception e){
            e.printStackTrace();
	}finally{
            if(bw != null){
                try{
                    bw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

