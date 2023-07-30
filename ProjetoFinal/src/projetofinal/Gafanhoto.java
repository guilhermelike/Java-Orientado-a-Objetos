/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author gfbat
 */
public class Gafanhoto extends Pessoa {
    private int login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, int login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    

    @Override
    public void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
        System.out.println("Gafanhoto ganhou experiência!");
        System.out.println("Total exp: " + this.getExperiencia());
    }
    
    public void viuMaisUm(){
      this.setTotAssistido(this.getTotAssistido() + 1);
        System.out.println("Mais um vídeo assistido!");
        System.out.println("Total: " + this.getTotAssistido());
}

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\n login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
}
