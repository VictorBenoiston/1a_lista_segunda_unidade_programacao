package testatransporte;
public class TransporteAquatico extends Transporte{
    private int capacidade_de_flutuacao;
    private String tipo_de_propulsao;

    public int getCapacidade_de_flutuacao() {
        return capacidade_de_flutuacao;
    }

    public String getTipo_de_propulsao() {
        return tipo_de_propulsao;
    }

    public void setCapacidade_de_flutuacao(int capacidade_de_flutuacao) {
        this.capacidade_de_flutuacao = capacidade_de_flutuacao;
    }

    public void setTipo_de_propulsao(String tipo_de_propulsao) {
        this.tipo_de_propulsao = tipo_de_propulsao;
    }
    
    void corpo_imerso(String tipo){
        if (tipo.equals("vento")){
            System.out.println("De acordo com o tipo de propulsão, em média, 25% do barco fica imerso.");
        }if (tipo.equals("propulsor")){
            System.out.println("De acordo com o tipo de propulsão, em média, 17% do barco fica imerso.");
        }else{
            System.out.println("Não existe valor tabelado para esse tipo de propulsão");
        }
    }
    
    void classificacao(String tipo, int ocupacao){
        if (tipo.equals("propulsor")){
            if (ocupacao <= 20){
                System.out.println("Provavelmente se trata de um Yate.");
            }
            if (ocupacao > 20 && ocupacao <= 100){
                System.out.println("Provavelmente se trata de um navio");
            }else{
                System.out.println("Provavelmente se trata de um transatlântico");
            }
        }

    }
}
