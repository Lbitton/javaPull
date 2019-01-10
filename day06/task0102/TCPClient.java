

import java.io.*;
import java.net.*;
import java.util.*;

class TCPClient{
    public static void main(String args[]) throws Exception{
	String sentence;
	String received;

	BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
	Socket clientSocket = new Socket("localhost", 4815);
	DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
	BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	sentence = inFromUser.readLine();
	outToServer.writeBytes(sentence + "\n");
	received = inFromServer.readLine();
	System.out.println("FROM SERVER: " + received);
	clientSocket.close();



    }

}
