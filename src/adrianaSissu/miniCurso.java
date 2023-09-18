package adrianaSissu;
import java.util.Scanner;
public class miniCurso {
    /**
     * ATRIBUTOS
     *     String titulo, objetivo, publico;
     *     int duracao, situacao;
     */
    String titulo, objetivo, publico;
    int duracao, situacao;

    /**
     * set
     * @param t
     */

    public void setTitulo(String t){
        titulo = t;
    }

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
     * set
     * @param s
     */
    public void setSituacao(int s){
        situacao = s;
    }

    /**
     * get
     * @return
     */
    public String getTitulo(){
        return titulo;
    }
    public String getObjetivo(){
        return objetivo;
    }
    public String getPublico(){
        return publico;
    }
    public int getDuracao(){
        return duracao;
    }
    public int getSituacao(){
        return situacao;
    }


    /**
     * Scanner entrada de Dados.
     */
    public void entradaDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------- Mini Curso -----------");
        System.out.println("Titulo ..:");
        setTitulo(sc.nextLine());

        System.out.println("Objetivo ..:");
        setObjetivo(sc.nextLine());

        System.out.println("Publico ..:");
        setPublico(sc.nextLine());

        System.out.println("Duração ..:");
        setDuracao(Integer.parseInt(sc.nextLine()));
        //setDuracao(sc.nextInt());

        System.out.println("Situacao ..:");
        setSituacao(Integer.parseInt(sc.nextLine()));

    }

    /**
     * Metodo Imprimir
     */
    public void imprimir(){
        System.out.println("=============================================================");
        System.out.println("Titulo ......." + getTitulo());
        System.out.println("Objetivo ....." + getObjetivo());
        System.out.println("Publico Alvo ." + getPublico());
        System.out.println("Duração ......" + getDuracao());
        System.out.println("Situação ....." + getSituacao());
    }


}
