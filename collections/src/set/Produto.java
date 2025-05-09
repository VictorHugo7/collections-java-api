package set;

import java.util.Comparator;

public class Produto {

	private String nomeProduto;
	private long codigo;
	private double preco;
	private int quantidade;
	
	public Produto(long codigo, String nomeProduto,double preco, int quantidade) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	

}

class ComparatorPorPreco implements Comparator<Produto> {
	  @Override
	  public int compare(Produto p1, Produto p2) {
	    return Double.compare(p1.getPreco(), p2.getPreco());
	  }
	  
}
