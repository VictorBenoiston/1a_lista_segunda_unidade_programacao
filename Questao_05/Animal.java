package testaanimal;
public class Animal {
    String especie;
    int nivel_de_fome;      // Escala que vai de 0 a 10
    int nivel_de_cansaco;  // Escala que vai de 0 a 10

    
    void comer (int nivel_de_saciedade){
        int novo_nivel_de_fome = nivel_de_fome + nivel_de_saciedade;
        if (novo_nivel_de_fome > 10){
            nivel_de_fome = 10;
        }else{
            nivel_de_fome = novo_nivel_de_fome;
        }
    }
    
    void dormir (int nivel_de_sono){
        int novo_nivel_de_descanso = nivel_de_sono + nivel_de_cansaco;
        if (novo_nivel_de_descanso > 10){
            nivel_de_cansaco = 10;
        }else{
            nivel_de_cansaco = novo_nivel_de_descanso;
        }
    }
}


