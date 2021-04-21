package testaanimal;
public class TestaAnimal {
    public static void main(String[] args) {
        // Usando a classe Animal
        Animal tigre = new Animal();
        tigre.comer(4);
        tigre.dormir(3);
        
        // Usando a classe Mamifero
        Mamifero golfinho = new Mamifero(2, 2);
        
        golfinho.Qt_restante_gestacoes_esse_ano(1);
        
        System.out.println("O golfinho tem até " + golfinho.getQt_filhotes_gestacao() + " filhotes em uma gestação");
        
        // Usando classe Ave
        Ave aguia = new Ave("preto", "pontudo");
        aguia.tipo_de_presa(aguia.getTipo_do_bico());
        
        // Usando classe Reptil
        Reptil iguana = new Reptil("lisa", 3);
        iguana.banho_de_sol();
        
        // Observação: Não apliquei todos os métodos, para não ficar muito longo
        // mas, todos foram testados.
    }   
}
