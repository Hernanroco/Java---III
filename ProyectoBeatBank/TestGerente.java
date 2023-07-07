package ProyectoBeatBank;
public class TestGerente {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNombre("Armando");
        gerente.setDocumento("102548854");
        gerente.setSalario(5000000);
        gerente.setClave("Alura");
        gerente.setTipo(1);

        System.out.println(gerente.getDocumento());
        System.out.println(gerente.getBonificacion());
        
    }
}

