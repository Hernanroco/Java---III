package ProyectoBeatBank;

public class TestCuenta {
    
    public static void main(String[] args) {
        
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CuentaAhorros ca = new CuentaAhorros(2, 2);

        cc.deposita(2000);
        cc.transfiere(1100, ca);

        System.out.println("Su saldo en la cuenta corriente es: " + cc.getSaldo());
        System.out.println("Su saldo en la cuenta ahorros es: "+ ca.getSaldo());
    }
}
