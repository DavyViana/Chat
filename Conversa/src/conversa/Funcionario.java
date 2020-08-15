package conversa;

public class Funcionario extends Pessoa{
	private String Nome;
	private String EstCivil;
	
	public String getNome() {
		return this.Nome;
	}
	public String getEstCivil() {
		return this.EstCivil;
	}
	
	public Funcionario(String Nome, String EstCivil) {
		super (Nome);
		this.Nome = Nome;
		this.EstCivil = EstCivil;
}

	public String oi(){
		return "E ae,Blz?";}

	public String ola(){
		return "Bom Dia!";}
	public String sumiço() {
		return "Sei não parça";
	}
	
	public String amigo() {
		return super.oi();
	}
}
