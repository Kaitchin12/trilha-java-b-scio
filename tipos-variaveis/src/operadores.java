import javax.lang.model.util.ElementScanner6;

public class operadores {
    
    public static void main(String[] args) {
            int inteiro = 5;
            int inteiro2 = 6;
               

                //repetição 
            int numero = 5;
            numero = numero +1;
                System.out.println(numero);



                //boolean na reptição 
                boolean variavel= true;
                //vamos mostrar como fazer a variável ser falsa mesmo 

                variavel = !variavel;
                System.out.println(variavel);


            //operador ternário
        int a,b;
         a = 7;
         b = 7;
        
         String resultado = a==b ?"verdadeiro" : "falso";

         System.out.println(resultado);


         //operadores relacionais
            int number = 4;
            int number2 = 5;

            boolean simNao = number == number2;

            System.out.println("Numero 1 é maior que numero 2? " + simNao);

            simNao = number != number2;
            System.out.println("Numero 1 é diferente de numero 2? " + simNao);


            // Operadores lógicos 

            boolean condicional1 = true;

            boolean condicional2 = false;

            if (condicional1 && condicional2){
                System.out.println("As duas condições são verdadeiras");
            }

                if(condicional1 || condicional2){
                    System.out.println("uma das condições é verdadeira");
                }
    }
}
