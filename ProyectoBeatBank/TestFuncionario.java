package ProyectoBeatBank;
public class TestFuncionario {
    
    public static void main(String[] args) {
        Funcionario diego = new Asesor();
        diego.setNombre("Diego");
        diego.setDocumento("1012225844");
        diego.setSalario(2000000);
        diego.setTipo(0);

        System.out.println(diego.getDocumento());
        System.out.println(diego.getBonificacion());
    }
}
