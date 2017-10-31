package exercicio_07;

public class Exercicio_07 {

    static Cachorro c = new Cachorro();
    static Gato g = new Gato();
    
    public void AlimentarAnimal(Animal animal){
        animal.Comer();
    }
    
    public void EspantarAnimal(Animal animal){
        animal.Correr();
    }
    
    public static void main(String[] args) {
        Exercicio_07 bicho = new Exercicio_07();
        bicho.AlimentarAnimal(c);
        bicho.EspantarAnimal(g);
    }
}