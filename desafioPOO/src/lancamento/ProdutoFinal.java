package lancamento;

import dispositivos.aparelhotelefonico.AparelhoTelefonico;
import dispositivos.iphone.Iphone;
import dispositivos.navegadorInternet.NavegadorInternet;
import dispositivos.reprodutormusical.ReprodutorMusical;

public class ProdutoFinal{
    public static void main(String[] args) {
        Iphone celular = new Iphone();
        ReprodutorMusical reprodutorMusical = celular;
        NavegadorInternet navegadorInternet = celular;
        AparelhoTelefonico aparelhoTelefonico = celular;

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioDeVoz();
    }
}

