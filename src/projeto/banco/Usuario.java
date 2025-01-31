package projeto.banco;

public class Usuario {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Usuario(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    public String getAgencia(){
        return agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é:  " +agencia+ ", conta: " + numero + ", e seu saldo: " +saldo+ ", já está disponível para saque"; 
    }

}



