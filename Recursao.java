import javax.swing.*;

public class Recursao
{
    public static void main(String args[]) 
    {
        int soma;
        
        soma = soma1(1,0);
        
        JOptionPane.showMessageDialog(null, "A soma dos cem primeiros números é: " + soma);
    }
    
    public static int soma1(int nro, int soma)
    {
        int s;
        
        if(nro == 100)
        {
            s = nro + soma;
        }
        
        else
        {
            s = soma1(nro + 1, nro + soma);
        }
        
        return s;
    }
}
