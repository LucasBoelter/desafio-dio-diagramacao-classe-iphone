package aplicativos.reprodutor_musical;

public class IPod implements ReprodutorMusical{
    public void tocar(String musica){
        System.out.println("Tocando musica "+musica);
    }
    public void pausar(String musica){
        System.out.println("Pausando musica "+musica);
        
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica "+musica);
        tocar(musica);
    }
}
