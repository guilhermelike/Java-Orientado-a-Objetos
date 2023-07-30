/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinal;

/**
 *
 * @author gfbat
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        Gafanhoto g = new Gafanhoto("Guilherme", 19, "M", 1);
       
        v[0] = new Video("Projeto Youtube");
        v[1] = new Video("Utopia");
        v[2] = new Video("Austin");
        
        //v[1].play();
        //v[1].like();
        //v[2].like();
        //v[1].pause();
        //v[1].like();
        
      //  System.out.println(v[1].toString());
       // System.out.println(v[2].toString());
    //    System.out.println(v[0].toString());
        
        //g.ganharExp();
        //g.viuMaisUm();
        
       // System.out.println(g.toString());
       
       Visualizacao vis[] = new Visualizacao[2];
       vis[0] = new Visualizacao(g, v[0]);
       vis[1] = new Visualizacao(g, v[1]);
       vis[0].avaliar();
        System.out.println(vis[0].toString());
       vis[1].avaliar(87f);
        System.out.println(vis[1].toString());
    }   
    
}
