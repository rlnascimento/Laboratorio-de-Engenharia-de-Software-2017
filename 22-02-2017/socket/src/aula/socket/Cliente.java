package aula.socket;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream ;
import java.net.Socket;

public class Cliente {

	private static final int PORTA = 50000;
//	private static final String SERVIDOR = "10.68.76.173"; // Nikolas
//	private static final String SERVIDOR = "localhost";
	private static final String SERVIDOR = "10.68.76.116"; // Emerson
	
	
	public static void main(String[] args) {
		
		try{
			Socket soc = new Socket(SERVIDOR,PORTA);
			
			InputStream serverInput = soc.getInputStream();
			OutputStream serverOutput = soc.getOutputStream();
			
			int valor = 0;
			
			InputStreamReader serverReader = new InputStreamReader(serverInput);
			
			while((valor = serverInput.read()) != 1){
				System.out.print((char) valor);
			}
			
			InputStreamReader tecladoReader = new InputStreamReader(System.in);
			
			while(true){
				if(serverReader.ready()){
					System.out.print((char) serverReader.read());
				}
				
				if(tecladoReader.ready()){
					int letra = tecladoReader.read();
					serverOutput.write(letra);
					serverOutput.flush();
				}
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
 // 10.68.76.173