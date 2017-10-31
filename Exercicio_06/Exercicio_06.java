package exercicio_06;

public class Exercicio_06 {

    public static void main(String[] args) {
        Violao violao = new Violao("Vermelho", "Básico", 250f);
        violao.MostrarInstrumento();
        violao.Afinar();
        violao.Tocar();
    }
}