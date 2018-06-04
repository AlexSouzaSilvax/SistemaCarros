package ExercJG.Java8_Livro.cap7;

public class ContaCorrenteGuana {

    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

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