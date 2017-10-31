package exercicio_07;

public class Gato extends Animal{
    String dono;
    String corPelo;
    boolean coleira;
    int numFilhotes;

    /*public Gato(String dono, String corPelo, boolean coleira, int numFilhotes) {
        super("Félix", 2, 1f, "Gato");
    }*/

    Gato() {
        super("Félix", 2, 1f, "Gato");
    }
    
    @Override
    public void Comer(){
        System.out.println("O gato está comendo!");
    }
    
    @Override
    public void Correr(){
        System.out.println("O gato está correndo!");
    }
}