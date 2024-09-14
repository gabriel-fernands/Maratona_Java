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
        // && (AND) // (or) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 200;
        float valorPlaystation = 500F;
       boolean isPlaystationCincoCompravel =  valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
        // ++ --
        int contador = 0;
        contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(++contador2);
        System.out.println(contador2);


    }
}
