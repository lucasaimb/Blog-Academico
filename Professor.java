package app;

import java.util.ArrayList;

public class Professor extends Usuario{

    Trabalho trabalhoParaPostar;
    ArrayList<Trabalho> trabalhosJaPostados;

    // Construtor padrao
    public Professor() {
    
    }
  
    // Construtor completo
    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    // Metodo para o professor postar um trabalho
    public void PostarTrabalho(Trabalho trabalho, ArrayList<Trabalho> trabalhosJaPostados){

        trabalhosJaPostados.add(trabalho);
    }
    
    // Metodo para o professor listar todos os trabalhos
    public void ListarTrabalhosPostados(ArrayList<Trabalho> listaTrabalhos){

        for (Trabalho trabalho : listaTrabalhos) {
            
            System.out.println("Dados do trabalho postado:");
             System.out.println("---------------------------");
            System.out.println("Id: " + trabalho.id);
            System.out.println("Titulo: " + trabalho.titulo);
            System.out.println("Aluno responsavel: " + trabalho.aluno.nome);
            System.out.println("Area de atuacao: " + trabalho.areaAtuacao);
            System.out.println("Conteudo: " + trabalho.conteudoTrabalho);
            System.out.println("Curtidas: " + trabalho.curtidas);
            System.out.println("Downloads: " + trabalho.downloads);
             System.out.println("===========================");
        }
    }
    
    // Metodo para o professor editar algum trabalho
    public void editarTrabalho(Trabalho qualTrabalho, int id, String areaAtuacao, Aluno aluno, String conteudoTrabalho, String titulo){
        qualTrabalho.id = id;
        qualTrabalho.areaAtuacao = areaAtuacao;
        qualTrabalho.aluno = aluno;
        qualTrabalho.conteudoTrabalho = conteudoTrabalho;
        qualTrabalho.titulo = titulo;
    }
    
}
