import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        int opcao;

        while(continuar){
            System.out.println("MENU:");
            System.out.println("1- Adicionar tarefa");
            System.out.println("2- Deletar tarefa");
            System.out.println("3- Modificar tarefa");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            Tarefa tarefa = new Tarefa("","","");

            switch (opcao) {
                case 1:
                    Tarefa.addTarefa(tarefa);
                    break;
                case 2:
                    Tarefa.deleteTarefa();
                    break;
                case 3:
                    Tarefa.modifyTarefa();
                    break;
                case 4:
                    System.out.println("Obrigado por acessar o código.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente de novo.");
                    break;
            }
        }
    }
}
