package app;

import java.util.ArrayList;

public class Trabalho {
        public int id;
        public String areaAtuacao;
        public Aluno aluno;
        public String conteudoTrabalho;
        public String titulo;
        public int curtidas;
        public int downloads;
        public ArrayList<String> comentarios = new ArrayList<String>();
        
        // Construtor padrao
        public Trabalho(){
            
        }
        
        // Construtor completo
        Trabalho(int id, String areaAtuacao, Aluno aluno, String conteudoTrabalho, String titulo){
            this.id = id;
            this.areaAtuacao = areaAtuacao;
            this.aluno = aluno;
            this.conteudoTrabalho = conteudoTrabalho;
            this.titulo = titulo;
            this.curtidas = 0;
        }

       
    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getConteudoTrabalho() {
        return conteudoTrabalho;
    }

    public void setConteudoTrabalho(String conteudoTrabalho) {
        this.conteudoTrabalho = conteudoTrabalho;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public ArrayList getComentarios() {
        return comentarios;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

       
        
}
