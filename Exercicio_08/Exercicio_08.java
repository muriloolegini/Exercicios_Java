package exercicio_08;

import java.util.Arrays;

public class Exercicio_08 {

    public static void main(String[] args) {
        int[] lista ={ 1,2,3,4,9,5,8,7,6 };
        Arrays.sort(lista);
        for (int i = 0; i < lista.length; i++) {
            //System.out.print(Arrays.asList(lista[i]));
            System.out.format("%d ", lista[i]);
        }
        System.out.println();
    }
}