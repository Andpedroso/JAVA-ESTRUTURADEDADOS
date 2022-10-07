import javax.swing.*;

public class Vetores{
    
    public static void main(String args[]) {
        int VetSoma [ ], i, soma = 0;
        VetSoma = new int [10];
        
        for(i = 0; i <= 9; i++)
        {
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + VetSoma[i];
        }
        
        System.out.println("A soma dos 10 valores digitados é: " + soma);
        
        System.exit(0);
    }
}
