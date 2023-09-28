package udemy.classes.metodos;

public class Data {
    int dia, diaAtual;
    int mes, mesAtual;
    int ano, anoAtual;
    int niver;
    String nome;

    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }

    Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }
    Data(int dia, int mesInicial, int anoInicial){
        this.dia = dia ++;
        mes = mesInicial;
        ano = anoInicial;
    }
    int calculo(int diaExato, int mesEaxto, int anoExato ){
        diaExato = diaAtual - niver;
        mesEaxto = mesAtual - niver;
        anoExato = anoAtual - niver;
        return calculo(diaExato, mesEaxto, anoExato);
    }

}