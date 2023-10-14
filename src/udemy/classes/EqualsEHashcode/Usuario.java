package udemy.classes.EqualsEHashcode;

public class Usuario {
    String nome;
    String senha;

    @Override
    public boolean equals(Object objecto) {

        if (objecto instanceof Usuario){
            Usuario outro = (Usuario) objecto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean senhaIgual = outro.senha.equals(this.senha);

            return nomeIgual && senhaIgual;
        }else {
            return false;
        }
    }
}
