package testaanimal;
public class Reptil extends Animal{
    private String tipo_de_escamas;     // aspera ou lisa.
    private int qt_ovos_por_gestacao; 
    
    void banho_de_sol(){
        if (tipo_de_escamas.equals("aspera")){
            System.out.println("Esse réptil precisa de mais sol!");
        }else{
            System.out.println("Esse réptil precisa de menos sol!");
        }
    }
    
    void chance_de_chegar_a_vida_adulta(){
        if (qt_ovos_por_gestacao <= 2){
            System.out.println("Geralmente, um chega à vida adulta.");
        }if (qt_ovos_por_gestacao <= 5 && qt_ovos_por_gestacao > 2){
            System.out.println("Geralmente, dois chegam à vida adulta.");
        }if (qt_ovos_por_gestacao <= 12 && qt_ovos_por_gestacao >5){
            System.out.println("Geralmente, até seis chegam à vida adulta.");
        }else{
            System.out.println("Não existe esse réptil.");
        }
    }
        
    void acontece_em_qual_regiao(){
        if (tipo_de_escamas.equals("lisa")){
            System.out.println("Este animal está propenso a pertencer ao hemsfério norte");
        }else{
            System.out.println("Este animal está propenso a pertencer ao hemsfério sul");
        }
    }
    
    Reptil(String escamas,int qt_ovos){
        tipo_de_escamas = escamas;
        qt_ovos_por_gestacao = qt_ovos;
    }
}

