package dispositivos.iphone;

import dispositivos.navegadorInternet.NavegadorInternet;
import dispositivos.reprodutormusical.ReprodutorMusical;
import dispositivos.aparelhotelefonico.AparelhoTelefonico;;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
        public void ligar(){
            System.out.println("LIGANDO VIA IPHONE");
        }
    
        public void atender(){
            System.out.println("ATENDENDO VIA IPHONE");
        }
    
        public void iniciarCorreioDeVoz(){
            System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE");
        }

        public void exibirPagina(){
            System.out.println("EXIBINDO PÁGINA VIA IPHONE");
        }
        public void adicionarNovaAba(){
            System.out.println("ADICIONANDO NOVA ABA VIA IPHONE");
        } 
        public void atualizarPagina(){
            System.out.println("ATUALIZANDO PÁGINA VIA IPHONE");
        }

        public void tocar(){
            System.out.println("TOCANDO MÚSICA VIA IPHONE");
        }
        public void pausar(){
            System.out.println("PAUSANDO MÚSICA VIA IPHONE");
        }
        public void selecionarMusica(){
            System.out.println("SELECIONANDO MÚSICA VIA IPHONE");
        }

    }
