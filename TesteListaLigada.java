import javax.swing.*;

class TesteListaLigada
{
    public static void main(String args[])
    {
        //1.TESTE LISTALIGADA 1
        /*ListaLigada listaLigada = new ListaLigada();
        
        listaLigada.InserirInicio(new No(5));
        
        listaLigada.InserirMeio(new No(8), 2);
        
        listaLigada.InserirMeio(new No(9), 3);
        
        listaLigada.InserirFinal(new No(7));
        
        listaLigada.MostrarLista();
        
        listaLigada.ElementoFinal();
        
        listaLigada.Remover(7);
        
        listaLigada.MostrarLista();
        
        System.exit(0);*/
        
        //2.EXEMPLO 3
        /*ListaLigada intLista = new ListaLigada();
        
        int i, num;
        
        for(i = 1; i <= 10; i++)
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            
            if(num % 3 == 0)
            {
                intLista.InserirFinal(new No(num));
            }
        }
        
        intLista.MostrarLista();
        
        System.exit(0);*/
        
        //3.EXEMPLO 1
        ListaLigada realLista = new ListaLigada();
        
        int i;
        
        double num;
        
        for(i = 1; i <= 5; i++)
        {
            num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real"));
            
            realLista.InserirFinal(new No(num));
        }
        
        realLista.MostrarLista();
    }
}

class No
{
    double elemento;
   
    No prox;
    
    No(double elem)
    {
        elemento = elem;
        
        prox = null;
    }
}

class ListaLigada
{
    No primeiro, ultimo;
    
    ListaLigada()
    {
        primeiro = null;
        
        ultimo = null;
    }
    
    public boolean ListaVazia()
    {
        if(primeiro == null && ultimo == null)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    public void InserirInicio(No novoNo)
    {
        if(ListaVazia())
        {
            ultimo = novoNo;
        }
        
        else
        {
            novoNo.prox = primeiro;
        }
        
        primeiro = novoNo;
    }
    
    public void InserirFinal(No novoNo)
    {
        if(ListaVazia())
        {
            primeiro = novoNo;
        }
        
        else
        {
            ultimo.prox = novoNo;
        }
        
        ultimo = novoNo;
    }
    
    public int ContarNos()
    {
        int tamanho = 0;
        
        No NoTemp = primeiro;
        
        while(NoTemp != null)
        {
            tamanho = tamanho + 1;
            
            NoTemp = NoTemp.prox;
        }
        
        return tamanho;
    }
    
    public void InserirMeio(No novoNo, int posicao)
    {
        No NoTemp = primeiro;
        
        int NroNos, posAux = 1;
        
        NroNos = ContarNos();
        
        if(posicao <= 1)
        {
            InserirInicio(novoNo);
        }
        
        else
        {
            if(posicao > NroNos)
            {
                InserirFinal(novoNo);
            }
            
            else
            {
                while(posAux > (posicao - 1))
                {
                    NoTemp = NoTemp.prox;
                    
                    posAux = posAux + 1;
                }
                
                novoNo.prox = NoTemp.prox;
                
                NoTemp.prox = novoNo;
            }
        }
    }
    
    public void Remover(int elemento)
    {
        No NoTemp = primeiro;
        
        No NoAnt = null;
        
        if(primeiro.elemento == elemento)
        {
            primeiro = primeiro.prox;
        }
        
        else
        {
            while(NoTemp != null && NoTemp.elemento != elemento)
            {
                NoAnt = NoTemp;
                
                NoTemp = NoTemp.prox;
            }
            
            if(NoTemp != null)
            {
                NoAnt.prox = NoTemp.prox;
            }
            
            if(NoTemp == ultimo)
            {
                ultimo = NoAnt;
            }
        }
    }
    
    public void ElementoInicio()
    {
        if(!ListaVazia())
        {
            System.out.println("O primeiro elmento é " + primeiro.elemento);
        }
        
        else
        {
            System.out.println("Lista Ligada Vazia");
        }
    }
    
    public void ElementoFinal()
    {
        if(!ListaVazia())
        {
            System.out.println("O últimmo elmento é: " + ultimo.elemento);
        }
        
        else
        {
            System.out.println("Lista Ligada Vazia");
        }
    }
    
    public No BuscarNo(int elemento)
    {
        int i = 1;
        
        No NoTemp = primeiro;
        
        while(NoTemp != null)
        {
            if(NoTemp.elemento == elemento)
            {
                System.out.println("No " + NoTemp.elemento + " posição " + i);
                
                return NoTemp;
            }
            
            i = i + 1;
            
            NoTemp = NoTemp.prox;
        }
        
        return null;
    }
    
    public void MostrarLista()
    {
        No NoTemp = primeiro;
        
        int i = 1;
        
        while(NoTemp != null)
        {
            System.out.println("Elemento " + NoTemp.elemento + " posição " + i);
            
            NoTemp = NoTemp.prox;
            
            i = i + 1;
        }
    }

    public void Destruir()
    {
        primeiro = null;
        
        ultimo = null;
    }
}
