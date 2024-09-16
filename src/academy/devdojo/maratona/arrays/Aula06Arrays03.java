package academy.devdojo.maratona;

import java.util.Arrays;

public class Aula06Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros1 = {1, 2, 3, 4, 5};
        int[] numeros2 = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < numeros1.length; i++) {
            System.out.println(i);
            for (int num : numeros2){
                System.out.println(num);
            }
        }

    }
}
