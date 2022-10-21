package app;

public class Aluno extends Usuario{ 
    
    public String curso;
    public Trabalho trabalho;
    
    // Construtor padrao
    public Aluno() {
    }
    
    
    // Construtor completo
    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;       
    }
    
    // Metodo para o aluno instanciar um trabalho
    void CriarTrabalho(int id, String area, String conteudo, String titulo){
      
        trabalho = new Trabalho(id, area, this, conteudo, titulo);
        
    }
    
    
}
