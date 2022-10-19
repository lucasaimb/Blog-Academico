package apppoo;

public class Aluno{ 
    public String nome, user, curso;
    int matricula, senha;
    public Aluno(String curso, String nome, String user, int matricula, int senha){
        this.nome = nome;
        this.user = user;
        this.matricula = matricula;
        this.senha = senha;
        this.curso = curso;       
    }
    
  
    public void curtir(Trabalho qualTrabalho){
       qualTrabalho.curtidas = qualTrabalho.curtidas + 1;
    }
    
    public void comentar(){
        
    }
    
    public void visualizarTrabalho(Trabalho trab){
        
        System.out.println("Titulo: "+trab.titulo);
        System.out.println("Autor: "+trab.aluno.getNome());
        System.out.println("Area: "+trab.getAreaAtuacao());
        System.out.println("Trabalho: "+trab.getConteudoTrabalho());
        System.out.println("Curtidas: "+trab.getCurtidas());
        System.out.println("Comentarios: "+trab.getComentarios());
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
    

    
    public void download(Trabalho trab){
        System.out.println("Voce executou o download do trabalho "+'"'+trab.titulo+'"'+".");
    }
    
    
    
}
