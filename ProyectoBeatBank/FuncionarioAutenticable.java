package ProyectoBeatBank;

public class FuncionarioAutenticable extends Funcionario {
    
    public String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == "Alura";
    }
    @Override
    public double getBonificacion() {
        // TODO Auto-generated method stub
        return 0;
    }

}
