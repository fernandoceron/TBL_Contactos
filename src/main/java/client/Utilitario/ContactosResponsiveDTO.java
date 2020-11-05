package client.Utilitario;

public class ContactosResponsiveDTO extends ContactosMessages {

	private String Codigos;
	private String Mensajes;
	private Object Respuestas;
	public ContactosResponsiveDTO() {
		super();
		this.Codigos = CODE_OK;
		this.Mensajes = MSG_OK;
	}
	public ContactosResponsiveDTO (String Codigos, String Mensajes, Object Respuestas) {
		super();
		this.Codigos = Codigos;
		this.Mensajes = Mensajes;
		this.Respuestas = Respuestas;
	}
	public String getCodigos() {
		return Codigos;
	}
	public void setCodigos(String Codigos) {
		this.Codigos = Codigos;
	}
	public String getMensajes() {
		return Mensajes;
	}
	public void setMensajes(String Mensajes) {
		this.Mensajes = Mensajes;
	}
	public Object getRespuestas(){
		return Respuestas;
	}
	public void setRespuestas(Object Respuestas) {
		this.Respuestas = Respuestas;
	}
}
