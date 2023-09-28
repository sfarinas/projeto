package udemy.classes.metodos.Desafio;

public class Jantar {
    public static void main(String[] args) {

        double PessoaComeComida = 0;

        Comida c1 = new Comida();
        c1.nomeComida = "Feijao";
        c1.pesoComida = 0.30;

        Pessoa p1 = new Pessoa();
        p1.nomePessoa = "Salomao";
        p1.pesoPessoa = 100.15;

        PessoaComeComida = p1.pesoPessoa + c1.pesoComida;

        System.out.println("A pessoa " + p1.nomePessoa + " antes de comer, estava com "
        + p1.pesoPessoa + " Kg. apos comer ela ficou com " + PessoaComeComida);


    }
}
