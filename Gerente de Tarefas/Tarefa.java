public class Tarefa {
    //Atributos
    String nome;
    String data;
    String descricao;


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
    return "Tarefa{"+"Nome="+nome+"Data="+data+"Descrição="+descricao+"}";
}

//Metódos

public static void criarTarefa(){
    System.out.println("Ainda não faz nada!");
}

public static void deletarTarefa(){
    System.out.println("Ainda não faz nada!"); 
}

public static void modificarTarefa(){
    System.out.println("Ainda não faz nada!");
}

}

