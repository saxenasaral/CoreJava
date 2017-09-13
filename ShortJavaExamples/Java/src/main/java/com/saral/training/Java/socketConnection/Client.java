package com.saral.training.Java.socketConnection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private Socket socket=null;
	private DataInputStream in = null;
	private DataOutputStream out = null;
	
	public Client(String add, int port){
		
		try {
			socket = new Socket(add, port);
			
			in = new DataInputStream(System.in);
			out = new DataOutputStream(socket.getOutputStream());
			String line = "";
			 
	        // keep reading until "Over" is input
	        while (!line.equals("Over"))
	        {
	            try
	            {
	                line = in.readLine();
	                out.writeUTF(line);
	            }
	            catch(IOException i)
	            {
	                System.out.println(i);
	            }
	        }
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				socket.close();
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

	public static void main(String[] args) {

		Client c = new Client("127.0.0.1", 5000);
	}

}
