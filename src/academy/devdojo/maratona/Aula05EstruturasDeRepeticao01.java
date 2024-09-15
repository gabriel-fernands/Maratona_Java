package academy.devdojo.maratona;

public class Aula05EstruturasDeRepeticao01 {
    public static void main(String[] args) {
   // while, do while, for
        int count = 0;
        while (count < 10){
         //   System.out.println(count = count + 1);
            System.out.println(++count);
        }
        int count01 = 0;
        while (count01 < 10){
          //  count01 = count01 + 1;
            System.out.println("-------" + count01++ +   "----------");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(++i);
        }
    }
}
