/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopratico;
public class ExemploPratico {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jorge");
        p1.abrirConta("CC");
        p1.depositar(1000.0f);
        p1.sacar(1038.0f);
        p1.pagarMensal();
        p1.fecharConta();
        p1.estadoAtual();
    }

    
}