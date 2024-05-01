import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String numeroContaString = "";
        int numeroContaInt = 0;

        String agencia = "";
        String nome = "";

        String saldoString = "";
        double saldoDouble = 0.0;

        while(true) {
            try {
                System.out.println("Digite o Número da conta : ");
                numeroContaString = scanner.nextLine();
                numeroContaInt = Integer.parseInt(numeroContaString);

                System.out.println("Digite o Número da agência: ");
                agencia = scanner.nextLine();

                System.out.println("Digite o Nome do cliente: ");
                nome = scanner.nextLine();

                System.out.println("Digite o Saldo: ");
                saldoString = scanner.nextLine();
                saldoDouble = Double.parseDouble(saldoString);

            } catch (NumberFormatException e) {
                System.err.printf(
                    "\"Numero da conta\" ou \"saldo\" inserido incorretamente." +
                        "\nPossíveis causas:" +
                        "\n\t - O número da conta não pode ultrapassar: 2147483647;" +
                        "\n\t - O saldo da conta não pode ter vírgula como separador. Use um ponto, por exemplo: 250.75" +
                    "\nNúmero da conta e Saldo inseridos:" +
                        "\n\t - Númerdo da conta: %s" +
                        "\n\t - Saldo: %s\n\n", numeroContaString, saldoString);

                System.out.println("Insira todos os dados novamente, por favor.");

                continue; // Volta ao início do loop para serem reinseridos novamente os dados.
            }

            break; // Quebra o loop para seguir natualmente o fluxo.
        }


        System.out.printf("Olá %s," +
                        " obrigado por criar uma conta em nosso banco, sua agência é %s," +
                        " conta %d e seu saldo %.2f já está disponível para saque\n",
                nome, agencia, numeroContaInt, saldoDouble);


    }
}
