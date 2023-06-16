package com.kh.socket3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChattServer {

	public static void main(String[] args) {
		
	try {
		ServerSocket serverSocket = new ServerSocket(60000);
		System.out.println(" 클라이언트 기다리는 중 .. ");
		
		while(true) {
			Socket socket = serverSocket.accept();
			 ClientTherad clientThread = new ClientTherad(socket);
			 clientThread.start();
		}
		
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		
	}
	
}

class ClientTherad extends Thread{
	
	Socket socket;
	BufferedReader br;
	PrintWriter pw;

	static List<PrintWriter> list = Collections.synchronizedList(new ArrayList<PrintWriter>());
			
			
	
	public ClientTherad(Socket socket) {
		this.socket = socket;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			list.add(pw);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void sendAll(String message) {
		for(PrintWriter pw : list) {
			pw.println(message);
			pw.flush();
		}
	}
	
	
	
	public void run() {
		String login = socket.getInetAddress() + "님이 접속하셨습니다..";
		System.out.println(login);
		sendAll(login);
		
		while(br != null) {
			try {
				String line = br.readLine();
				sendAll("[" + socket.getInetAddress() + "] 가 보낸 메세지 : " + line);
			} catch (IOException e) {
				System.out.println(socket.getInetAddress() + "님이 나가셨습니다.");
			}
		}
	}
	
	
}

