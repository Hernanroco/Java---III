package ProyectoBeatBank;

public class Asesor extends Funcionario {
    
    Asesor(){

    }

    public double getBonificacion(){
        return super.getSalario() * 0.2;
    }
    

}


