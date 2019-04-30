package main;

public class Participante {

	private String nombre;
	private ChatRoom salaDeChat;

	public Participante(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void enviarMensaje(String destinatario, String mensaje) {
		salaDeChat.mandarMensaje(nombre, destinatario, mensaje);
	}
	
	public void recibirMensaje(String remintente, String mensaje) {
		System.out.println("Remitente: " + remintente + "\n mensaje: " + mensaje);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ChatRoom getSalaDeChat() {
		return salaDeChat;
	}

	public void setSalaDeChat(ChatRoom salaDeChat) {
		this.salaDeChat = salaDeChat;
	}
}
