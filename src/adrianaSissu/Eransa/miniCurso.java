package adrianaSissu.Eransa;
import java.util.Scanner;

public class miniCurso extends Submissao{
    /**
     * ATRIBUTOS
     *     String titulo, objetivo, publico;
     *     int duracao, situacao;
     */
    String  objetivo, publico;
    int duracao;


    /**
     * set
     * @param o
     */
    public void setObjetivo(String o){
        objetivo = o;
    }

    /**
     * set
     * @param p
     */
    public void setPublico(String p){
        publico = p;
    }

    /**
     * set
     * @param d
     */
    public void setDuracao(int d){
        duracao = d;
    }


    /**
     * get
     * @return
     */
    public String getObjetivo(){
        return objetivo;
    }
    public String getPublico(){
        return publico;
    }
    public int getDuracao(){
        return duracao;
    }



    /**
     * Scanner entrada de Dados.
     */
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Mini Curso -----------");

        super.entradaDeDados();
        System.out.println("Objetivo texto..:");
        setObjetivo(sc.nextLine());

        System.out.println("Publico texto..:");
        setPublico(sc.nextLine());

        System.out.println("Duração inteiro..:");
        setDuracao(Integer.parseInt(sc.nextLine()));
    }

    /**
     * Metodo Imprimir
     */
    public void imprimir(){
        System.out.println("=============================================================");
        super.imprimir();
        System.out.println("Objetivo ....." + getObjetivo());
        System.out.println("Publico Alvo ." + getPublico());
        System.out.println("Duração ......" + getDuracao());

    }


}
