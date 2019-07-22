package chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		Socket s = null;
		String msg = null;
		try {
			ServerSocket ss = new ServerSocket(7899);
			while(true) {
				s = ss.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				System.out.println(dis.readUTF());	
				dis.close();
				s.close();				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
