import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        try (
        var out = System.out) {
            out.print("Por favor, digite o número da conta: ");
            numero = scanner.nextInt();

            out.print("Por favor, digite o número da Agência: ");
            agencia = scanner.next();

            out.print("Por favor, digite o nome do Cliente: ");
            String nomeClienteInput = scanner.next();
            
            while (nomeClienteInput.matches("\\d+")) {
                out.print("Por favor, digite um nome válido: ");
                nomeClienteInput = scanner.next();
            }
            nomeCliente = nomeClienteInput;

            out.print("Por favor, digite o saldo inicial: ");
            
            while (!scanner.hasNextDouble()) {
                out.print("Por favor, digite um valor numérico válido: ");
                scanner.next(); 
            }
            saldo = scanner.nextDouble();

            scanner.close();

            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

            out.println(mensagem);
        }
    }
}
