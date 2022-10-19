package apppoo;

public class Professor {
    String nome, user;
    int id, senha;

    public Professor(String nome, String user, int id, int senha) {
        this.nome = nome;
        this.user = user;
        this.id = id;
        this.senha = senha;
    }    
    
    
    //MÉTODOS
    
     public void uparTrabalho(){
        
    }
    
    public void editarTrabalho(){
        
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

    public void download(Trabalho trab){
        System.out.println("Voce executou o download do trabalho "+'"'+trab.titulo+'"'+".");
    }
    
    
    
    
    
    
    
    //GETS AND SETTS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
}
