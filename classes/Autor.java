package classes;

public class Autor {
    
    private String nome;
    private String sexo;

    Autor(String nome, String sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nomeCorrigido){
        this.nome = nomeCorrigido;
    }

    public String getSexo(){
        return this.sexo;
    }

    public void setSexo(String sexoCorrigido){
        this.sexo = sexoCorrigido;
    }

}
