/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo1;

/**
 *
 * @author gfbat
 */
public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Usando a bolsa..");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando..");
    }
}
