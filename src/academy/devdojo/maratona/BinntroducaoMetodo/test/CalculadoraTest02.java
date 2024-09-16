package academy.devdojo.maratona.BinntroducaoMetodo.test;

import academy.devdojo.maratona.BinntroducaoMetodo.domein.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumaros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();

    }
}
