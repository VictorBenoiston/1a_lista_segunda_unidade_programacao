package testaventilador;

    public class Ventilador {
    private String marca;
    private String modelo;
    private int velocidade;
    
    void ligar(){
    if (velocidade == 0){
        velocidade = 1;  //Adotei o 1 apenas como padrão.
    }else{
        System.out.println("O ventilador já se encontra ligado! Você pode aumentar a velocidade, se quiser.");
    }
    }
        
    void desligar(){
    if (velocidade == 0){
        System.out.println("O ventilador já se encontra desligado!");
    }else{
        velocidade = 0;
    }
    }
    
    void aumentarVelocidade(int vel){
        velocidade = vel;
    }
    
    String getMarca(){
        return marca;
    }
    
    String getModelo(){
        return modelo;
    }
    
    int getVelocidade(){
        return velocidade;
    }
    
    
    // Construtor 01:
    Ventilador (String nova_marca, String novo_modelo, int nova_velocidade){
        marca = nova_marca;
        modelo = novo_modelo;
        velocidade = nova_velocidade;
    }
    
    // Construtor 02:
    Ventilador(int nova_velocidade){
        velocidade = nova_velocidade;
    }
    
    }

