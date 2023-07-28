package herança1;

/**
 *
 * @author gfbat
 */
public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;
    
    public void cancelarMatr(){
        if(this.getMatr()){
            this.setMatr(false);
            System.out.println("Matrícula cancelada!!");
        } else{
            System.out.println("Erro! Matrícula não está ativa");
        }
}

    public boolean getMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
