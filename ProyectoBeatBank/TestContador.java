package ProyectoBeatBank;
public class TestContador {
    
    public static void main(String[] args) {
        
        Contador contador = new Contador();
        contador.setNombre("Alex");
        contador.setSalario(3000000);

        System.out.println(contador.getNombre());
        System.out.println(contador.getBonificacion());



    }
}
