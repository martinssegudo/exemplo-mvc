package br.com.exemplo.view;

import br.com.exemplo.controller.PessoaController;
import br.com.exemplo.controller.exception.NegocialException;
import br.com.exemplo.controller.interfaces.PessoaControllerInterface;
import br.com.exemplo.model.entidades.Pessoa;

public class PessoaView {

    public static void main(String [] args){
        PessoaControllerInterface pessoaController = PessoaController.getInstance();

        try {
            pessoaController.salvar(new Pessoa("Luiz", 34));
            pessoaController.salvar(new Pessoa("Vitor", 18));
            pessoaController.salvar(new Pessoa("Alberto", 25));

            for (Pessoa pessoaAtual : pessoaController.listarPessoas()) {
                System.out.println(pessoaAtual.getNome());
            }
        } catch (NegocialException e) {
            e.printStackTrace();
        }
    }
}
