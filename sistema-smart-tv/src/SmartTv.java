public class SmartTv {
    boolean ligada = false;
    static int Canal = 1;
    int Volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        Volume++;
        System.out.println(" Aumentando o volume para: " + Volume);
    }

    public void diminuirVolume() {
        Volume--;
        System.out.println("abaixando o volume: " + Volume);
    }

    public static void mudarCanal(int novoCanal) {
        Canal = novoCanal;
    }

    public void diminuirCanal() {
        Canal--;
    }

    public void aumentarCanal() {
        Canal++;
    }
}
