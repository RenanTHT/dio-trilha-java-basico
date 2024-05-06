import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        // Conhcer e importar classe scanner
        Scanner scanner = new Scanner(System.in);

        //exibir as mensagens para o nosso usuario 
        //peça scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        //exibir a mensagem conta criada 
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

     




    }
}
