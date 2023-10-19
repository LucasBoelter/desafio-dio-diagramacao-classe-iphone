package aplicativos.aparelho_telefonico;

public class Phone implements AparelhoTelefonico{
    public void atender(){
        System.out.println("Atendendo");
    }
    public void ligar(int telefone){
        System.out.println("Ligando para "+telefone);
        iniciarCorreioVoz();

    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
        System.out.println("'Sua chamada esta sendo encaminhada para a caixa postal, e estara sujeita a cobrança após o sinal'");
        System.out.println(" * pi! *");

    }
}
