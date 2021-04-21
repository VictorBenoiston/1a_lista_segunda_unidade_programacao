package testaanimal;
public class Mamifero extends Animal {
    private int Qt_filhotes_gestacao;
    private int Qt_gestacoes_por_ano;
    
    public void Qt_restante_gestacoes_esse_ano(int Qt_gestacoes_usadas){
        int Qt_restante = Qt_gestacoes_por_ano - Qt_gestacoes_usadas;
        System.out.println("Como já houve " + Qt_gestacoes_usadas + " gestação");
        System.out.println("Restam: " + Qt_restante + " gestações esse ano!");
    }
    
        // Criando construtor com todos as features
    Mamifero (int Qt_filhotes, int Qt_gestacoes){
        Qt_filhotes_gestacao = Qt_filhotes;
        Qt_gestacoes_por_ano = Qt_gestacoes;
    }

    public int getQt_filhotes_gestacao() {
        return Qt_filhotes_gestacao;
    }

    public int getQt_gestacoes_por_ano() {
        return Qt_gestacoes_por_ano;
    }
}
