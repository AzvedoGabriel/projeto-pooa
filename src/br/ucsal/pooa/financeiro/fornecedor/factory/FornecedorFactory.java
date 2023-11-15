package br.ucsal.pooa.financeiro.fornecedor.factory;

import br.ucsal.pooa.financeiro.fornecedor.Fornecedor;

public class FornecedorFactory {
    public static Fornecedor criarFornecedor(String nome) {
        return new Fornecedor(nome);
    }
}

