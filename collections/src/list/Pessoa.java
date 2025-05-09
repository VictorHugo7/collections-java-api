package list;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;
	private int idade;
	private int altura;
	
	public Pessoa(String nome, int idade, int altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public int compareTo(Pessoa p) {
		// TODO Auto-generated method stub
		return Integer.compare(idade, p.getIdade());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}	
}


class ComparatorPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
	
	
}