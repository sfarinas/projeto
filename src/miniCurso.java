public class miniCurso {
    // Atributos
    String titulo, objetivo, publico;
    int duracao, situacao;

    //metodos.
    public void setTitulo(String t){
        titulo = t;
    }
    public void setObjetivo(String o){
        objetivo = o;
    }
    public void setPublico(String p){
        publico = p;
    }
    public void setDuracao(int d){
        duracao = d;
    }
    public void setSituacao(int s){
        situacao = s;
    }
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


}
