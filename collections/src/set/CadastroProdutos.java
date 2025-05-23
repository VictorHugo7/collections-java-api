package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;
	
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long codigo, String nomeProduto, double preco, int quantidade) {
		produtoSet.add(new Produto(codigo, nomeProduto, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
	    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
	    if (!produtoSet.isEmpty()) {
	      return produtosPorNome;
	    } else {
	      throw new RuntimeException("O conjunto está vazio!");
	    }
	  }

	  public Set<Produto> exibirProdutosPorPreco() {
	    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
	    if (!produtoSet.isEmpty()) {
	      produtosPorPreco.addAll(produtoSet);
	      return produtosPorPreco;
	    } else {
	      throw new RuntimeException("O conjunto está vazio!");
	    }
	  }
	                          
}
