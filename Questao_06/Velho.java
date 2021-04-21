package testaimovel;
public class Velho extends Imovel{
    double desconto_no_preco;
    // Considerei o desconto sendo 15% do valor original.
    
    public void setDesconto_no_preco(){
        desconto_no_preco = this.preco * 0.15;
    }
    
    public double getDesconto_no_preco(){
        return desconto_no_preco;
    }
    
    void descontar(){
        double valor_final = this.preco - this.desconto_no_preco;
        System.out.println("o valor final, é: R$" + valor_final);
    }
    
    
}
