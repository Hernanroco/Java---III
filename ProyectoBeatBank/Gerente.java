package ProyectoBeatBank;
public class Gerente extends Funcionario {


    public String clave;

    public Gerente() {
    }
    

    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean iniciarSesion(){
        return clave == "Alura";
    }

// sobreescritura del metodo en diferente clase
    public double getBonificacion(){
        return super.getSalario() + super.getBonificacion();
    }

}
