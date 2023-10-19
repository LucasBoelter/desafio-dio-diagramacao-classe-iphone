package aplicativos.iphone;

import aplicativos.aparelho_telefonico.AparelhoTelefonico;
import aplicativos.navegador_internet.NavegadorInternet;
import aplicativos.reprodutor_musical.ReprodutorMusical;

public class AparelhoiPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    // Aparelho Telefonico
    public void atender(){
        System.out.println("Atendendo pelo iPhone");
    }
    public void ligar(int telefone){
        System.out.println("Ligando para "+telefone + " pelo iPhone");
        iniciarCorreioVoz();
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz pelo iPhone");
        System.out.println("'Sua chamada esta sendo encaminhada para a caixa postal, e estara sujeita a cobrança após o sinal'");
        System.out.println(" * pi! *");

    }

    // Navegador Internet
    public void exibirPagina(String url){
        atualizarPagina(url);
        System.out.println("Exibindo pagina: "+url + "pelo iPhone");
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba pelo iPhone");
    }
    public void atualizarPagina(String url){
        System.out.println("Atualizando pagina: "+url + " pelo iPhone");

    }

    // Reprodutor Musical
    public void tocar(String musica){
        System.out.println("Tocando musica "+musica+ " pelo iPhone");
    }
    public void pausar(String musica){
        System.out.println("Pausando musica "+musica+ " pelo iPhone");
        
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica "+musica+ " pelo iPhone");
        tocar(musica);
    }
}
