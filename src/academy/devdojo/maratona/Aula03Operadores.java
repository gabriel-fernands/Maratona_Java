package academy.devdojo.maratona;

public class Aula03Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero02 / (double) numero01;
        System.out.println(resultado);
        // %
        int resto = 21 % 7;
        System.out.println(resto);
        // < >
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 20 < 10;
        boolean isDezIgualVinte = 10 == 20;
        boolean isVinteIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isVinteIgualDez " + isVinteIgualDez);
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

    }
}
