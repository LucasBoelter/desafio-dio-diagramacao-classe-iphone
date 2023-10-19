package estabelecimento;

import aplicativos.aparelho_telefonico.*;
import aplicativos.iphone.AparelhoiPhone;
import aplicativos.navegador_internet.*;
import aplicativos.reprodutor_musical.*;

public class Usuario {
    public static void main(String[] args) {

        System.out.println();

        // Executando comportamentos Aparelho Telefonico
        System.out.println("Executando comportamentos Aparelho Telefonico");
        System.out.println();

        // Phone
        System.out.println("Phone:");
        AparelhoTelefonico telefone = new Phone();
        telefone.ligar(40028922);
        telefone.atender();
        
        System.out.println();

        // iPhone
        System.out.println("iPhone:");
        telefone = new AparelhoiPhone();
        telefone.ligar(90904002);
        telefone.atender();
        
        System.out.println("----------------------------------------------");
        System.out.println();
        
        // Executando comportamentos Navegador Internet
        System.out.println("Executando comportamentos Navegador Internet");
        System.out.println();

        // Safira
        System.out.println("Safira:");
        NavegadorInternet navegador = new Safira();
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();

        System.out.println();

        // iPhone
        System.out.println("iPhone:");
        navegador = new AparelhoiPhone();
        navegador.exibirPagina("www.google.com");
        navegador.adicionarNovaAba();

        System.out.println("----------------------------------------------");
        System.out.println();
        
        // Executando comportamentos Reprodutor Musical
        System.out.println("Executando comportamentos Reprodutor Musical");
        System.out.println();

        // Safira
        ReprodutorMusical player = new IPod();
        player.selecionarMusica("RU Mine - Arctic Monkeys");
        player.pausar("RU Mine - Arctic Monkeys");

        System.out.println();

        // iPhone
        System.out.println("iPhone:");
        player = new AparelhoiPhone();
        player.selecionarMusica("Do I wanna know - Arctic Monkeys");
        player.pausar("Do I wanna know - Arctic Monkeys");

        System.out.println("----------------------------------------------");
        System.out.println();

        // Executando tudo pelo iPhone
        System.out.println("Executando tudo pelo iPhone");
        System.out.println();

        AparelhoiPhone iPhone = new AparelhoiPhone();
        iPhone.ligar(40028922);
        iPhone.atender();

        System.out.println();
        
        iPhone.exibirPagina("www.google.com");
        iPhone.adicionarNovaAba();
        
        System.out.println();
        
        iPhone.selecionarMusica("I wanna be yours - Arctic Monkeys");
        iPhone.pausar("I wanna be yours - Arctic Monkeys");
    }
    
}
