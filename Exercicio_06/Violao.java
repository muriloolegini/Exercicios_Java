package exercicio_06;

public class Violao extends Instrumento{
    String cor;
    String modelo;
    float peso;

    public Violao(String cor, String modelo, float peso) {
        super("Tornante", 250.54f);
        this.cor = cor;
        this.modelo = modelo;
        this.peso = peso;
    }
    
    public void MostrarInstrumento(){
        System.out.format("Marca: %s \nPreço: %.2f \nCor: %s \nModelo: %s \nPeso: %.2f \n", marca, preco, cor, modelo, peso);
    }
    
    @Override
    public void Tocar(){
        System.out.println("O violão está tocando!");
    }
    
    @Override
    public void Afinar(){
        System.out.println("O violão está sendo afinado!");
    }
}