package UseCase;


public interface ProdutoService {
    void cadastrarProduto(String codigo, String nome, double preco);
    void alterarPreco(String codigo, double novoPreco);
}
