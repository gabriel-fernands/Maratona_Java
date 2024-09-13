package academy.devdojo.maratona;

public class Aula01TiposPrimitivos {
    public static void main(String[] args) {
        //int,double,float,char,byte,short,long,boolean
        int idade = (int) 10000000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Goku";
        var nome2 = "vegeta";

        System.out.println(" A idade é " + idade+ " anos");
        System.out.println(false);
        System.out.println("char " + caractere);
        System.out.println("OI Meu Nome é " + nome);
        System.out.println("OI Meu Nome é " + nome2);
    }
}
