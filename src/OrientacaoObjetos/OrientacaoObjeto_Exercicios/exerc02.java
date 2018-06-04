package OrientacaoObjetos.OrientacaoObjeto_Exercicios;

public class exerc02 {
}

class ContaCorrente {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean realizarSaque(double quantiaASacar) {
        //tem saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else { //não tem saldo na conta
            if (especial) {
                double limite = limiteEspecial - saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void depositar(double valorDepositado) {

        saldo += valorDepositado;
    }

    void consultarSaldo() {
        System.out.println("Saldo atual da conta = " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}

class testesContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "030301";
        conta.agencia = "Pega aqui e me chupa";
        conta.especial = true;
        conta.limiteEspecial = 50800;
        conta.valorEspecialUsado = 0;
        conta.saldo = 10500;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);
        System.out.println("Tentativa de saque de R$ 10,00 reais.");
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
