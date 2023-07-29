package polimorfismo1;

/**
 *
 * @author gfbat
 */
public class Peixe extends Animal{
    protected String corEscama;
    
    public void soltarBolha(){
        System.out.println("Blu blu blu..");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando..");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe comendo..");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som..");
    }
}
