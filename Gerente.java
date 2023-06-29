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

}
