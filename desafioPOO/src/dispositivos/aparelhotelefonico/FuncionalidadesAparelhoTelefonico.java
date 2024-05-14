package dispositivos.aparelhotelefonico;

public class FuncionalidadesAparelhoTelefonico implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("LIGANDO");
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

}
