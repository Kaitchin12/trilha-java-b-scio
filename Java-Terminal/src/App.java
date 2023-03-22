public class App {
    public static void main(String[] args) throws Exception {
        //Estrutura para imprimir 
        //nome
        String nome = args[0];
        //sobrenome
        String sobrenome = args [1];
        //idade, sendo int pois vamos colocar um numero 
        int idade = Integer.valueOf(args[2]);
        //altura, em double já que vamos colocar em "."
        double altura = Double.valueOf(args[3]);

        //impressão 
        System.out.println("Olá me chamo" + nome + " " + sobrenome );
        System.out.println("Tenho" + idade + "anos");
        System.out.println("Minha altura é de " + altura + "cm");
    }
}
