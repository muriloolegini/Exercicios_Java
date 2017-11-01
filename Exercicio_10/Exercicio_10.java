package exercicio_10;

import javax.swing.JOptionPane;

public class Exercicio_10 {

    public static void main(String[] args) {
        try{
            int valor = 30;
            int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
            int[] Array = { 1, 2, 3 };
            System.out.println("Total: " + valor / divisor);
            System.out.println("Valor do array: " + Array[4]);
        } catch (ArithmeticException e) {
            System.out.println("Não existe divsão por zero. \nMotivo: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fora do limite do array. \nMotivo: " + e);
        }
    }
}