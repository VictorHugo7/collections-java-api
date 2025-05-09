package set;

public class Convidado {
	private String nome;
	private int codConvite;
	
	public Convidado(String nome, int codConvite) {
		super();
		this.nome = nome;
		this.codConvite = codConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodConvite() {
		return codConvite;
	}

	public void setCodConvite(int codConvite) {
		this.codConvite = codConvite;
	}

	

}
