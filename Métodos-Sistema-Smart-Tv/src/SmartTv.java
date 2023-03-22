import java.nio.channels.Pipe;
import java.security.PublicKey;

public class SmartTv {
    //Sistema para a tv
    boolean ligada =false;
    int canal = 1;
    int volume = 25;
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    //canais class
public void aumentarCanal(){
    canal++;
}

public void diminuirCanal(){
    canal--;
}
 //volumes class
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    //ligar e desligar class
    public void ligar() {
        ligada= true;

    }

    public void desligar(){
        ligada = false;
    }

}
