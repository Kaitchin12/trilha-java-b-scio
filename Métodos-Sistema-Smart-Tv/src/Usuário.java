public class Usuário {
    public static void main(String[] args) throws Exception {
        

            SmartTv smartTv = new SmartTv();

            //Sistema para volumes pro usuário 
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();
            System.out.println("Volume Atual " + smartTv.volume);

            smartTv.mudarCanal(13);
            System.out.println("Canal atual :" + smartTv.canal);

            //Imprimir o sistema de canais, o ligado e desligado , e O canal 
            System.out.println("Tv ligada ?" + smartTv.ligada);
            System.out.println("Canal atual :" + smartTv.canal);
            System.out.println("Volume Atual " + smartTv.volume);

                //sistema de ligar para o usuário
            smartTv.ligar ();
            System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);



    }
}
