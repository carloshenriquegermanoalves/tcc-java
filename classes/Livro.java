package classes;

public class Livro{

    private String titulo;
    private String autor;
    private String genero;
    private int paginas;


    Livro(String titulo, String autor, String genero, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String tituloCorrigido){
        this.titulo = tituloCorrigido;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autorCorrigido){
        this.autor = autorCorrigido;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String generoCorrigido){
        this.genero = generoCorrigido;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public void setPaginas(int quantidadePaginasCorrigida){
        this.paginas = quantidadePaginasCorrigida;
    }

}