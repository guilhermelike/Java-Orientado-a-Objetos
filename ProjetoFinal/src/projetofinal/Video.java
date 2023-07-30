/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author gfbat
 */
public class Video implements AcoesVideo {
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        if(this.getReproduzindo()){
            System.out.println("ERRO! Vídeo já está reproduzindo");
        } else{
            this.setReproduzindo(true);
            System.out.println("Vídeo está reproduzindo!");
        }
    }

    @Override
    public void pause() {
        if(this.getReproduzindo()){
            this.setReproduzindo(false);
            System.out.println("Vídeo pausado!");
        } else{
            System.out.println("O vídeo já está pausado!");
        }
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
        System.out.println("O vídeo recebeu mais um like!");
        System.out.println("Likes: " + this.getCurtidas());
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
    
}
