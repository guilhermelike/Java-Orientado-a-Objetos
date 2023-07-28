package herança2;

/**
 *
 * @author gfbat
 */
public class Herança2 {
    public static void main(String[] args) {  
       // Visitante v1 = new Visitante();
       // v1.setNome("Jorge");
       //v1.setIdade(19);
       // v1.setSexo("M");
       // System.out.println(v1.toString());
       
      // Aluno a1 = new Aluno();
      // a1.setNome("Bel");
      // a1.setIdade(19);
      // a1.setSexo("F");
      // a1.setMatricula(111);
      // a1.setCurso("Design");
      // System.out.println(a1.toString());
      
      Bolsista b1 = new Bolsista();
      b1.setMatricula(222);
      b1.setNome("Achoa");
      b1.setBolsa(12.4f);
      b1.pagarMensalidade();
    }
    
}
