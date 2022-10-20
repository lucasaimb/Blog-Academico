import java.util.ArrayList;

public class Professor extends Usuario{

    Trabalho trabalhoParaPostar;
    ArrayList<Trabalho> trabalhosJaPostados;

    public Professor() {
    }
  
    
    
    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public void PostarTrabalho(Trabalho trabalho, ArrayList<Trabalho> trabalhosJaPostados){

        trabalhosJaPostados.add(trabalho);
    }
    
    public void ListarTrabalhosPostados(ArrayList<Trabalho> listaTrabalhos){

        for (Trabalho trabalho : listaTrabalhos) {
            
            System.out.println("Dados do trabalho postado:");
            System.out.println("Id: " + trabalho.id);
            System.out.println("Título: " + trabalho.titulo);
            System.out.println("Aluno responsável: " + trabalho.aluno.nome);
            System.out.println("Área de atuação: " + trabalho.areaAtuacao);
            System.out.println("Conteúdo: " + trabalho.conteudoTrabalho);
            System.out.println("Curtidas: " + trabalho.curtidas);
            System.out.println("Downloads: " + trabalho.downloads);
        }
    }
    
    public void editarTrabalho(Trabalho qualTrabalho, int id, String areaAtuacao, Aluno aluno, String conteudoTrabalho, String titulo){
        qualTrabalho.id = id;
        qualTrabalho.areaAtuacao = areaAtuacao;
        qualTrabalho.aluno = aluno;
        qualTrabalho.conteudoTrabalho = conteudoTrabalho;
        qualTrabalho.titulo = titulo;
    }
    
}
