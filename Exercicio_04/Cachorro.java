package exercicio_04;

public class Cachorro extends Animal{
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
}