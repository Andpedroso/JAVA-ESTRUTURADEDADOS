import javax.swing.*;

public class Matriz{
    public static void main(String args[]) {
        int MatSoma[][], a, b, soma = 0;
        MatSoma = new int [2][5];
        
        for(a = 0; a <= 1; a++){
            for(b = 0; b <= 4; b++){
                MatSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
                soma = soma + MatSoma[a][b];
            }
        }
                
        System.out.println("A soma dos 10 valores digitados é: " + soma);
        
        System.exit(0);
    }
}
