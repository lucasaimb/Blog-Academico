package app;

import java.util.*;

public class App{

    public static void main(String[] args) {
        
        // Instânciando lista onde será armazenado os trabalhos
        ArrayList<Trabalho> trabalhosPostados = new ArrayList<Trabalho>();
        
        // Instânciando alunos 
        Aluno aluno1 = new Aluno("Lucas Imbroisi", "SI2N", 2202258);
        Aluno aluno2 = new Aluno("Natan Devs", "SI2N", 2202239);
        
        // Instânciando professores
        Professor professor1 = new Professor("Maria", 3941);
        Coordenador coordenador1 =  new Coordenador("Susilea", 332, "SistemasdeInformação");
        
        // Instânciando trabalhos
        Trabalho trabalho1 = new Trabalho(2333, "biologia", aluno1, "lorem ipsum", "Amazonia e o ecossistema");
        Trabalho trabalho2 = new Trabalho(351, "Ciencias Biologicas", aluno2, "A renovacao dos meio de recurso de energia.", "Uma nova fonte");
        aluno2.CriarTrabalho(4589, "Computacao", "As diversas formas de se escrever e otimizar um mesmo algoritmo.", "Descodificando");
        
        //Professor1 postando o trabalho do aluno1
        professor1.PostarTrabalho(trabalho1, trabalhosPostados);
        System.out.println(""); // Pulando linha
        
        //Professor1 postando o trabalho do aluno2
        professor1.PostarTrabalho(trabalho2, trabalhosPostados);
        System.out.println(""); // Pulando linha
        
        //Professor1 listando todos os trabalhos
        professor1.ListarTrabalhosPostados(trabalhosPostados);
        
        //Aluno1 visualizando seu próprio trabalho
        aluno1.VisualizarTrabalho(trabalho1);
        
        //Aluno1 curtindo o proprio trabalho
        aluno1.Curtir(trabalho1); 
        System.out.println(""); // Pulando linha
        
        //Aluno1 visualizando seu próprio trabalho
        aluno1.VisualizarTrabalho(trabalho1);
        
        //Aluno2 comentando o trabalho do aluno
        aluno2.Comentar("Muito legal o trabalho!", trabalho1);
        System.out.println(""); // Pulando linha
        
        //Aluno1 comentando o proprio trabalho
        aluno1.Comentar("Obrigado natan!", trabalho1);
        System.out.println(""); // Pulando linha
        
        //Aluno1 executando download do proprio trabalho
        aluno1.Download(trabalho1);
        System.out.println(""); // Pulando linha
        
        //Coordenador1 comentando o trabalho do Aluno1
        coordenador1.Comentar("Excelente execucao, espero que continue evoluindo!", trabalho1);
        System.out.println(); // Pulando linha
        
        //Professor1 curtindo trabalho do aluno1
        professor1.Curtir(trabalho1);
        System.out.println(""); // Pulando linha
        
        //Coordenador1 curtindo o trabalho do aluno1
        coordenador1.Curtir(trabalho1);
        System.out.println(""); // Pulando linha
        
        //Coordenador1 removendo curtida do trabalho do aluno1
        coordenador1.RemoverCurtida(trabalho1);
        System.out.println(); // Pulando linha
              
        //Professor1 editando o trabalho do aluno2
        professor1.editarTrabalho(trabalho1, 23223, "Tecnologias futuristicas", aluno2, "Esse e o novo conteudo", "Tecnologia brasileira futuristica");
        System.out.println(); // Pulando linha
        
        //Professor1 visualizando o trabalho do aluno1
        professor1.VisualizarTrabalho(trabalho1);
        System.out.println(); // Pulando linha
        
        
    }

}
