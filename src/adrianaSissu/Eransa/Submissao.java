package adrianaSissu.Eransa;

import java.util.Scanner;

public class Submissao {
    String titulo;
    int situacao;

    // set
    public void setTitulo(String t){
        titulo = t;
    }
    public void setSituacao(int s){
        situacao = s;
    }

    // get
    public String getTitulo(){
        return titulo;
    }
    public int getSituacao(){
        return situacao;
    }

    public void entradaDeDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Titulo da classe Submissao txt ..: ");
        setTitulo(sc.nextLine());
        System.out.println("Situacao da classe Submissao inteiro..: ");
        setSituacao(Integer.parseInt(sc.nextLine()));
    }

    public void imprimir(){
        System.out.println("======================================");
        System.out.println("Titulo da super classe ....." + getTitulo());
        System.out.println("Situacao da super Classe ..." + getSituacao());
    }

}
