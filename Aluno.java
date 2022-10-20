package apppoo;

public class Aluno extends Usuario{ 
    public String curso;

    public Trabalho t;
    
    
    public Aluno() {
    }
    
    
    
    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;       
    }
    
    void CriarTrabalho(){
        
        t = new Trabalho();
    }
    
    
}
