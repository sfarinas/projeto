package adrianaSissu.vetor;
import java.util.Scanner;
public class Disciplina {
    private String nome;
    private String semestre;
    private double media;

    public void setNome(String n){
        if (n.isEmpty()){
            this.nome = n;
        }
    }
    public String getNome(){ return nome; }

    public void setSemestre(String s){
        if (s.isEmpty()){
            this.semestre = s;
        }
    }
    public String getSemestre(){ return semestre; }

    public void setMedia(double m){
        if (m >= 0 && m <= 10){
            this.media = m;
        }
    }
    public double getMedia(){ return media; }


}
