package udemy;

public class unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a++;
        System.out.println(a);
        a --;
        System.out.println(a);

        System.out.println(b);
        System.out.println(++a == b-- ? "Sim" : "Nao");
        System.out.println(a == b ? "Sim" : "Nao");



    }
}
