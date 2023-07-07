package ProyectoBeatBank;

public class SistemaInterno {

    private String clave = "12345";
    
    public boolean autenticar(Administrador admin){
        boolean puedeIniciarSesion = admin.iniciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error login");
            return false;
    }
}

    public void autenticar(Gerente gerente1) {
    }
}
