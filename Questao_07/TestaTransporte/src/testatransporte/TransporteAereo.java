package testatransporte;
public class TransporteAereo extends Transporte{
    private int peso_bruto;
    private String companhia_aerea;

    public int getPeso_bruto() {
        return peso_bruto;
    }

    public String getCompanhia_aerea() {
        return companhia_aerea;
    }

    public void setPeso_bruto(int peso_bruto) {
        this.peso_bruto = peso_bruto;
    }

    public void setCompanhia_aerea(String companhia_aerea) {
        this.companhia_aerea = companhia_aerea;
    }
    
    void velocidade_de_voo(int peso, int ocupantes){
        if(peso <= 22000){
            if (ocupantes >= 20 && ocupantes <= 800){
                System.out.println("A velocidade média desse avião é de 600km/h");
            }else {
                System.out.println("Não há como averiguar a velocidade média.");
            }
        }else{
            if (ocupantes <= 20){
                System.out.println("A velocidade média desse avião é de 700km/h");
            }else{
                System.out.println("A velocidade média desse avião é de 750km/h");
            }
        }
        
    }
    
    void capacidade_de_carga(int peso){
        if (peso >= 22000 && peso <= 30000){
            System.out.println("A capacidade média de carga desse avião, é de 25 toneladas.");
        }if (peso >= 150000 && peso <= 300000){
            System.out.println("A capacidade de carga desse avião varia, entre 100 e 250 toneladas.");
        }
    }
}
