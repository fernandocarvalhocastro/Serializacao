package br.com.fiap.view;

import java.io.ObjectOutputStream;
import java.net.Socket;

import br.com.fiap.bean.Carro;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 123);
		ObjectOutputStream objectStream = 
				new ObjectOutputStream(socket.getOutputStream());
		
		Carro carro = new Carro("JAIR-JAVAO", "Preto");
		objectStream.writeObject(carro);
		System.out.println("Carro Serializado!");
		objectStream.close();
		socket.close();
	}

}
