package udemy.classes.metodos.Nullo;

// NULL É DIFERENTE DE VAZIO
public class ValorNulo {
    public static void main(String[] args) {
        String s1 = "";

        System.out.println(s1.concat("!!!"));

        String s2 = null;
        if (s2 != null){
            System.out.println(s2.concat("???")); // TESTEANDO A VALIAVEL S2 É NULA
        }else {
            System.out.println("Valiavel s2 esta nula, e isso pode gerar erros de RumTime");
        }
        //System.out.println(s2.concat("???")); // SE COMENTAR O SE TODO E TENTAR RODAR, IRA DAR ERRO DE RUMTIME


    }
}
