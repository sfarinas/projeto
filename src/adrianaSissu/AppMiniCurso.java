package adrianaSissu;

import adrianaSissu.Eransa.Artigo;
import adrianaSissu.Eransa.Palestra;

public class AppMiniCurso {
    public static void main(String[] args) {
        miniCurso c1 = new miniCurso();
        c1.entradaDados();
        c1.imprimir();

        Palestra p1 = new Palestra();
        p1.entradaDeDados();
        p1.imprimir();

        Artigo a1 = new Artigo();
        a1.entradaDeDados();
        a1.imprimir();


    }
}
