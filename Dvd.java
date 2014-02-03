package BibliotecaJava;

public class Dvd extends Material{
    private String autores;
    private int ano;
    private int regiao;
    
    public String getAutores(){
        return autores;
    }
    public int getAno(){
        return ano;
    }
    public int getRegiao(){
        return regiao;
    }
    public Dvd (int codigo, String titulo, String autores, int ano, int regiao){
        super(codigo,titulo,"DVD");
        this.ano=ano;
        this.autores=autores;
        this.regiao=regiao;
    }
}
