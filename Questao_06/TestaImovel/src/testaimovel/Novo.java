package testaimovel;
public class Novo extends Imovel {
    private double adicional_no_preco;
    // Considerei o adicional como sendo 15% do valor original.

    public void setAdicional_no_preco() {
        double adicional = this.preco * 0.15;
        adicional_no_preco = adicional;
    }

    public double getAdicional_no_preco() {
        return adicional_no_preco;
    }
    
    void adicionar(){
        double valor_final = this.preco + adicional_no_preco; 
        System.out.println("o valor final será: R$" + valor_final);
    }
    
    
    
}
