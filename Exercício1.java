
package ldp2;

import javax.swing.JOptionPane;

public class Exercício1 {
    public static void main(String[] args) {
        
        float salario;
        float reajuste;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite um valor:");
        salario = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite um reajuste:");
        reajuste = Integer.parseInt(dado);
        
        
        
        
        JOptionPane.showMessageDialog(null,("O antecessor é: "));
        JOptionPane.showMessageDialog(null,("O sucessor é: "));
    }
}
