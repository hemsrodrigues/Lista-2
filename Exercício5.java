
package ldp2;

import javax.swing.JOptionPane;

public class Exercício5 {
    public static void main(String[] args) {
        
        float salario;
        float reajuste;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite um valor:");
        salario = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite um reajuste:");
        reajuste = Integer.parseInt(dado);
        
        float salarioAtual= salario+(salario*(reajuste/100));
                
        JOptionPane.showMessageDialog(null,("O salário atual é: ")+salarioAtual);
        
    }
    
}
