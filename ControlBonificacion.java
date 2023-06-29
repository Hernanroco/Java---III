public  class ControlBonificacion {

    private double suma;
    
    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("calculo actual de todas la bonificaciones: " + this.suma);
        return this.suma;
    }

}
