package UseCase;


import Domínio.Produto;

public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoServiceImpl(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void cadastrarProduto(String codigo, String nome, double preco) {
        Produto produto = new Produto(codigo, nome, preco);
        repository.salvar(produto);
    }

    @Override
    public void alterarPreco(String codigo, double novoPreco) {
        Produto produto = repository.buscarPorCodigo(codigo)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        produto.setPreco(novoPreco);
        repository.salvar(produto);
    }
}
