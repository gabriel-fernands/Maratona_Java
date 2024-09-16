package academy.devdojo.maratona.intoducaoOrientacaObjeto.test;

import academy.devdojo.maratona.intoducaoOrientacaObjeto.domein.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 33;
        estudante.sexo = 'M';
        System.out.println(estudante);
    }
}
