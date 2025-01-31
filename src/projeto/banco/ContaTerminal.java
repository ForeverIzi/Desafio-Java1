package projeto.banco;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        Banco banco = new Banco();
        boolean executar = true;
        
        while (executar) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Cadastrar novo usuário");
            System.out.println("2. Exibir informações de um usuário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: System.out.print("Por favor, digite o número da Agência: ");
                String agencia = scanner.nextLine();

                System.out.print("Por favor, digite o número da Conta: ");
                int numero = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Por favor, digite o nome do Cliente: ");
                String nomeCliente = scanner.nextLine();

                System.out.print("Por favor, digite o saldo da Conta: ");
                double saldo = scanner.nextDouble();

                banco.cadastrarUsuario(numero, agencia, nomeCliente, saldo);
                break;

                case 2:
                    System.out.print("Insira os dígitos da agência: ");
                    String agenciaConsulta = scanner.nextLine();
                    banco.exibirUsuario(agenciaConsulta);
                    break;
                
                case 3:
                    executar = false;
                    System.out.println("Encerrando");
                    break;
                
                default: 
                    System.out.println("Opção inválida, insira outra. ");
            }

        }

    }

}
