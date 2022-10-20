import java.util.*;

public class App{

    public static void main(String[] args) {
        
        ArrayList<Trabalho> trabalhosPostados = new ArrayList<Trabalho>();
        
        Aluno a1 = new Aluno("Lucas Imbroisi", "SI2N", 2202258);
        Aluno a2 = new Aluno("Natan Devs", "SI2N", 2202239);
        Professor p1 = new Professor("Maria", 3941);
        Coordenador c1 =  new Coordenador("Susilea", 332, "SistemasdeInformação");
        Trabalho t1 = new Trabalho(2333, "biologia", a1, "lorem ipsum", "Amazonia e o ecossistema");
        Trabalho t2 = new Trabalho(351, "Ciências Biológicas", a2, "A renovação dos meio de recurso de energia.", "Uma nova fonte");

        
        a2.CriarTrabalho(4589, "Computação", "As diversas formas de se escrever e otimizar um mesmo algoritmo.", "Descodificando");
        System.out.println(); // Pulando linha
        a1.Curtir(t1); 
        a2.Comentar("Muito legal o trabalho!", t1);
        a1.Comentar("Obrigado natan!", t1);
        a1.Download(t1);
        c1.Comentar("Excelente execucao, espero que continue evoluindo!", t1);
        System.out.println(); // Pulando linha
        p1.Curtir(t1);
        c1.Curtir(t1);
        c1.RemoverCurtida(t1);
        System.out.println(); // Pulando linha
        a1.VisualizarTrabalho(t1);
        p1.editarTrabalho(t1, 23223, "Tecnologias futuristicas", a2, "Esse e o novo conteudo", "Tecnologia brasileira futuristica");
        System.out.println(); // Pulando linha
        p1.VisualizarTrabalho(t1);
        System.out.println(); // Pulando linha
        p1.PostarTrabalho(t1, trabalhosPostados);
        p1.PostarTrabalho(t2, trabalhosPostados);
        p1.ListarTrabalhosPostados(trabalhosPostados);
        
    }

}
