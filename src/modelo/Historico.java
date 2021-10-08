package modelo;

import java.util.ArrayList;

public class Historico {

	private ArrayList<Mensagem> historico= new ArrayList<Mensagem>();

	public void salvarMensagem(Mensagem mensagem) {

		historico.add(mensagem);
	}

	public void removerMensagem(Mensagem mensagem) {

		historico.remove(mensagem);
	}
	
	public ArrayList<Mensagem> listar() {

		return historico;
	}
	
	public ArrayList<Mensagem> listar(String email) {

		ArrayList<Mensagem> aux= new ArrayList<Mensagem>();
		
		for(Mensagem m : historico) {
			if(m.getEmail().equals(email))
				aux.add(m);
		}
		return aux;
	}
}
