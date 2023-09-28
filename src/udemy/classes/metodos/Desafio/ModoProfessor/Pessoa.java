package udemy.classes.metodos.Desafio.ModoProfessor;

public class Pessoa {
    String nome;
    double peso, come;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    void comer(Comida comida){
        if (comida != null){
            //come = this.peso + comida.peso; // EU ACRECENTEI
            this.peso += comida.peso;
        }else {
            System.out.println("ERRO COMER");
        }
    }
    String apresentar(){
        return "Ola eu sou o " + nome + " e tenho " + peso + " Kgs";
    }
}
