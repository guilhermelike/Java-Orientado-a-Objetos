/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciopratico;

/**
 *
 * @author gfbat
 */
public class ExercicioPratico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Pessoa pe = new Pessoa("José", 19, "M");

            Livro li = new Livro("Moby Dick", "Jorge", 100, pe);
            
            li.abrir();
            li.folhear(55);
            li.detalhes();
            
            pe.fazerAniver();
            
    }
    
}
