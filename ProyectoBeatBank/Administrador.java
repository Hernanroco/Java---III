package ProyectoBeatBank;

public class Administrador extends Funcionario implements Autenticable {
    
    private AutentiacionUtil util;

    public Administrador(){
        this.util = new AutentiacionUtil();
    }
    
    @Override
    public double getBonificacion(){
        return this.getSalario();
    }

    public void setClave(String clave) {
        this.util.setClave(clave);
    }
    public boolean iniciarSesion(String clave){
        return this.util.iniciarSesion(clave);
    }


}
