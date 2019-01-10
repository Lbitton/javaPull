

import java.net.*;
import java.io.*;



public class ThreadServer{

    static class ServerThread implements Runnable{
	String connectSentence = "A system of cells interlinked within cells interlinked within cells interlinked within one stem... And dreadfully distinct against the dark, a tall white fountain played";
	String sent = "";
	String received = "";
	Socket client = null;
	public ServerThread(Socket c){
	    this.client = c;
	}

	public void run(){
	    try {
		System.out.println("Connected to client");

		DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());
		outToClient.writeBytes(connectSentence + "\n");

		BufferedReader fromMeToClient = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader inFromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));

		while(true){
		    //reception                                              
		    if(inFromClient.ready()){
			received = inFromClient.readLine();
			System.out.println("Received : " + received);
		    }

		    //envoi                                                
		    if(fromMeToClient.ready()){
			sent = fromMeToClient.readLine();
			outToClient.writeBytes(sent + "\n");
		    }
		}
	    }catch(Exception e){
		System.err.println(e.getMessage());
	    }
	}

	}


    public static void main(String args[]){
	try{
	    ServerSocket server = new ServerSocket(4815);

	    while(true){
		Socket p = server.accept();
		new Thread(new ServerThread(p)).start();
	    }
	}catch(Exception e){
	    System.err.println("Error : " + e.getMessage());
	}
    }
}
	  
