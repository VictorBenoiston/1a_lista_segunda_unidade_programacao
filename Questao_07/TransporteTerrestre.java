package testatransporte;
public class TransporteTerrestre extends Transporte{
    private int qt_rodas;
    private int qt_portas;

    public int getQt_rodas() {
        return qt_rodas;
    }

    public int getQt_portas() {
        return qt_portas;
    }

    public void setQt_rodas(int qt_rodas) {
        this.qt_rodas = qt_rodas;
    }

    public void setQt_portas(int qt_portas) {
        this.qt_portas = qt_portas;
    }
    
    
    void tipo(int n_rodas){
        if (n_rodas == 4){
            System.out.println("Se trata de um carro");
        }if (n_rodas == 3){
            System.out.println("Se trata de um triciclo");
        }if (n_rodas == 2){
            System.out.println("Se trata de uma moto");
        }
    }
    
    void cabine(int n_rodas,int ocupantes){
        if (n_rodas == 4){
            if (ocupantes == 2){
                System.out.println("Se trata de um carro de cabine simples");
            }else{
                System.out.println("Se trata de um carro cabine dupla");
            }
        }
    }
    
    
}
