package ProyectoBeatBank;

public class TestCuentaExceptionSaca {
    
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123, 456);
        cuenta.deposita(200);
        try {
            cuenta.saca(200);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
