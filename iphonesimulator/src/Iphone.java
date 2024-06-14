import funções.Internet;
import funções.Ipod;
import funções.Telefone;

public class Iphone implements Internet, Telefone, Ipod
{

    @Override
    public void pesquizar() {
        System.out.println("Pesquizando");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

}
