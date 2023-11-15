package br.ucsal.pooa.financeiro;

import br.ucsal.pooa.financeiro.conta.ContaPagar;
import br.ucsal.pooa.financeiro.fornecedor.Fornecedor;
import br.ucsal.pooa.financeiro.fornecedor.factory.FornecedorFactory;

public class Main {
    public static void main(String[] args) {
        // Usando Factory para criar uma instância de Fornecedor
        Fornecedor imobiliaria = FornecedorFactory.criarFornecedor("Zé Negócios Imobiliários");

        // Usando Builder para criar uma instância de ContaPagar de forma mais fluente
        ContaPagar contaAluguel = ContaPagar.builder("Aluguel do apartamento", 4500)
                .dataVencimento("10/07/2022")
                .fornecedor(imobiliaria)
                .build();

        imprimirConta(contaAluguel);

        contaAluguel.pagar();
        imprimirConta(contaAluguel);

        // Pagar a mesma conta novamente deve ser impedido
        // contaAluguel.pagar();

        contaAluguel.cancelarPagamento();
        imprimirConta(contaAluguel);

        // Cancelar o pagamento de uma conta pendente deve ser impedido
        // contaAluguel.cancelarPagamento();
    }

    public static void imprimirConta(ContaPagar conta) {
        System.out.printf("Fornecedor: %s%n", conta.getFornecedor().getNome());
        System.out.printf("Descrição: %s%n", conta.getDescricao());
        System.out.printf("Data de vencimento: %s%n", conta.getDataVencimento());
        System.out.printf("Valor: R$%.2f%n", conta.getValor());
        System.out.printf("Pago: %s%n", conta.isPago() ? "Sim" : "Não");
        System.out.println();
    }
}