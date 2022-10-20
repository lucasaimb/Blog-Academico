/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppoo;

/**
 *
 * @author alunodev07
 */
public abstract class Usuario {
    public int matricula;
    public String nome;

    
    public void Curtir(Trabalho qualTrabalho){
       qualTrabalho.curtidas = qualTrabalho.curtidas + 1;
    }
    
    public void Comentar(String comentario){
        
    }
    
    public void VisualizarTrabalho(Trabalho trab){
        
        System.out.println("Titulo: "+trab.titulo);
        System.out.println("Autor: "+trab.aluno.getNome());
        System.out.println("Area: "+trab.getAreaAtuacao());
        System.out.println("Trabalho: "+trab.getConteudoTrabalho());
        System.out.println("Curtidas: "+trab.getCurtidas());
        System.out.println("Comentarios: "+trab.getComentarios());
    }
    
    public void Download(Trabalho trab){
        System.out.println("Voce executou o download do trabalho "+'"'+trab.titulo+'"'+".");
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
