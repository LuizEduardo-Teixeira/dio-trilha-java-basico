import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);

        // Declare variables with meaningful names and follow Java naming conventions
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        try (// Prompt the user to enter the required information
        var out = System.out) {
            out.print("Por favor, digite o número da conta: ");
            numero = scanner.nextInt();

            out.print("Por favor, digite o número da Agência: ");
            agencia = scanner.next();

            out.print("Por favor, digite o nome do Cliente: ");
            String nomeClienteInput = scanner.next();
            // Keep prompting the user until a valid name is entered
            while (nomeClienteInput.matches("\\d+")) {
                out.print("Por favor, digite um nome válido: ");
                nomeClienteInput = scanner.next();
            }
            nomeCliente = nomeClienteInput;

            out.print("Por favor, digite o saldo inicial: ");
            // Keep prompting the user until a valid double value is entered
            while (!scanner.hasNextDouble()) {
                out.print("Por favor, digite um valor numérico válido: ");
                scanner.next(); // Discard the invalid input
            }
            saldo = scanner.nextDouble();

            // Close the Scanner object to prevent resource leaks
            scanner.close();

            // Use string concatenation to build the output message
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

            // Print the output message
            out.println(mensagem);
        }
    }
}
