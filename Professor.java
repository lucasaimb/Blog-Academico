package app;

public class Professor extends Usuario{

    public Professor() {
    }
  
    
    
    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }    
    
    
    //MÉTODOS
    
     public void uparTrabalho(Trabalho qualquerTrabalho){
        
    }
    
    public void editarTrabalho(Trabalho qualTrabalho, int id, String areaAtuacao, Aluno aluno, String conteudoTrabalho, String titulo){
        qualTrabalho.id = id;
        qualTrabalho.areaAtuacao = areaAtuacao;
        qualTrabalho.aluno = aluno;
        qualTrabalho.conteudoTrabalho = conteudoTrabalho;
        qualTrabalho.titulo = titulo;
    }
    
}
