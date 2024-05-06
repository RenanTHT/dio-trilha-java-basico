public class TiposOperadores {

    public static void main(String[] args) {

        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(- numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7

        System.out.println(numero ++);// ops algo de errado não está certo

        System.out.println(numero);// agora sim, numero virou 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);




        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
	        //System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
        	//System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
        	//System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
        	//System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
        	System.out.print("Numero 1 é diferente de numero 2");



        // Operadores.java
        boolean condicao1=true;

        boolean condicao2=true;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
         "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
	        System.out.print("Os dois valores são verdadeiros ");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
        	System.out.print("Um dos valores é verdadeiro ");                       






    }
}