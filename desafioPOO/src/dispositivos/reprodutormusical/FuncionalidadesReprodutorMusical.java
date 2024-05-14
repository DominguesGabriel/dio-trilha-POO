package dispositivos.reprodutormusical;

public class FuncionalidadesReprodutorMusical implements ReprodutorMusical {
    public void tocar(){
        System.out.println("TOCANDO MÚSICA");
    }
    public void pausar(){
        System.out.println("PAUSANDO MÚSICA");
    }
    public void selecionarMusica(){
        System.out.println("SELECIONANDO MÚSICA");
    }

}
