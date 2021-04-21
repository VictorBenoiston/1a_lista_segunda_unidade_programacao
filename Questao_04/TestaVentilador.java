package testaventilador;
public class TestaVentilador {
    public static void main(String[] args) {
        //Instanciando o primeiro ventilador "v1" com o primeiro construtor.
        Ventilador v1 = new Ventilador("Malory", "A21", 4);
        // Instanciando o segundo ventilador "v2" com o segundo construtor.
        Ventilador v2 = new Ventilador (2);
        
        //Usando os métodos:
        v1.aumentarVelocidade(3);
        v1.desligar();
        v2.desligar();
    }
}
