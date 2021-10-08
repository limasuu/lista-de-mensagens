package modelo;

public class Mensagem {
	
	private String email;
	private String mensagem;
	
	public Mensagem(String email, String mensagem) {

		this.email = email;
		this.mensagem = mensagem;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
