package conversa;

public class Pessoa {
	private String Nome;
	
	public String getNome() {
		return this.Nome;
}
	public Pessoa(String Nome) {
		this.Nome = Nome;
}
	public String oi() {
		return "E ae,Blz?";	
	}
	public String ola() {
		return "Bom Dia!";
	}
	public String feedback() {
		return "Achei um otimo feedback";
	}

}
