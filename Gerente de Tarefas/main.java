import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Comer","13/03/2024","Alimentar os Cachorros");
        boolean continuar = true;
        int opcao;

        while(continuar){
            System.out.println("MENU:");
            System.out.println("1- Criar tarefa");
            System.out.println("2- Deletar tarefa");
            System.out.println("3- Modificar tarefa");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    Tarefa.criarTarefa();
                    break;
                case 2:
                    Tarefa.deletarTarefa();
                    break;
                case 3:
                    Tarefa.modificarTarefa();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente de novo.");
                    break;
            }
        }
    }
}
