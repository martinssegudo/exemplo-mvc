package br.com.exemplo.controller.interfaces;

import br.com.exemplo.controller.exception.NegocialException;
import br.com.exemplo.model.entidades.Pessoa;

import java.util.List;

public interface PessoaControllerInterface {
    void salvar(Pessoa pessoa) throws NegocialException;
    List<Pessoa> listarPessoas();
}
