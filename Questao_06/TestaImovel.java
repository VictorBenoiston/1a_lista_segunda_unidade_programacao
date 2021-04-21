package testaimovel;
public class TestaImovel {
    public static void main(String[] args) {
        // Testando a classe Imovel
        Imovel imovel_0 = new Imovel();
        imovel_0.endereco = "Rua Asmildo Campos, 59, 59617-320";
        imovel_0.preco = 75000.00;
        
        System.out.println("O primeiro imóvel, é localizado na: " + imovel_0.endereco + "\nE custa: R$" + imovel_0.preco);
        
        // Testando a classe Novo
        Novo imovel_1 = new Novo();
        imovel_1.endereco = "Rua Frei Camarões, 21, 58980-200";
        imovel_1.preco = 89000.00;
        imovel_1.setAdicional_no_preco();
        System.out.println("O segundo imóvel, é localizado na: " + imovel_1.endereco + "\nE custa: R$" + imovel_1.preco);
        System.out.println("O valor do imóvel era: R$" + imovel_1.preco + " mas, como se trata de um imóvel novo, ");
        System.out.println("recebeu um adicional de: R$" + imovel_1.getAdicional_no_preco() + " (15%) logo,");
        imovel_1.adicionar();
        
        // Testando a classe Velho
        Velho imovel_2 = new Velho();
        imovel_2.endereco = "Rua Romero Carlos, 99, 58900-560";
        imovel_2.preco = 120000.00;
        imovel_2.setDesconto_no_preco();
        System.out.println("O terceiro imóvel, é localizado na: " + imovel_2.endereco + "\nE custa: R$" + imovel_2.preco);
        System.out.println("O valor do imóvel era: R$" + imovel_2.preco + " mas, como se trata de um imóvel velho, ");
        System.out.println("recebeu um desconto de: R$" + imovel_2.getDesconto_no_preco() + " (15%) logo,");
        imovel_2.descontar();

        
        
    }
    
}
