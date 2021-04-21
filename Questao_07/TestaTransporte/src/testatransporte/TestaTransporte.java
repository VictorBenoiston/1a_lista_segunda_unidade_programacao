package testatransporte;
public class TestaTransporte {
    public static void main(String[] args) {
        // Testando a classe Transporte
       Transporte transporte_teste = new Transporte();
       transporte_teste.capacidade_de_ocupantes = 21;
        System.out.println("A capacidade de ocupantes do transporte teste, é de " + transporte_teste.capacidade_de_ocupantes + " ocupantes.");
        
        // Testando a classe TransporteAquatico
        TransporteAquatico barco = new TransporteAquatico();
        barco.capacidade_de_ocupantes = 12;
        barco.setCapacidade_de_flutuacao(21);
        barco.setTipo_de_propulsao("vento");
        
        System.out.println("Para o barco: ");

        barco.corpo_imerso(barco.getTipo_de_propulsao());
        barco.classificacao(barco.getTipo_de_propulsao(), barco.capacidade_de_ocupantes);
        
        
        // Testando a classe TransporteTerrestre
        TransporteTerrestre automovel = new TransporteTerrestre();
        automovel.capacidade_de_ocupantes = 5;
        automovel.setQt_rodas(4);
        automovel.setQt_portas(4);
        
        System.out.println("Para o automovel: ");
        
        automovel.cabine(automovel.getQt_rodas(), automovel.capacidade_de_ocupantes);
        automovel.tipo(automovel.getQt_rodas());
        
        // Testando a classe TransporteAereo
        TransporteAereo aviao = new TransporteAereo();
        aviao.capacidade_de_ocupantes = 200;
        aviao.setCompanhia_aerea("American airlines");
        aviao.setPeso_bruto(22000);
        
        System.out.println("Para o avião: ");
        
        aviao.velocidade_de_voo(aviao.getPeso_bruto(), aviao.capacidade_de_ocupantes);
        aviao.capacidade_de_carga(aviao.getPeso_bruto());
    }
    
}
