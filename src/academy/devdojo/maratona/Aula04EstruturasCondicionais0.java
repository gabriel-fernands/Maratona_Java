package academy.devdojo.maratona;

public class Aula04EstruturasCondicionais0 {
    public static void main(String[] args) {
  // Utilizando switch e dados os valores  de 1 a 7, imprima se é dia útil ou final de semana
        //Considerando 1 como domingo
        byte dia = 6;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDN");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dias Uteis");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }
}
