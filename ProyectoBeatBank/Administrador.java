package ProyectoBeatBank;

public class Administrador extends FuncionarioAutenticable {
    
    @Override
    public double getBonificacion(){
        return 0;
    }

    public String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == "Alura";
    }


}
