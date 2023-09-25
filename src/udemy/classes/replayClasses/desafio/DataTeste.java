package udemy.classes.replayClasses.desafio;

public class DataTeste {
    public static void main(String[] args) {
        Data dt2 = new Data(10, 04, 1984);

        Data dt = new Data();
        dt.dia = 25;
        dt.mes = 06;
        dt.ano = 1979;

        Data dt1 = new Data();

        String dataFormatada1 = dt1.obterDataFormatada();

        System.out.println(dataFormatada1);

        if (dt.dia == 25 && dt.mes == 06 && dt.ano == 1979){
            System.out.println(dt.obterDataFormatada());
            System.out.println("Niver Salomao !");
        }else {
            System.out.println("Nao é aniversario Salomao");
            System.out.println();
        }

        if (dt2.dia == 16 && dt2.mes == 02 && dt2.ano == 2016){
            System.out.println(dt2.obterDataFormatada());
            System.out.println("Niver Sara !");
        } else {
            System.out.println(dt2.obterDataFormatada());
            System.out.println("Nao é aniversario Sara");
            System.out.println();
        }
    }


}
