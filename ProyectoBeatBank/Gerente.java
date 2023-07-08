package ProyectoBeatBank;
public class Gerente extends Funcionario implements Autenticable {

    public Gerente() {
    }

    public String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion(String clave){
        return clave == "Alura";
    }

// sobreescritura del metodo en diferente clase
    public double getBonificacion(){
        return super.getSalario() + this.getSalario() * 0.1;
    }

}
