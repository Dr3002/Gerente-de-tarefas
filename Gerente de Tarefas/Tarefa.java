import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
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
    public static List<Tarefa> listaDeTarefas = new ArrayList<>();

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

public static List<Tarefa> addTarefa(Tarefa tarefa){
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
        Gson gson = new Gson();
        //Escrever em um Arquivo
        try {
            FileWriter writer = new FileWriter("tarefas.json");
            gson.toJson(Tarefa.listaDeTarefas, writer);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deseja adicionar mais tarefas? (S/N)");
        String resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase("N")){
            break;
        }

    }


    // Imprimindo os detalhes da tarefa individualmente
    //System.out.println("Tarefa criada com sucesso:");
    //System.out.println(tarefa);
    return listaDeTarefas;
}
public static void deleteTarefa(){
    System.out.println("Ainda não faz nada!"); 
}

public static void modifyTarefa(){
    System.out.println("Ainda não faz nada!");
}
public static void showTarefas(List<Tarefa> listaDeTarefas){
    System.out.println("Lista de tarefas:");
    System.out.println(listaDeTarefas);
}

}

