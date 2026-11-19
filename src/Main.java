import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Estacionamento estacionamento = new Estacionamento(5);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Estacionar carro");
            System.out.println("2. Retirar carro");
            System.out.println("3. Listar vagas");
            System.out.println("4. Sair");

        
            int opcao;
            try {
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Digite um número.");
                scanner.nextLine(); 
                continue;
        }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Digite a cor do carro: ");
                    String cor = scanner.nextLine();
                    System.out.print("Digite a placa do carro: ");
                    String placa = scanner.nextLine();
                    Carro carro = new Carro(modelo, cor, placa);
                    estacionamento.estacionar(carro);
                    break;
                case 2:
                    System.out.print("Digite a placa do carro a ser retirado: ");
                    String placaRetirada = scanner.nextLine();
                    estacionamento.retirar(placaRetirada);
                    break;
                case 3:
                    estacionamento.listarVagas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

