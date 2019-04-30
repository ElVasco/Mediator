package main;

public abstract class AbstractChatRoom {

	public abstract void registrar(Participante participante);
	public abstract void mandarMensaje(String remitente, String destinatario, String mensaje );
}
