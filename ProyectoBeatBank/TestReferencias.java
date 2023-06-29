package ProyectoBeatBank;
public class TestReferencias {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Hernan");
        funcionario.setSalario(6000000);

        Gerente gerente = new Gerente();
        gerente.setNombre("Jimena");
        gerente.setSalario(6000000);
    }
}
