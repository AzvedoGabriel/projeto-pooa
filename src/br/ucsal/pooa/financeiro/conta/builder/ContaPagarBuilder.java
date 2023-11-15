package br.ucsal.pooa.financeiro.conta.builder;

import br.ucsal.pooa.financeiro.conta.ContaPagar;
import br.ucsal.pooa.financeiro.fornecedor.Fornecedor;

public class ContaPagarBuilder {
    private ContaPagar contaPagar;

    public ContaPagarBuilder(String descricao, double valor) {
        this.contaPagar = new ContaPagar();
        this.contaPagar.setDescricao(descricao);
        this.contaPagar.setValor(valor);
    }

    public ContaPagarBuilder dataVencimento(String dataVencimento) {
        this.contaPagar.setDataVencimento(dataVencimento);
        return this;
    }

    public ContaPagarBuilder fornecedor(Fornecedor fornecedor) {
        this.contaPagar.setFornecedor(fornecedor);
        return this;
    }

    public ContaPagar build() {
        return this.contaPagar;
    }
}