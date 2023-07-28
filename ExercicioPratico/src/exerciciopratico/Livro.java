/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopratico;

/**
 *
 * @author gfbat
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
       
    public void detalhes(){
        System.out.println("----------------------");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.getPagAtual());
        System.out.println("O livro está aberto: " + this.getAberto());
        System.out.println("Leitor: " + this.leitor.getNome());
        System.out.println("----------------------");

    } 

    /*
    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor + '}';
    }
*/
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
         return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(String ti, String au, int totP, Pessoa le) {
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = totP;
        this.leitor = le ;
    }
    
    

    @Override
    public void abrir() {
        if(this.getAberto()){
            System.out.println("ERRO! O livro já está aberto!");
        } else if(this.getAberto() == false){
            this.setAberto(true);
            System.out.println("O livro foi aberto!");
        } else{
            System.out.println("ERRO! O valor é nulo");
        }
    }

    @Override
    public void fechar() {
        if(this.getAberto()){
            this.setAberto(false);
            System.out.println("O livro foi fechado!");
        } else if(this.getAberto() == false){
            System.out.println("ERRO! O livro já está fechado@");
        } else{
            System.out.println("ERRO! O valor é nulo");
        }
    }
    
    @Override
    public void folhear(int p) {
        if(this.getAberto()){
            if(p <= this.getTotPaginas()){
            this.setPagAtual(p);
        } else{
                System.out.println("ERRO! Página inválida!");
            }
        
        }else{
            System.out.println("ERRO! O livro não está aberto");
        }
    }

    @Override
    public void avançarPag() {
        if(this.getAberto()){
           if(this.getPagAtual() < this.getTotPaginas()){
           this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Página avançada!");
            System.out.println("Página atual: " + this.getPagAtual());
        }
        } else{
            System.out.println("ERRO! O livro não está aberto");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagAtual() > 0){
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página voltada!");
            System.out.println("Página atual: " + this.getPagAtual());
        } else{
            System.out.println("ERRO! O livro não está aberto");
        }
    }
    
    
}
