package br.com.exemplo.model.interfaces;

import br.com.exemplo.model.entidades.Pessoa;
import br.com.exemplo.model.exception.ModelException;

import java.util.List;

public interface PessoaRepositorioInterface {

    void salvarPessoa(Pessoa pessoa) throws ModelException;
    List<Pessoa> listarTodasPessoas();
}
