package com.saral.training.Java.socketConnection;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket ss=null;
	private Socket s = null;
	private DataInputStream dts=null;
	
	public Server(int port){
		
		try {
			ss=new ServerSocket(port);
			
			s=ss.accept();
			
			dts=new DataInputStream(new BufferedInputStream(s.getInputStream()));
			
			String line="";
			while(!line.equals("over")){
				line=dts.readUTF();
				System.out.println(line);
			}
			
			s.close();
			dts.close();
			System.out.println("connection closed");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Server Server = new Server(5000);
	}

}
