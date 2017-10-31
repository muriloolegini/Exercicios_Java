package exercicio_07;

public class Cachorro extends Animal {
    String dono;
    String corPelo;
    boolean coleira;
    int numFilhotes;

    /*public Cachorro(String dono, String corPelo, boolean coleira, int numFilhotes) {
        super("Rex", 2, 1.20f, "Cachorro");
    }*/

    Cachorro() {
        super("Rex", 2, 1.20f, "Cachorro");
    }
    
    @Override
    public void Comer(){
        System.out.println("O cachorro está comendo!");
    }
    
    @Override
    public void Correr(){
        System.out.println("O cachorro está correndo!");
    }
}