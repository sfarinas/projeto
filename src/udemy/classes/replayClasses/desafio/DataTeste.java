package udemy.classes.replayClasses.desafio;

public class DataTeste {
    public static void main(String[] args) {
        Data dt = new Data();
        dt.dia = 26;
        dt.mes = 06;
        dt.ano = 1979;

        if (dt.dia == 25 && dt.mes == 06 && dt.ano == 1979){
            System.out.println("Niver Salomao !");
        }else {
            System.out.println("Nao é aniversario Salomao");
        }
    }


}
