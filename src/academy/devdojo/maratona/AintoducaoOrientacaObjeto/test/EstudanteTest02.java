package academy.devdojo.maratona.AintoducaoOrientacaObjeto.test;

import academy.devdojo.maratona.AintoducaoOrientacaObjeto.domein.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 33;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
