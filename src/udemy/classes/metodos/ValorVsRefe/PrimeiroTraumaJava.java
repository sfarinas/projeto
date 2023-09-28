package udemy.classes.metodos.ValorVsRefe;

public class PrimeiroTraumaJava {
    int a = 3;
    public static void main(String[] args) {

        //int b = PrimeiroTraumaJava.this.a;
        PrimeiroTraumaJava b = new PrimeiroTraumaJava();


        System.out.println(b.a);
    }
}
