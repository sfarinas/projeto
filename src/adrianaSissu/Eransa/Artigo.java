package adrianaSissu.Eransa;

import java.util.Scanner;
public class Artigo extends Submissao{
    /**
     * ATRIBUTOS
     */
    String resumo, ResumoIngles, arquivo;

    /**
     * SET
     * @param r,ri,a
     */

    public void setResumo(String r){resumo = r;}
    public void setResumoIngles(String ri){ResumoIngles = ri;}
    public void setArquivo(String a){arquivo = a;}

    /**
     *
     * @return
     */
    public String getResumo(){return resumo;}
    public String getResumoIngles(){return ResumoIngles;}
    public String getArquivo(){return arquivo;}

    /**
     * ENTRADA DE DADOS
     */
    public void entradaDeDados(){
        Scanner sc = new Scanner(System.in);

        super.entradaDeDados();
        System.out.println("Digite o resumo do Artigo txt..: ");
        setResumo(sc.nextLine());
        System.out.println("Digite o Abstract txt..:");
        setResumoIngles(sc.nextLine());
        System.out.println("Qual o Arquivo txt..:");
        setArquivo(sc.nextLine());
    }

    /**
     * IMPRIMIR.
     */
    public void imprimir(){
        super.imprimir();
        System.out.println("Resumo ....:" + getResumo());
        System.out.println("Abstract ..:" + getResumoIngles());
        System.out.println("Arquivo ...:" + getArquivo());
    }
}
