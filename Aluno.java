public class Aluno extends Usuario{ 
    
    public String curso;
    public Trabalho trabalho;
    
    
    public Aluno() {
    }
    
    
    
    public Aluno(String nome, String curso, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;       
    }
    
    void CriarTrabalho(int id, String area, String conteudo, String titulo){
      
        trabalho = new Trabalho(id, area, this, conteudo, titulo);
        
    }
    
    
}
