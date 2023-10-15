package udemy.Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        for(Usuario u: lista) {
            System.out.println(u.toString());

        }
        System.out.println();
        System.out.println(lista.get(3).nome);
        System.out.println(lista.get(3));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Ola isso é um teste, " + lista.get(i));
        }
        System.out.println();

        String indice = lista.get(0).nome;
        System.out.println(indice);



    }

}
