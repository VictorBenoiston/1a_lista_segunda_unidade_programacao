package testaanimal;
public class Ave extends Animal {
    private String cor_das_penas;
    private String tipo_do_bico;
    
    void voar(int horas_de_voo){
        System.out.println("A ave realizou um voo de " + horas_de_voo + " hora(s).");
    }
    
    void tipo_de_presa(String tipo_do_bico){
        if(tipo_do_bico.equals("longo")){
            System.out.println("Presas subterrêneas");
        }if (tipo_do_bico.equals("pontudo")){
            System.out.println("Presas vivas");
        }else{
            System.out.println("Não tem tipo específico de presa");
        }
    }    
    Ave(String cor, String tipo){
       cor_das_penas = cor;
       tipo_do_bico = tipo;
    }

    public String getCor_das_penas() {
        return cor_das_penas;
    }

    public String getTipo_do_bico() {
        return tipo_do_bico;
    }
}

