package polimorfismo1;

/**
 *
 * @author gfbat
 */
public class Réptil extends Animal{
    protected String corEscama;

    @Override
    public void locomover() {
        System.out.println("Se rastejando..");
    }

    @Override
    public void alimentar() {
        System.out.println("Réptil se alimentando..");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil..");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
