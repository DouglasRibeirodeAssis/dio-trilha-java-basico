import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
    
        int numero;
        String agencia, nomeCliente;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.println("Por favor digite a agencia!");
        agencia = sc.next();
        System.out.println();

        System.out.println("Por favor digite o numero da sua conta!");
        numero = sc.nextInt();
        
        sc.nextLine();
        System.out.println();

        System.out.println("Por favor digite seu nome!");
        nomeCliente = sc.nextLine();
        System.out.println();

        System.out.println("Por favor digite o seu saldo!");
        double saldo = sc.nextDouble();
        System.out.println();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + "e seu saldo " + saldo + " já está disponível para saque");
    }
}

