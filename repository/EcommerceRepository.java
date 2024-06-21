package ecommerce.repository;

import ecommerce.model.DadosCliente;
import ecommerce.model.DadosProdutos;
import ecommerce.model.clientes;
import ecommerce.model.produtos;

public interface EcommerceRepository {
	
 
	public void cadastrarCliente(DadosCliente clientes);
	public void exibirDadosCartao(DadosCliente clientes);
	public void exibirUsuario(DadosCliente clientes);
	public void exibirGestaoProduto();
	public void exibirStatusAtividade();
	public void exibirCarrinho();
	public void exibirCheckout();
	public void listarProdutos();
	clientes buscarClientePorUsuarioSenha(String usuario, String senha);
	produtos buscarProdutoPorId(long id);
}
