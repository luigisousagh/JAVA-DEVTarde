package EstruturaDecisaIf;

import java.util.Scanner;

public class DecisaoIf {
    public void desconto() {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println ("Informe o preço do produto:");
    double precoProduto = sc.nextDouble();
    double desconto = 0.0;
    if (precoProduto>=100 && precoProduto< 200){
        desconto = 5.0;
    }
    if (precoProduto>=200 && precoProduto< 300){
        desconto = 10.0;
    }
    if (precoProduto>=300){
        desconto = 15.0;
    }
        double valorDesconto = precoProduto*desconto/100;
        double precoFinal = precoProduto - valorDesconto;
        System.out.println("O valor do produto é de R$ " + precoFinal);

 }
}
