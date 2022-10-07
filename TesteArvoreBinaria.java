import javax.swing.*;

public class TesteArvoreBinaria
{
    public static void main(String args[]) 
    {
        //1.EXEMPLO 1
        /*ArvoreBinaria arv = new ArvoreBinaria();
        
        arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
        
        arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
        
        arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
        
        arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
        
        arv.inserirNo(Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro")));
        
        arv.exibirNo();
        
        System.exit(0);*/
        
        //2.EXEMPLO 2
        int num;
        
        ArvoreBinaria arv = new ArvoreBinaria();
        
        num = 1;
        
        arv.inserirNo(num);
        
        num = 2;
        
        arv.inserirNo(num);
        
        num = 3;
        
        arv.inserirNo(num);
        
        num = 4;
        
        arv.inserirNo(num);
        
        num = 5;
        
        arv.inserirNo(num);
        
        arv.exibirNo();
        
        System.exit(0);
    }
}

class BIntNo
{
    int valor;
        
    BIntNo esq, dir;
        
    BIntNo(int novoValor)
    {
        valor = novoValor;
    }
}

class ArvoreBinaria
{
    BIntNo raiz;
    
    BIntNo inserir(BIntNo arvore, int novoNo)
    {
        if(arvore == null)
        {
            return new BIntNo(novoNo);
        }
        
        else
        {
            if(novoNo < arvore.valor)
            {
                arvore.esq = inserir(arvore.esq, novoNo);
            }
            
            else
            {
                arvore.dir = inserir(arvore.dir, novoNo);
            }
        }
        
        return arvore;
    }
    
    public void inserirNo(int novoValor)
    {
        raiz = inserir(raiz, novoValor);
    }
    
    public void exibirEsquerdo(BIntNo arv)
    {
        if(arv != null)
        {
            exibirEsquerdo(arv.esq);
            
            System.out.println(arv.valor);
        }
    }
    
    public void exibirNoEsq()
    {
        exibirEsquerdo(raiz);
    }
    
    public void exibirDireito(BIntNo arv)
    {
        if(arv != null)
        {
            exibirDireito(arv.dir);
            
            System.out.println(arv.valor);
        }
    }
    
    public void exibirNoDir()
    {
        exibirDireito(raiz);
    }
    
    public void exibirRaiz()
    {
        System.out.println("Raiz: " + raiz.valor);
    }
    
    public void exibirNo()
    {
        exibirNoEsq();
        
        exibirRaiz();
        
        exibirNoDir();
    }
    
    public void excluirNo(int item)
    {
        BIntNo tempNo, pai, filho, temp;
        
        tempNo = raiz;
        
        pai = null;
        
        filho = raiz;
        
        while(tempNo != null && tempNo.valor != item)
        {
            pai = tempNo;
            
            if(item < tempNo.valor)
            {
                tempNo = tempNo.esq;
            }
            
            else
            {
                tempNo = tempNo.dir;
            }
            
            if(tempNo == null)
            {
                System.out.println("Item não localizado.");
            }
            
            if(pai == null)
            {
                if(tempNo.dir == null)
                {
                    raiz = tempNo.esq;
                }
                
                else
                {
                    if(tempNo.esq == null)
                    {
                        raiz = tempNo.dir;
                    }
                    
                    else
                    {
                        for(temp = tempNo, filho = tempNo.esq; filho.dir != null; temp = filho, filho = filho.dir)
                        {}
                        
                        if(filho != tempNo.esq)
                        {
                            temp.dir = filho.esq;
                        }
                        
                        filho.dir = tempNo.dir;
                        
                        if(pai.esq == tempNo)
                        {
                            pai.esq = filho;
                        }
                        
                        else
                        {
                            pai.dir = filho;
                        }
                    }
                }
            }
        }
    } 
}
