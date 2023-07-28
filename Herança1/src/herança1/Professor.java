package herança1;

/**
 *
 * @author gfbat
 */
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void ReceberAumento(int valor){
        this.setSalario(this.getSalario() + valor);
        System.out.println("Sucesso! O salário subiu para: " + this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
