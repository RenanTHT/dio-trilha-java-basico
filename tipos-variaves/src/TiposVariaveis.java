public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "Renan Santos";

        //TIPOS PRIMITIVOS

        byte Idade = 24; // TIPO BYTE VALOR MINIMO -128 VALOR MAXIMO 127 MEMORIA 1 BYTE
        short anoAtual = 2024; //TIPO SHORT VALOR MINIMO -32768 VALOR MAXIMO 32767 MEMORIA 2 BYTE
        int cep = 58430222; //TIPO INT VALOR MINIMO  -2147483648 VALOR MAXIMO 2147483647 MEMORIA 4 BYTES
        long cpf = 36120549830L; //TIPO LONG VALOR MINIMO -9223372036854775808 VALOR MAXIMO 9223372036854775807 MEMORIA 8 BYTES
        
        //TIPOS PRIMITIVOS QUE PODEM CONTER PARTES FRACIONARIAS PODE SER REPRESENTADOS POR 
        
        Float pi = 3.14F; // TIPO FLOAT VALOR MINIMO -3,4028E + 38 VALOR MAXIMO  3,4028E + 38
        double salario = 1412.50; //TIPO DOUBLE VALOR MINIMO -1,7976E + 308 VALOR MAXIMO 1,7976E + 308
        
        //VARIAVEIS E CONSTANTES

        int numero;

        numero = 10;

        // System.out.println(numero);

        //CONSTANTE

        final double VALOR_DE_PI = 3.14; //UTILIZAMOS A PALAVRA RESERVADA final ASSIM DETERMINANDO QUE JAMAIS ESTA VARIAL RECEBERAR OUTRO VALOR 

        //VALOR_DE_PI = 2.15; // TENTANDO MUDAR O VALOR PODEMOS NOTAR O ERRO 


        System.out.println("Nome: " + meuNome);
        System.out.println("Idade: " + Idade);
        System.out.println("cep: " + cep);  
        System.out.println("CPF: " + cpf);




    }
}
