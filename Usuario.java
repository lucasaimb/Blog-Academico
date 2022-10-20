public abstract class Usuario {
    public int matricula;
    public String nome;

    
    public void Curtir(Trabalho qualTrabalho){        
        qualTrabalho.curtidas = qualTrabalho.curtidas + 1;
      
    }
    
    public void RemoverCurtida(Trabalho qualTrabalho){
        qualTrabalho.curtidas = qualTrabalho.curtidas - 1;
    }
    
    public void Comentar(String comentario, Trabalho qualTrabalho){
        //String nomeUser = this.nome;
        //comentariou = nomeUser;
        qualTrabalho.comentarios.add(this.nome+": "+comentario);
    }
        
    public void VisualizarTrabalho(Trabalho trab){
        
        System.out.println("Titulo: "+trab.titulo);
        System.out.println("Autor: "+trab.aluno.getNome());
        System.out.println("Area: "+trab.getAreaAtuacao());
        System.out.println("Trabalho: "+trab.getConteudoTrabalho());
        System.out.println("Curtidas: "+trab.getCurtidas());
        System.out.println("Comentarios: "+trab.getComentarios());
        System.out.println("Downloads: "+trab.downloads);
    }
    
    public void Download(Trabalho trab){
        System.out.println("Voce executou o download do trabalho "+'"'+trab.titulo+'"'+".");
        trab.downloads += 1;
    }

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
