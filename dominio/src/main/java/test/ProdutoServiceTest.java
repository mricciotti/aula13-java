package test;

import Domínio.Produto;
import UseCase.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoServiceTest {

    @Test
    void deveCadastrarProdutoComSucesso() {
        ProdutoRepository repo = new InMemoryProdutoRepository();
        ProdutoService service = new ProdutoServiceImpl(repo);

        service.cadastrarProduto("001", "Livro", 50.0);
        Produto produto = repo.buscarPorCodigo("001").get();

        assertEquals("Livro", produto.getNome());
        assertEquals(50.0, produto.getPreco());
    }

    @Test
    void deveAlterarPrecoComSucesso() {
        ProdutoRepository repo = new InMemoryProdutoRepository();
        ProdutoService service = new ProdutoServiceImpl(repo);

        service.cadastrarProduto("002", "Caneta", 2.0);
        service.alterarPreco("002", 3.0);
        Produto produto = repo.buscarPorCodigo("002").get();

        assertEquals(3.0, produto.getPreco());
    }
}
