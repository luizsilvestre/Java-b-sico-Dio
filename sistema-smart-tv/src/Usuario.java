public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.out.println(" Tv ligada ?" + smartTv.ligada);
        
        System.out.println("Volume atual ?" + smartTv.Volume);

        smartTv.ligar();
        System.out.println("Novo status " + smartTv.ligada);

        smartTv.desligar();
        System.out.println(" Status " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume atual " + smartTv.Volume);

        SmartTv.mudarCanal(15);
        System.out.println("Canal atual " + smartTv.Canal);

    }
}
