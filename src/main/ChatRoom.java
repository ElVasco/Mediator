package main;

import java.util.HashMap;
import java.util.Map;

//ConcreteMediator
public class ChatRoom extends AbstractChatRoom {

	Map<String, Participante> participantes = new HashMap<String, Participante>();

	@Override
	public void registrar(Participante participante) {
		if(!participantes.containsKey(participante.getNombre())) {
			participantes.put(participante.getNombre(), participante);
		}else {
			System.out.println("petar!!");
		}
		participante.setSalaDeChat(this);
	}

	@Override
	public void mandarMensaje(String remitente, String destinatario, String mensaje) {
		if(participantes.containsKey(remitente)
				&& participantes.containsKey(destinatario)) {
			participantes.get(destinatario).recibirMensaje(remitente, mensaje);
		}
	}
}
