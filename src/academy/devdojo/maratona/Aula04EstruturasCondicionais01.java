package academy.devdojo.maratona;

public class Aula04EstruturasCondicionais01 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulto
        int idade = 17;
        String categoria;
        if (idade < 15){
            System.out.println("categoria infantil");
        } else if (idade >= 15 && idade < 18 ) {
            System.out.println("categoria juvenil");
        }else {
            System.out.println("categoria adulto");
        }
    }
}
