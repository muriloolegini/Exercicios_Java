package exercicio_06;

public class Instrumento {
    String marca;
    float preco;

    public Instrumento(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }
    
    public void Tocar(){
        System.out.println("O instrumento está tocando!");
    }
    
    public void Afinar(){
        System.out.println("O instrumento está sendo afinado!");
    }
}