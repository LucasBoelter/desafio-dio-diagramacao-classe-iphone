package aplicativos.navegador_internet;

public class Safira implements NavegadorInternet{
    public void exibirPagina(String url){
        atualizarPagina(url);
        System.out.println("Exibindo pagina: "+url);
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba...");
    }
    public void atualizarPagina(String url){
        System.out.println("Atualizando pagina: "+url);

    }
}
