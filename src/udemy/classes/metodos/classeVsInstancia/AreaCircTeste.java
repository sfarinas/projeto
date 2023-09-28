package udemy.classes.metodos.classeVsInstancia;

public class AreaCircTeste {
    public static void main(String[] args) {
        AreaCirc a = new AreaCirc(5.6);
        AreaCirc.pi = 100;

        AreaCirc b = new AreaCirc(5);
        AreaCirc.pi = 1.14;

        System.out.println(a.area());
        System.out.println(b.area());

    }
}
