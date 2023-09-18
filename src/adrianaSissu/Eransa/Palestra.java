package adrianaSissu.Eransa;

import java.util.Scanner;
public class Palestra extends Submissao{
    String  objetivo, resumo, curriculo;

    public void setObjetivo(String o){
        objetivo = o;
    }
    public void setResumo(String r){
        resumo = r;
    }
    public void setCurriculo(String c){
        curriculo = c;
    }

    public String getObjetivo(){
        return objetivo;
    }
    public String getResumo(){
        return resumo;
    }
    public String getCurriculo(){
        return curriculo;
    }

    /**
     * ENTRADA DE DADOS
     */
    public void entradaDeDados(){
        Scanner sc = new Scanner(System.in);
        super.entradaDeDados();
        System.out.println("Digite o Objetivo da Palestra txt...");
        setObjetivo(sc.nextLine());
        System.out.println("Digite o Resumo da Palestra txt..");
        setResumo(sc.nextLine());
        System.out.println("Digite o Curriculo da Palestra txt..");
        setCurriculo(sc.nextLine());
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Objetivo ..." + getObjetivo());
        System.out.println("Resumo ....." + getResumo());
        System.out.println("Curriculo .." + getCurriculo());
    }

}
