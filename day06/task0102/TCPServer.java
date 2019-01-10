

import java.io.*;
import java.net.*;
import java.util.*;

class TCPServer{
    public static void main(String argv[]) throws Exception{
	String connectSentence = "A system of cells interlinked within cells interlinked within cells interlinked within one stem... And dreadfully distinct against the dark, a tall white fountain played";
	String received;
	ServerSocket welcomeSocket = new ServerSocket(4815);
	System.out.println("Server is ready");

	Socket connectionSocket = welcomeSocket.accept();
	
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
	outToClient.writeBytes(connectSentence + "\n");

	while(true){
	    BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
	    received = inFromClient.readLine();
	    System.out.println("Received : " + received);		     
	}
    }
 
}
