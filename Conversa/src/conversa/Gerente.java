package conversa;

public class Gerente extends Funcionario {
	private String Nome;
	private String EstCivil;
	private String Estado;
	
	public String getNome() {
		return this.Nome;
	}
	public String getEstCivil() {
		return this.EstCivil;
	}
	public String getEstado() {
		return this.Estado;
	}
	
	public Gerente(String Nome, String EstCivil, String Estado) {
		super (Nome, EstCivil);
		this.Nome = Nome;
		this.EstCivil = EstCivil;
		this.Estado = Estado;
}
	public String oi(){
		return "E ae,Blz?";}

	public String ola(){
		return "Bom Dia!";}
	
	public String ei(){
		return "Cade o relatório?!";}
	public String Fired() {
		return "Ta demitido entao otario";}
	
	public String confus() {
		return super.oi()+" "+super.ola();
	}
}