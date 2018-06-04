package ExercJG.Java8_Livro.cap7;

public class testesContaCorrenteGuana {

    public static void main(String[] args) {

        ContaCorrenteGuana conta = new ContaCorrenteGuana();
        conta.numero = "0303";
        conta.agencia = "Pega aqui e me chupa";
        conta.especial = true;
        conta.limiteEspecial = 50800;
        conta.valorEspecialUsado = 0;
        conta.saldo = 25000;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);
        System.out.println("\nTentativa de saque de R$ 10,00 reais.");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente!");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de R$ 500,00 reais.");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente!");
        }

        System.out.println("Depósito de R$ 500,00 reais.");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial.");
        } else {
            System.out.println("Não está usando cheque especial.");
        }

        conta.realizarSaque(15000);
        System.out.println("Tentativa de saque de R$ 15.000,00 reais.");

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
        } else {
            System.out.println("Não foi possivel realizar saque. Saldo insuficiente!");
        }

        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial.");
        } else {
            System.out.println("Não está usando cheque especial.");
        }
    }
}
