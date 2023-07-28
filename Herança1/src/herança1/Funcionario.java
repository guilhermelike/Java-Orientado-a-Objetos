package herança1;

/**
 *
 * @author gfbat
 */
public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        if(this.getTrabalhando()){
            this.setTrabalhando(false);
            System.out.println("Sucesso! Estado atual: " + this.getTrabalhando());
        } else{
            this.setTrabalhando(true);
            System.out.println("Sucesso! Estado atual: " + this.getTrabalhando());
        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
