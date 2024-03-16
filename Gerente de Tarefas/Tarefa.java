import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefa {
    public static Scanner scanner = new Scanner(System.in);
    //Atributos
    String nome;
    String data;
    String descricao;

    //Lista de tarefas
    public List<Tarefa> listaDeTarefas = new ArrayList<>();

//Construtor
public Tarefa(String nome,String data,String descricao){
    this.nome = nome;
    this.data = data;
    this.descricao = descricao;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getData() {
    return data;
}

public void setData(String data) {
    this.data = data;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

@Override
public String toString(){
    return "Tarefa{"+"Nome="+nome+"/Data="+data+"/Descrição="+descricao+"}";
}

//Metódos

public static void addTarefa(Tarefa tarefa){
    while(true){
        System.out.println("Digite o nome da tarefa: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a data da tarefa: ");
        String data = scanner.nextLine();
        System.out.println("Digite a descrição da tarefa: ");
        String descricao = scanner.nextLine();

        tarefa.setNome(nome);
        tarefa.setData(data);
        tarefa.setDescricao(descricao);
        tarefa.listaDeTarefas.add(new Tarefa(nome, data, descricao));

        System.out.println("Deseja adicionar mais tarefas? (S/N)");
        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("N")){
            break;
        }

    }


    // Imprimindo os detalhes da tarefa
    System.out.println("Tarefa criada com sucesso:");
    System.out.println(tarefa);

    //Imprimindo tarefas
    System.out.println("Tarefas criadas com sucesso:");
    System.out.println(tarefa.listaDeTarefas);
}
public static void deleteTarefa(){
    System.out.println("Ainda não faz nada!"); 
}

public static void modifyTarefa(){
    System.out.println("Ainda não faz nada!");
}

}

