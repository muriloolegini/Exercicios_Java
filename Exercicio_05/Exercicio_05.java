package exercicio_05;

public class Exercicio_05 {

    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Murilo", "Marrom", false, 0);
        cao.ApresentarCachorro();
        cao.fazerBarulho();
        cao.correr();
        cao.alimentar();
        cao.mamar();
    }
}