package UseCase;

import Domínio.Produto;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryProdutoRepository implements ProdutoRepository {
    private Map<String, Produto> banco = new HashMap<>();

    @Override
    public void salvar(Produto produto) {
        banco.put(produto.getCodigo(), produto);
    }

    @Override
    public Optional<Produto> buscarPorCodigo(String codigo) {
        return Optional.ofNullable(banco.get(codigo));
    }
}
