package herança1;

/**
 *
 * @author gfbat
 */
public class Herança1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Guilherme");
        p2.setNome("Bel");
        p3.setNome("Celo");
        p4.setNome("Jorge");
        
        p1.setSexo("M");
        p2.setSexo("F");
        
        p2.setIdade(18);
        
        p2.setCurso("ADS");
        p3.setSalario(2500.50f);
        p4.setSetor("Suporte Técnico");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
    
}
