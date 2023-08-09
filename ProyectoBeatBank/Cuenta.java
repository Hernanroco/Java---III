package ProyectoBeatBank;

public abstract class Cuenta {

    private double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();
    private boolean saca;

    private static int total;

    public Cuenta(){

    }



    public Cuenta( int agencia, int numero) {
        if(agencia < 1){
            throw new IllegalArgumentException("Agencia invalida");
        }
        this.agencia = agencia;
        
        if(numero < 1){
            throw new IllegalArgumentException("Numero de cuenta invalido");
        }
        this.numero = numero;

        System.out.println("Estoy creando una cuenta " + this.numero);
        Cuenta.total ++;
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void saca(double valor) throws SaldoInsuficienteException {
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
            this.saldo -= valor;
        
    }

    public boolean transfiere(double valor, Cuenta destino) throws SaldoInsuficienteException {
        if(this.saldo >= valor) {
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

}