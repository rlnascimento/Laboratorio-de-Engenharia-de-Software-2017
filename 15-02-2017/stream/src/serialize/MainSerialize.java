package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainSerialize {

	static class Aluno implements Serializable{
		String nome;
		String ra;
		int idade;
		
		public Aluno(String nome,String ra,int idade){
			this.nome 	= nome;
			this.ra 	= ra;
			this.idade 	= idade;
		}
	}
	
	public static void main(String[] args) {
		gravaObjetos();
		readObject();

	}
	
	public static void gravaObjetos(){
		Aluno a = new Aluno("Jo�o Maria","1234",21);
		Aluno b = new Aluno("Willian Guedes","1234",21);
		
		List<Aluno> lista = new ArrayList<>();
		
		lista.add(a);
		lista.add(b);
		
		try{
			FileOutputStream output = new FileOutputStream("C://Temp/serialize.txt");
			
			ObjectOutputStream objectOutput = new ObjectOutputStream(output);
			
			objectOutput.writeObject(lista);
			
			objectOutput.close();
			
			System.out.println("Terminou");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void readObject(){
		try{
			FileInputStream input = new FileInputStream("C://Temp/serialize.txt");
			
			ObjectInputStream objectInput = new ObjectInputStream(input);
			
			Object object = objectInput.readObject();
			
			objectInput.close();
			
			List<Aluno> lista = (List<Aluno>) object;
			
			for(Aluno a : lista){
				System.out.println("Nome do Traste: "+a.nome );
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
