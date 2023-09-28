package udemy.classes.metodos.classeVsInstancia;

public class AreaCirc {

    double raio;
    static double pi = 3.14;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        // DUAS FORMAS DE SER FEITO.
        return pi * raio * raio;
        //return pi * Math.pow(raio, 2);
    }
}
