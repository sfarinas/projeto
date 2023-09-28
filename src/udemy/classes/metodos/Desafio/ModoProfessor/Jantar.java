package udemy.classes.metodos.Desafio.ModoProfessor;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.200);
        Comida c2 = new Comida("Feijao", 0.013);
        Comida c3 = new Comida("Nugats", 0.23);

        Pessoa p1 = new Pessoa("João", 113.06);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());
        p1.comer(c2);
        System.out.println(p1.apresentar());
        p1.comer(c3);

        System.out.println(p1.apresentar());
    }
}
