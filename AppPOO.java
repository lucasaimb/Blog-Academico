package apppoo;

import java.util.*;

public class AppPOO {

    public static void main(String[] args) {
        
       // ArrayList<Trabalho> trabalhosPostados = new ArrayList<Trabalho>();
        
        Aluno a1 = new Aluno("Lucas Imbroisi", "SI2N", 2202258);
        Professor p1 = new Professor("Maria", 3941);
        Coordenador c1 =  new Coordenador("Susilea", 332, "SistemasdeInformação");
        Trabalho t1 = new Trabalho(2333, "biologia", a1, "lorem ipsum", "Amazonia e o ecossistema");
        a1.Curtir(t1);
        p1.Curtir(t1);
        c1.Curtir(t1);
        a1.VisualizarTrabalho(t1);
        a1.Download(t1);
       
        
    }
    
}
