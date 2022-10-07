import javax.swing.*;

class Fila 
{
    //VARIÁVEIS
    int tamanho, inicio, fim, total;
    
    double vetor[];
    //CONSTRUTOR
    Fila(int tam)
    {
        inicio = 0;
        
        fim = 0;
        
        total = 0;
        
        tamanho = tam;
        
        vetor = new double[tam];
    }
    //MAIN
    public static void main(String args[]) 
    {
        //1.EXEMPLO PARES
        /*Fila intFila = new Fila(10);;
        
        int i, entrada = 0;
        
        for(i = 1; i <= 10; i++)
        {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            
            if(entrada % 2 == 0)
            {
                intFila.Enfileirar(entrada);
            }
        }
        
        intFila.MostrarFila();
        
        System.exit(0);*/
        
        //2.EXEMPLO 1
        //BIBLIOTECA FILA ALTERADA PARA ELEMENTOS DOUBLE
        Fila realFila = new Fila(5);
        
        double entrada = 0.0;
        
        int i;
        
        for(i = 1; i <= 5; i++)
        {
            entrada = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor real"));
            
            realFila.Enfileirar(entrada);
        }
        
        realFila.MostrarFila();
        
        System.exit(0);
    }
    //MÉTODOS
    public boolean FilaVazia()
    {
        if(total == 0)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    public boolean FilaCheia()
    {
        if(total >= tamanho)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    public void Enfileirar(double elemento)
    {
        if(!FilaCheia())
        {
            vetor[fim] = elemento;
            
            fim = fim + 1;
            
            total = total + 1;
            
            if(fim >= tamanho)
            {
                fim = 0;
            }
        }
        
        else
        {
            System.out.println("Fila Cheia");
        }
    }
    
    public double Desenfileirar()
    {
        double desenfileirado = 0;
        
        if(FilaVazia())
        {
            System.out.println("Fila Vazia");
        }
        
        else
        {
            desenfileirado = vetor[inicio];
            
            inicio = inicio + 1;
            
            total = total - 1;
            
            if(inicio >= tamanho)
            {
                inicio = 0;
            }
        }
        
        return desenfileirado;
    }
    
    public void ElementoInicio()
    {
        if(!FilaVazia())
        {
            System.out.println("O primeiro elemento é " + vetor[inicio]);
        }
        
        else
        {
            System.out.println("Fila Vazia");
        }
    }
    
    public void MostrarFila()
    {
        int i, aux;
        
        aux = inicio;
        
        for(i = 1; i <= total; i++)
        {
            JOptionPane.showMessageDialog(null, "Elemento " + vetor[aux] + " posição " + i);
            
            aux = aux + 1;
            
            if(aux >= tamanho)
            {
                aux = 0;
            }
        }
    }
}
