package UseCase;

import Domínio.Produto;

import java.util.Optional;

public interface ProdutoRepository {
    void salvar(Produto produto);
    Optional<Produto> buscarPorCodigo(String codigo);
}
