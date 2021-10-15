package br.com.exemplo.model;

import br.com.exemplo.model.entidades.Pessoa;
import br.com.exemplo.model.exception.ModelException;
import br.com.exemplo.model.interfaces.PessoaRepositorioInterface;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositorio implements PessoaRepositorioInterface {
    private List<Pessoa> pessoas;

    private static PessoaRepositorio pessoaRepositorio;

    private PessoaRepositorio() {
        this.pessoas = new ArrayList<>();
    }

    public static PessoaRepositorio getInstance(){
        if(pessoaRepositorio == null)
            pessoaRepositorio = new PessoaRepositorio();
        return pessoaRepositorio;
    }

    @Override
    public void salvarPessoa(Pessoa pessoa) throws ModelException {
        if(pessoa.getNome() == null
            || pessoa.getNome().isEmpty())
            throw new ModelException("Não salvo, poiis o nome esta nulo ou em branco");
        pessoas.add(pessoa);
    }

    @Override
    public List<Pessoa> listarTodasPessoas() {
        return pessoas;
    }
}
