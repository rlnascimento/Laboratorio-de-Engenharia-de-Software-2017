package socket;

import java.io.IOException;
import java.net.ServerSocket;

public class MainSocket {
	public static void main(String[] args){
		try{
			System.out.println("A copa do mundo � nossa");
			
			ServerSocket server = new ServerSocket(50000);
			server.accept();
			
			System.out.println("� isso a�");
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
