package br.com.exemplo.controller;

import br.com.exemplo.controller.exception.NegocialException;
import br.com.exemplo.controller.interfaces.PessoaControllerInterface;
import br.com.exemplo.model.PessoaRepositorio;
import br.com.exemplo.model.entidades.Pessoa;
import br.com.exemplo.model.exception.ModelException;
import br.com.exemplo.model.interfaces.PessoaRepositorioInterface;

import java.util.List;

public class PessoaController implements PessoaControllerInterface {

    private static PessoaController pessoaController;
    private PessoaRepositorioInterface pessoaRepositorio;

    private PessoaController() {
        pessoaRepositorio = PessoaRepositorio.getInstance();
    }

    public static PessoaController getInstance() {
        if (pessoaController == null)
            pessoaController = new PessoaController();
        return pessoaController;
    }

    @Override
    public void salvar(Pessoa pessoa) throws NegocialException {
        try {
            if (pessoa.getIdade() >= 18) {
                pessoaRepositorio.salvarPessoa(pessoa);
            } else
                throw new NegocialException("A pessoa " + pessoa.getNome() + " menor de idade");
        } catch (ModelException e) {
            e.printStackTrace();
            throw new NegocialException(e.getMessage());
        }

    }

    @Override
    public List<Pessoa> listarPessoas() {
        return pessoaRepositorio.listarTodasPessoas();
    }
}
