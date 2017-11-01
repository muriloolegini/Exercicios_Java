package exercicio_09;

public class Exercicio_09 {

    public static void main(String[] args) {
        int valor = 50;
        int denominador = 0;
        try{
            System.out.println("Resultado = " + valor / denominador);
        } catch (Exception e) {
            System.out.println("Não há divisão por 0.\nMotivo do erro: " + e);
        }
    }
}