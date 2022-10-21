package app;

public abstract class Usuario {
    public int matricula;
    public String nome;

    // Metodo para o usuario curtir um trabalho
    public void Curtir(Trabalho qualTrabalho){        
        qualTrabalho.curtidas = qualTrabalho.curtidas + 1;
        System.out.println("Voce curtiu o trabalho " + qualTrabalho.titulo + "!");
      
    }
    
    // Metodo para o usuario descurtir um trabalho
    public void RemoverCurtida(Trabalho qualTrabalho){
        qualTrabalho.curtidas = qualTrabalho.curtidas - 1;
        System.out.println("Voce descurtiu o trabalho " + qualTrabalho.titulo + "!");
    }
    
    // Metodo para o usuario comentar um trabalho
    public void Comentar(String comentario, Trabalho qualTrabalho){
        //String nomeUser = this.nome;
        //comentariou = nomeUser;
        qualTrabalho.comentarios.add(this.nome+": "+comentario);
        System.out.println("Comentario adicionado no trabalho " + qualTrabalho.titulo +"\nComentario: " + "'"+ comentario + "'");
    }
     
    // Metodo para o usuario visualizar um trabalho
    public void VisualizarTrabalho(Trabalho trab){
        
        System.out.println("Voce esta visualizando o trabalho...");
        System.out.println("---------------------------------------");
        System.out.println("Titulo: "+trab.titulo);
        System.out.println("Autor: "+trab.aluno.getNome());
        System.out.println("Area: "+trab.getAreaAtuacao());
        System.out.println("Trabalho: "+trab.getConteudoTrabalho());
        System.out.println("Curtidas: "+trab.getCurtidas());
        System.out.println("Comentarios: "+trab.getComentarios());
        System.out.println("Downloads: "+trab.downloads);
         System.out.println("======================================");
    }
    
    // Metodo para o usuario baixar um trabalho
    public void Download(Trabalho trab){
        System.out.println("Voce executou o download do trabalho "+'"'+trab.titulo+'"'+".");
        trab.downloads += 1;
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
    
}
