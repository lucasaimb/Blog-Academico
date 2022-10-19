package apppoo;

import java.util.*;

public class AppPOO {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("biologia marinha", "lucas", "lucasss", 2202258, 2323);
        Professor p1 = new Professor("Mario", "mariozinho", 232323, 309307);
        Coordenador c1 =  new Coordenador("Susilea", "susi0102", 323223, 432332);
        Trabalho t1 = new Trabalho(2333, "biologia", a1, "lorem ipsum", "Amazonia e o ecossistema");
        a1.curtir(t1);
        p1.curtir(t1);
        c1.curtir(t1);
        a1.visualizarTrabalho(t1);
        a1.download(t1);
       
        
    }
    
}
