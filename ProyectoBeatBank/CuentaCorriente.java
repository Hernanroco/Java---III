package ProyectoBeatBank;

public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente( int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException {
        // valor de la tranferencia
        double comision = 0.2;
        super.saca(valor + comision);
    }

    
}
