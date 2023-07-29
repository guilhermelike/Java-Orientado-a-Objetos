package polimorfismo1;

/**
 *
 * @author gfbat
 */
public class Polimorfismo1 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Réptil r = new Réptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cobra ck = new Cobra();
        Cachorro d = new Cachorro();
        Goldfish g = new Goldfish();
        Arara ar = new Arara();
        Tartaruga t = new Tartaruga();
        
        m.setCorPelo("Amarelo");
        m.setIdade(5);
        m.setPeso(2.4f);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        r.locomover();
        p.locomover();
        a.locomover();
        c.locomover();
        t.locomover();
        ar.locomover();
        g.locomover();
        ck.locomover();
        d.locomover();
    }
    
}
