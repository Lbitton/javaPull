

import java.net.*;
import java.io.*;



public class ThreadServer{

    static class ServerThread implements Runnable{
	String connectSentence = "A system of cells interlinked within cells interlinked within cells interlinked within one stem... And dreadfully distinct against the dark, a tall white fountain played\n Welcome to the casino \nSay play to play.";
	String sent = "";
	String received = "";
	Socket client = null;
	SlotMachine game = new SlotMachine();
	String result[] = new String[3];
	
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
				   
		       	if(received.equals("play")){
			    result = game.playSlotMachine();
			    sent = "DING DING DING\n" + result[0] + " | " + result[1] + " | " + result[2] + " !\n";
			    if(result[1].equals(result[2]) && result[1].equals(result[3])){
				sent += " YOU WIN";
			    }else if(result[1].equals(result[2]) && result[1].equals(result[3]) && result[1].equals("seven")){
				sent += " YOU GOT THE BINGO !";
			    }else if(result[1].equals(result[2]) && result[1].equals(result[3]) && result[1].equals("voltorb")){
				sent += " BOOM ! YOU LOSE !";
			    }else{
				sent += " YOU LOSE !";
			    }
			    //	System.out.println("TEST : " + sent);
			    outToClient.writeBytes(sent + "\n");
			}else{
			    result = game.playSlotMachine();
			    sent = "press play to play, dumbwit";
			    //	System.out.println("TEST : " + sent);
			    outToClient.writeBytes(sent + "\n");
			}
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
	  
