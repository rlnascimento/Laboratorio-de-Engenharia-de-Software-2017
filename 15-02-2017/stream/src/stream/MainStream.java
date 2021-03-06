package stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainStream {

	public static void write() {
		try{
			FileWriter writer = new FileWriter ("C://Temp/stream.txt");
		
			writer.write('A');
			writer.write('N');
			writer.write('T');
			writer.write('A');
		
			
			System.out.println("Terminou");
			writer.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args){
		write();
		read();
	}
	
	public static void read(){
		try{
			FileReader reader = new FileReader("C://TEMP/stream.txt");
			
			int a = reader.read();
			
			while(a != -1){
				System.out.println((char) a);
				a = reader.read();
			}		
		}
		catch(IOException e){
			e.getStackTrace();
		}
	}

}
