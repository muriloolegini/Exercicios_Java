package exercicio_05;

public class Cachorro extends Animal implements Mamifero{
    String dono;
    String corPelo;
    boolean coleira;
    int numFilhotes;

    public Cachorro(String dono, String corPelo, boolean coleira, int numFilhotes) {
        super("Rex", 2, 1.20f, "Cachorro");
        this.dono = dono;
        this.corPelo = corPelo;
        this.coleira = coleira;
        this.numFilhotes = numFilhotes;
    }
    
    public void ApresentarCachorro(){
        super.ApresentarAnimal();
        String auxiliar = "";
        System.out.format("O dono do cachorro chama-se %s \nA cor do pelo do animal é %s \nEle(a) %s coleira "
                + "\nEle(a) tem %d filhotes\n----------------------------------\n", dono, corPelo, auxiliar = (coleira == true ? "possui" : "não possui"), numFilhotes);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O cachorro latiu!");
    }

    @Override
    public void correr() {
        System.out.println("O cachorro correu!");
    }

    @Override
    public void alimentar() {
        System.out.println("O cachorro comeu!");
    }

    @Override
    public void mamar() {
        System.out.println("O cachorro mamou!");
    }
}