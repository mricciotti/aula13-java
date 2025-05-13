package Adapter;

import UseCase.*;

public class ConsoleApp {
    public static void main(String[] args) {
        ProdutoRepository repository = new InMemoryProdutoRepository();
        ProdutoService service = new ProdutoServiceImpl(repository);

        service.cadastrarProduto("001", "Café", 10.0);
        service.alterarPreco("001", 12.5);

        System.out.println("Produto atualizado com sucesso.");
    }
}
