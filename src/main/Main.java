package main;

public class Main {

	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();
		
		Participante ana = new Participante("ana");
		Participante jose = new Participante("jose");
		Participante pepe = new Participante("pepe");
		Participante gloria = new Participante("gloria");
		
		chatRoom.registrar(ana);
		chatRoom.registrar(jose);
		chatRoom.registrar(gloria);
		chatRoom.registrar(pepe);
		
		ana.enviarMensaje("jose", "me la suda!!!");
		jose.enviarMensaje("ana", "a mi tambien");
	}
	
}
