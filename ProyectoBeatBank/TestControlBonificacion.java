package ProyectoBeatBank;
public class TestControlBonificacion {
    
    public static void main(String[] args) {
        
        Funcionario roberto = new Asesor();
        roberto.setSalario(2000000);

        Gerente hernan = new Gerente();
        hernan.setSalario(6000000);

        Contador alex = new Contador();
        alex.setSalario(3000000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(roberto);
        controlBonificacion.registrarSalario(hernan);
        controlBonificacion.registrarSalario(alex);

    }
}
