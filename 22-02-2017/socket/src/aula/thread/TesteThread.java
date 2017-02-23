package aula.thread;

public class TesteThread {
	public static void main(String[] args){
		MainThread thread = new MainThread();
		
		Thread t = new Thread(thread);
		
		t.start();
	}
}
