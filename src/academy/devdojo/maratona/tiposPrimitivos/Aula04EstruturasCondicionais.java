package academy.devdojo.maratona;

public class Aula04EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutoricadoComprarBebida = idade >= 18;
        if (isAutoricadoComprarBebida) {
            System.out.println(" Autorizado a compra bebida alcólica");
        }else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        if (!isAutoricadoComprarBebida) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if (c == false){
            System.out.println("dentro de algo que nunca deve ser feito");
        }
    }
}
