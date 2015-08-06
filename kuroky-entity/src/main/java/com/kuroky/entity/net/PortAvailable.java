package com.kuroky.entity.net;

import java.io.IOException;
import java.net.ServerSocket;

public class PortAvailable {
	public static void main(String[] args){
		ServerSocket server=null;
		try {
			server = new ServerSocket(8080);
			System.out.println("没有占");
			} catch (IOException e) {
			e.printStackTrace();
			System.out.println("占着呢");
			}finally{
				if(server!=null){
					try {
						server.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
	}

}
