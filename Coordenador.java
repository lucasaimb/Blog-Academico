package app;

public class Coordenador extends Professor{
    public String curso;

    // Construtor padrao
    public Coordenador() {
        
    }
    
    // Construtor completo
    public Coordenador(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    // Metodo que remove um aluno
    public void RemoverAluno(Aluno fulano){
        
        fulano = null;
        System.gc();
    }
    
    // Remove os comentarios de um trabalho
    public void RemoverComentariosDeTrabalho(Trabalho trabalho){
        
        trabalho.comentarios.clear();
    }
    
}
