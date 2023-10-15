package udemy2.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println("Carro vazio esta ligado : " + c1.estaLigado());

        c1.ligar();
        System.out.println("Virou a chave do carro, carro ligou : " + c1.estaLigado());
        System.out.println();

        System.out.println("Carro ligado e parado, o RPM esta em : " + c1.motor.giros());
        System.out.println();

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println("Carro andando e pisando no acerelador, o RPM foi em : " + c1.motor.giros());
        System.out.println();

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println("Carro ligado e parado, o RPM esta em : " + c1.motor.giros());
        System.out.println();

        System.out.println(c1.motor.carro.motor.carro.motor.giros());


    }
}
