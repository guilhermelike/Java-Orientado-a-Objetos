package exemplopratico;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.status = false;
        this.saldo = 0;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(tipo == "CC"){
            this.setSaldo(50.0f);
        } else if(tipo == "CP"){
            this.setSaldo(150.0f);
        } else{
            System.out.println("ERRO! Tipo de conta inválida!");
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("ERRO! Conta ainda tem saldo!");
        } else if(this.getSaldo() < 0){
            System.out.println("ERRO! Conta possui débito!");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float st){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + st);
            System.out.println("FEITO! O saldo atual é de: " + this.saldo + " reais.");
        } else{
            System.out.println("ERRO! Conta fechada");
        }
    }
    
    public void sacar(float st){
        if(this.getStatus() == true && this.getSaldo() > 0.0f){
            this.setSaldo(this.getSaldo() - st);
            System.out.println("O valor de " + st + " foi sacado!");
            System.out.println("Saldo atual: " + getSaldo());
        } else{
            System.out.println("ERRO! Conta fechada ou não possui saldo!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade no valor de " + v + " com sucesso!");
        } else{
            System.out.println("Impossível pagar com a conta fechada!");
        }
        
}
    public void estadoAtual(){
        System.out.println("----------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
