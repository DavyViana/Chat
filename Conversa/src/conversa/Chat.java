package conversa;

public class Chat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pessoa a1 = new Pessoa ("Kaline");
		System.out.println(a1.getNome()+ ": "+a1.oi());
		
		Funcionario b1 = new Funcionario ("Pedro", "Namorando");
		System.out.println(b1.getNome() + ": "+b1.ola());
		
		Gerente c1 = new Gerente ("Davy", "Solteiro", "Brasilia");
		System.out.println(c1.getNome() + ": "+c1.ei());
		
		System.out.println(b1.getNome() + ": "+b1.amigo());
		
		System.out.println(c1.getNome() + ": "+c1.confus());
	}*/
		Funcionario b1 = new Funcionario ("Pedro", "Namorando");
		System.out.println(b1.getNome() + ": "+b1.ola());
		
		Pessoa a1 = new Pessoa ("Kaline");
		System.out.println(a1.getNome()+ ": "+a1.oi());
		
		Gerente c1 = new Gerente ("Davy", "Solteiro", "Brasilia");
		System.out.println(c1.getNome() + ": "+c1.confus());
		
		System.out.println(c1.getNome() + ": "+c1.ei());
		
		System.out.println(b1.getNome() + ": "+b1.sumiço());
		
		System.out.println(c1.getNome() + ": "+c1.Fired());
		
		System.out.println(a1.getNome()+ ": "+a1.feedback());
		
}
}	

