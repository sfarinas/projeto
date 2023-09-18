package udemy;

public class Relacionais {
    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println( a == b );
        System.out.println( 3 > 4 );
        System.out.println( 3 >= 4 );
        System.out.println( 30 != 7 );

        double nota = 6.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;

        boolean temDesconto = bomComportamento && passouPorMedia;

        String descontoSim ;
        if (passouPorMedia == true){
            descontoSim = "SIM";
        }else {
            descontoSim = "NÃO";
        }
        System.out.println("Tem desconto ? " + descontoSim);
    }
}
