package udemy.classes.EqualsEHashcode;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.senha = "pedro.silva@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.senha = "pedro.silva@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        System.out.println(u1.equals(new Date()));


    }
}
